 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hsuatdsu.smartHospital.DAL;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.hsuatdsu.smartHospital.BO.User;
import org.hsuatdsu.smartHospital.Constant.Constants;

/**
 *
 * @author Umair
 */
public class Login_DAO 
{
 public void authenticeLogin(User user)
 {
     // opening file and reading the text
     FileReader fr = null ;
    try{
        if(user.getType() == "Doctor")
        {
            fr = new FileReader("doctor.txt");
        }
        else if(user.getType() == "Patient")
        {
            fr = new FileReader("patient.txt");
        }
        else if(user.getType() == "Admin")
        {
            fr = new FileReader("Admin.txt");
            
        }
        BufferedReader userbuffreader = new BufferedReader(fr);
        Integer UserCount = Integer.parseInt(userbuffreader.readLine());
        String name;
        for(int i = 0 ; i<UserCount ; i++)
        {
            
            String uname = userbuffreader.readLine();
            String pwd = userbuffreader.readLine();
            name = userbuffreader.readLine();
            if(uname.equals(user.getUsername()) && pwd.equals(user.getPassword()))
            {
                user.setName(name);
                break;
            }
        }
        Constants.userName = user.getName();
        
    }
    catch(FileNotFoundException ex){
        System.err.println("file not found");
    } catch(Exception ex){
         
    }
    
     
     
     
 }   

  
}
