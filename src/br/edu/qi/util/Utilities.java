/*
 * The MIT License
 *
 * Copyright 2019 Brian & Willian.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package br.edu.qi.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 *
 * @author Brian & Willian
 * @since 10/06/2019 - 03:20:47
 * @version 1.0
 */
public class Utilities {
    
    private static final DecimalFormat DECIMAL_FORMAT_BRL = new DecimalFormat("R$ #,##0.00");

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public static String formatToBRL(double value) {
        return DECIMAL_FORMAT_BRL.format(value);
    }
    
    public static LocalDate getDate() {
        return LocalDate.now();
    }
    
    public static boolean validateName(String string) {
        return string.matches("^[\\p{L}]{2,20}( [\\p{L}]{2,20}){0,3}$");
    }
    
    public static boolean validatePrice(String string) {
        return string.matches("^[\\d]{1,3}(\\,[\\d]{1,2})?$");
    }
    
    public static boolean validateBigTexts(String string) {
        return string.matches("^[(\\p{L}) \\d\\.\\,\\/$]{2,100}$");
    }
    
    public static boolean validatePhoneNumber(String string) {
        return string.matches("^\\([\\d]{2}\\)[\\d]{4}-[\\d]{4,5}$");
    }
    
    public static String convertCommaToDot(String string) {
        return string.replace(',', '.');
    }
    
    public static String convertDotToComma(String string) {
        return string.replace('.', ',');
    }
    
    public static String convertPhoneNumberToOnlyNumber(String phoneNumber) {
        return phoneNumber.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", "");
    }
}
