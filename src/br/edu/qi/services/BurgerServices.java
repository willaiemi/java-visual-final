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

package br.edu.qi.services;

import br.edu.qi.dao.BurgerDAO;
import br.edu.qi.dao.DAOFactory;
import br.edu.qi.model.BurgerVO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Brian & Willian
 * @since 08/06/2019 - 23:51:31
 * @version 1.0
 */
public class BurgerServices {
    
    public static final int ID_BURGER = 0;
    public static final int NAME = 1;
    public static final int DESCRIPTION = 2;
    public static final int PRICE = 3;
    
    private static final BurgerDAO BURGER_DAO = DAOFactory.getBurgerDAO();

    public long insertBurger(BurgerVO burgerVO) throws SQLException {
        return BURGER_DAO.insertBurger(burgerVO);
    }
    
    public ArrayList<BurgerVO> selectBurgers() throws SQLException {
        return BURGER_DAO.selectsBurgers();
    }
    
    public ArrayList<BurgerVO> selectBurgers(String query, int filter) throws SQLException {
        return BURGER_DAO.selectBurgers(query, filter);
    }
    
    public void updateBurger(BurgerVO burgerVO) throws SQLException {
        BURGER_DAO.updateBurger(burgerVO);
    }
    
    public void deleteBurger(long idBurger) throws SQLException {
        BURGER_DAO.deleteBurger(idBurger);
    }
}
