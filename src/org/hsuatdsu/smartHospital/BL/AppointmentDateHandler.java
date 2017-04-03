/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hsuatdsu.smartHospital.BL;

import org.hsuatdsu.smartHospital.BO.User;
import org.hsuatdsu.smartHospital.DAL.Appointment_DAO;

/**
 *
 * @author Abdul Sattar
 */
public class AppointmentDateHandler {
   public void appointmentDate(User user) 
  {      
        Appointment_DAO lDao = new Appointment_DAO();
        lDao.appointmentDate(user);
  }
}
