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

package br.edu.qi.dao;

/**
 *
 * @author Brian & Willian
 * @since 07/06/2019 - 18:20:56
 * @version 1.0
 */
public class DAOFactory {
    private static final ClientDAO CLIENT_DAO = new ClientDAO();
    private static final BurgerDAO BURGER_DAO = new BurgerDAO();
    private static final OrderDAO ORDER_DAO = new OrderDAO();
    private static final OrderListDAO ORDER_LIST_DAO = new OrderListDAO();

    public static ClientDAO getClientDAO() {
        return CLIENT_DAO;
    }
    
    public static BurgerDAO getBurgerDAO() {
        return BURGER_DAO;
    }

    public static OrderDAO getOrderDAO() {
        return ORDER_DAO;
    }

    public static OrderListDAO getOrderListDAO() {
        return ORDER_LIST_DAO;
    }
    
    
    
}
