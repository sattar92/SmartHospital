/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hsuatdsu.smartHospital.BL;

import org.hsuatdsu.smartHospital.BO.User;
import org.hsuatdsu.smartHospital.Constant.Constants;
import org.hsuatdsu.smartHospital.DAL.SignUp_DAO_Doctor;
import org.hsuatdsu.smartHospital.DAL.SignUp_DAO_Patient;

/**
 *
 * @author Abdul Sattar
 */
public class signUpHandler {
    public void signUp(User user){
        if(Constants.Form.equals("Patient"))
        {
            SignUp_DAO_Patient su = new SignUp_DAO_Patient();
            su.signUp(user);
        }
        else if(Constants.Form.equals("Doctor"))
        {
            SignUp_DAO_Doctor su = new SignUp_DAO_Doctor();
            su.signUp(user);
        }
    }
}
