/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hsuatdsu.smartHospital.BL;

import org.hsuatdsu.smartHospital.BO.User;
import org.hsuatdsu.smartHospital.DAL.Login_DAO;

/**
 *
 * @author Umair
 */
public class LoginHandler 
{
 public void authenticeLogin(User user)
 {
     Login_DAO lDao=new Login_DAO();
     lDao.authenticeLogin(user);
 }
 

  
  
  
}
