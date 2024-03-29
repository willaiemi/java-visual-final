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

package br.edu.qi.model;

import java.text.DecimalFormat;

/**
 *
 * @author Brian & Willian
 * @since 07/06/2019 - 22:47
 * @version 1.0
 */
public class BurgerVO {
    private long IDBurger;
    private String name;
    private String description;
    private double price;
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("R$ #0.00");

    public BurgerVO() {
    }
    
    /**
     * 
     * @param IDBurger Get the ID Burger
     * @param name Get the name of Burger
     * @param description Get description of burger
     * @param price Get the price
     */
    
    public BurgerVO(long IDBurger, String name, String description, double price) {
        this.IDBurger = IDBurger;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public BurgerVO(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public long getIDBurger() {
        return IDBurger;
    }

    public void setIDBurger(long IDBurger) {
        this.IDBurger = IDBurger;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + DECIMAL_FORMAT.format(price);
    }
    
    

}
