/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hsuatdsu.smartHospital.Controller;


import org.hsuatdsu.smartHospital.BL.AppointmentDateHandler;
import org.hsuatdsu.smartHospital.BL.LoginHandler;
import org.hsuatdsu.smartHospital.BL.PrescriptionHandler;
import org.hsuatdsu.smartHospital.BL.signUpHandler;
import org.hsuatdsu.smartHospital.BO.User;
import org.hsuatdsu.smartHospital.Constant.Constants;

/**
 *
 * @author Umair
 */
public class Controller {
    //private User User;
    

    /**
     *
     * @param action
     * @param param
     * @return
     */
    public Object[] processRequest(int action , Object[] param)
    {
        Object[] returnObject=null;
        switch(action)
        {
            case Constants.loginAction: returnObject= authenticateLogin(param); 
                break;
            case Constants.appointmentAction: returnObject= appointmentDate(param); 
                break;
            case Constants.signUpAction: returnObject = signUp(param);
                break;
            case Constants.prescriptionAction: returnObject = prescription(param);
        }
        
        return returnObject;
    }
    
    private Object [] authenticateLogin(Object[] param)
    {
         Object[] returnObject=null;
         String username=(String)param[0];
         String password= new String ((char[])param[1]);
         String type = (String) param[2]; 
         User user = new User(username,password,type);
         LoginHandler lHandler=new LoginHandler();
         lHandler.authenticeLogin(user);
         if(user.getName() != null && !user.getName().equals("")) // verification successfull
         {
             returnObject=new Object[3];
             returnObject[0]=user;
         }
         return returnObject;
    }
    
    private Object [] appointmentDate(Object [] param)
    {
         Object[] returnObject=null;
         String day=(String)param[0];
         String month=(String)(param[1]);
         String year=(String)(param[2]);
         User user;
         user = new User(day,month,year,0);
         AppointmentDateHandler ADHandler = new AppointmentDateHandler();
         ADHandler.appointmentDate(user);
         return returnObject;
    }
    
    private Object [] signUp(Object [] param)
    {
        User user = null;
         Object[] returnObject=null;
         String UserName=(String)param[0];
         String Name = (String)param[1];
         String password= new String ((char[])param[2]);
         String ConfirmPassword = new String ((char[])param[3]);
         int ID= (int)param[4];
         String Gender =(String)param[5];
         String Age = (String)param[6];
         String Address = (String) param[7];
         String Phone = (String) param[8];
         String Email = (String) param[9];
         
         if(Constants.Form == "Doctor")
         {  
            String Speciality = (String) param[10];
            user = new User(UserName,Name,password,ConfirmPassword,ID,Gender,Age,Address,Phone,Email,Speciality);  
         }
         else if(Constants.Form == "Patient")
         {
            user = new User(UserName,Name,password,ConfirmPassword,ID,Gender,Age,Address,Phone,Email);
         }
         signUpHandler Handler=new signUpHandler();
         Handler.signUp(user);
         
         return returnObject;
    }
    private Object[] prescription(Object [] param)
    {
        Object[] returnObject = null;
        String Date =  (String) (param[0]);
        String DocName = (String)param[1];
        String Name = (String) param[2];
        String Medicine = (String) param[3];
        String duration = (String) param[4];
        String time = (String) param[5];
        
        User user = new User(Date,DocName,Name,Medicine,duration,time);
        PrescriptionHandler Handler = new PrescriptionHandler();
        Handler.prescription(user);
        returnObject = new Object[1];
        returnObject[0] = user;
        return returnObject;
    }
}
