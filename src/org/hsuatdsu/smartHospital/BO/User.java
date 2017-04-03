/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hsuatdsu.smartHospital.BO;

import java.util.*;


/**
 *
 * @author Abdul Sattar
 */
public class User 
{
    private String Medicine;
    private String duration;
    private String time;
    private String username;
    private String password;
    private String Type;
    private String Name;
    private String date;
    private String ConfirmPassword;
    private int ID;
    private String Gender; 
    private String Age;
    private String Address;
    private String PhoneNumber;
    private String Email;
    private int DID;
    private String DocName;
    private String Specialization;


   // Login Use Case
   public User(String username, String password, String Type)
   {
       setUserName(username);
       setPassword(password);
       setType(Type);
   }

   // Appointment Use Case
   public User(String day, String month, String year, int i)
   {
       /*
       setDay(day);
       setMonth(month);
       setYear(year);*/
   }

   // SignUp Use Case for patient
   public User(String username, String Name, String Password, String ConfirmPassword, int ID, String Gender, String Age, String Address, String PhoneNumber, String Email)
   {
       setID(ID);
       setUserName(username);
       setName(Name);
       setPassword(Password);
       setCP(ConfirmPassword);
       setGender(Gender);
       setAge(Age);
       setAddress(Address);
       setPhoneNumber(PhoneNumber);
       setEmail(Email);      
   }
   // SignUp Use Case doctor
    public User(String username, String DocName, String Password, String ConfirmPassword, int DID, String Gender, String Age, String Address, String PhoneNumber, String Email, String Specialization)
   {
       setDID(DID);
       setUserName(username);
       setDocName(DocName);
       setPassword(Password);
       setCP(ConfirmPassword);
       setGender(Gender);
       setAge(Age);
       setAddress(Address);
       setPhoneNumber(PhoneNumber);
       setEmail(Email);    
       setSpeciality(Specialization);
   }
   //Prescription Use Case
   public User(String Date, String DocName, String Name , String Medicine , String duration , String time)
   {
       setDate(Date);
       setDocName(DocName);
       setName(Name);
       setMedicine(Medicine);
       setDuration(duration);
       setTime(time);
   }

   public void setTime(String time) // accessors
   {
       this.time = time;
   }

   public String gettime() // mutators
   {
       return time;
   }
   
   public void setDuration(String duration) // accessors
   {
       this.duration = duration;
   }

   public String getDuration() // mutators
   {
       return duration;
   }
   
   public void setMedicine(String Medicine) // accessors
   {
       this.Medicine = Medicine;
   }

   public String getMedicine() // mutators
   {
       return Medicine;
   }
   public void setSpeciality(String Specialization) // accessors
   {
       this.Specialization = Specialization;
   }

   public String getSpeciality() // mutators
   {
       return Specialization;
   }
   public void setType(String Type) // accessors
   {
       this.Type=Type;
   }

   public String getType() // mutators
   {
       return Type;
   }
   public void setUserName(String username) // accessors
   {
       this.username=username;
   }

   public String getUsername() // mutators
   {
       return username;
   }

   public void setPassword(String password) // accessors
   {
       this.password=password;
   }

   public String getPassword() // mutators
   {
       return password;
   }

   public void setName(String Name) // accessors
   {
       this.Name=Name;
   }

   public String getName() // mutators
   {
       return Name;
   }
 
   
   public void setDate(String date)
   {
       this.date=date;
   }

   public String getDate()
   {
       return date;
   }

   public void setCP(String ConfirmPassword)
   {
       this.ConfirmPassword = ConfirmPassword;
   }

   public String getCP()
   {
       return ConfirmPassword;
   }

   public void setID(int ID)
   {
       Random r1 = new Random();
       ID = r1.nextInt(9999);
       this.ID = ID;
   }
   public int getID()
   {
       return ID;
   }

   public void setGender(String Gender)
   {
       this.Gender = Gender;
   }

   public String getGender()
   {
       return Gender;
   }

   public void setAge(String Age)
   {
       this.Age = Age;
   }

   public String getAge()
   {
       return Age;
   }

   public void setAddress(String Address)
   {
       this.Address = Address;
   }

   public String getAddress()
   {
       return Address;
   }

   public void setPhoneNumber(String PhoneNumber)
   {
       this.PhoneNumber = PhoneNumber;
   }

   public String getPhoneNumber()
   {
       return PhoneNumber;
   }
   public void setEmail(String Email)
   {
       this.Email = Email;
   }

   public String getEmail()
   {
       return Email;
   }
   
   public void setDID(int DID)
   {
       this.DID = DID;
   }
   
   public int getDID()
   {
       return DID;
   }
   
   
   public void setDocName(String DocName)
   {
       this.DocName = DocName;
   }
   
   public String getDocName()
   {
       return DocName;
   }
   
}