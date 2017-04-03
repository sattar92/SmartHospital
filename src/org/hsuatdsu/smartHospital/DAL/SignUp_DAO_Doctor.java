/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hsuatdsu.smartHospital.DAL;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Formatter;
import org.hsuatdsu.smartHospital.BO.User;

/**
 *
 * @author Abdul Sattar
 */
public class SignUp_DAO_Doctor {
 
    Formatter x = new Formatter();
    
    public void signUp(User user){
        
        try{
          x = new Formatter(user.getDocName()+".txt");
        }
      
        catch(Exception ex){
          System.out.println("file not created");
      
        }
      
        x.format(("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n"), user.getDID(), user.getDocName(), user.getPassword(), user.getCP(),user.getSpeciality(), user.getGender(), user.getAge(), user.getAddress(), user.getPhoneNumber(), user.getEmail());
        
        x.close();
        
        try{
            String filename = null;
            filename = "doctor.txt";
            FileWriter fw = new FileWriter(filename,true);
            BufferedWriter bw = new BufferedWriter (fw);
            bw.newLine();
            bw.write(user.getUsername());
            bw.newLine();
            bw.write(user.getPassword());
            bw.newLine();
            bw.write(user.getDocName());
            bw.close();
        }      
        catch(Exception ex){
            
        }
        try{
        FileWriter fwr = new FileWriter("ListDoctor.txt",true);
        BufferedWriter bwr = new BufferedWriter(fwr);
        bwr.write("Dr. "+user.getDocName());
        bwr.newLine();
        bwr.close();
        }
        catch(Exception ex){
            
        }
    }
}
