/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hsuatdsu.smartHospital.DAL;


import java.io.BufferedWriter;
import java.io.FileWriter;
import org.hsuatdsu.smartHospital.BO.User;
import java.util.*;

/**
 *
 * @author Abdul Sattar
 */
public class SignUp_DAO_Patient {
    
    
    Formatter x = new Formatter();
    public void signUp(User user){
      
        
        try{
          x = new Formatter(user.getName()+".txt");
        }
      
        catch(Exception ex){
          System.out.println("file not created");
      
        }
      
        x.format(("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n"), user.getID(), user.getName(), user.getPassword(), user.getCP(), user.getGender(), user.getAge(), user.getAddress(), user.getPhoneNumber(), user.getEmail());
        
        x.close();
        
        try{
        String filename = null;
        filename = "patient.txt";
        FileWriter fw = new FileWriter(filename,true);
        BufferedWriter bw = new BufferedWriter (fw);
        bw.newLine();
        bw.write(user.getUsername());
        bw.newLine();
        bw.write(user.getPassword());
        bw.newLine();
        bw.write(user.getName());
        bw.close();
        }
        catch(Exception ex){
            
        }
        try{
        FileWriter fwr = new FileWriter("ListPatient.txt",true);
        BufferedWriter bwr = new BufferedWriter(fwr);
        bwr.write(user.getName());
        bwr.newLine();
        bwr.close();
        }
        catch(Exception ex){
            
        }
    }
}

    /*public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
