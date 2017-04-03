/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hsuatdsu.smartHospital.BL;

import org.hsuatdsu.smartHospital.BO.User;
import org.hsuatdsu.smartHospital.DAL.Prescription_DAO;

/**
 *
 * @author Abdul Sattar
 */
public class PrescriptionHandler {
    public void prescription(User user){
    Prescription_DAO p = new Prescription_DAO();
    p.prescription(user);
    }

    
}
