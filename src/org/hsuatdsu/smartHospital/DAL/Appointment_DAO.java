/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hsuatdsu.smartHospital.DAL;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hsuatdsu.smartHospital.BO.User;
import static org.hsuatdsu.smartHospital.Constant.Constants.userName;

/**
 *
 * @author Umair Hanif
 */
public class Appointment_DAO {
    FileWriter fw;

    public void appointmentDate(User user){
      
        try {
            fw = new FileWriter(userName+".txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
           /* bw.write(user.getDay());
            bw.write(user.getMonth());
            bw.write(user.getYear());
            
           */
            bw.close();
            
        } catch (Exception ex) {
            
        }
       
    }
}
