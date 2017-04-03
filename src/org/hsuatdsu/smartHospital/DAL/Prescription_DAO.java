/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hsuatdsu.smartHospital.DAL;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.hsuatdsu.smartHospital.BO.User;
import org.hsuatdsu.smartHospital.Constant.Constants;

/**
 *
 * @author Abdul Sattar
 */
public class Prescription_DAO {
    FileWriter fw ;
    BufferedWriter bw;
    public void prescription(User user){
        try 
        {
            fw = new FileWriter(user.getName()+"_prescription.txt",true);
            try
            {
                bw = new BufferedWriter(fw);
                bw.write(user.getDocName());
                bw.newLine();
                bw.write(user.getDate());
                bw.newLine();
                bw.write(user.getMedicine());
                bw.newLine();
                bw.write(user.getDuration());
                bw.newLine();
                bw.write(user.gettime());
                bw.newLine();
                
                bw.close();
            }
            catch(Exception e)
            {
                //System.out.println("bvghvh");
            }
        }
        catch (IOException ex) {
           // Logger.getLogger(Prescription_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void Prescription(User user) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
