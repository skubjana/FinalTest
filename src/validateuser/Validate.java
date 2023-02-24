/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validateuser;

/**
 *
 * @author skubjana
 */
public class Validate {

public String User;
public String Pass;

    public boolean RegisterUsername(String User) {
       
        boolean result;
        
        if(User.length() > 5 && User.contains("_")){
            System.out.println("Username is validated!!!!"); 
            result = true;
        }
               
       else {
            System.out.println("Password must contain more than 8 characters, "
                    + "and an exclamation mark(!)");
            result = false;
        }
        
        return result;

    }
    
    public void RegisterPassword(String Pass) {
       
        if(Pass.length() > 8 && Pass.contains("!")){
            System.out.println("Password is validated!!!!"); 
        }
               
       else {
            System.out.println("Password must contain more than 8 characters, "
                    + "and an exclamation mark(!)");
        }

    }

  /*  public void LoginUser(String lUser, String lPassword) {
        
        System.out.print("Enter Username: ");
        lUser = uc.next();

        System.out.print("Enter Pasword: ");
        lPassword = uc.next();
        
        if (lUser.equals(Username) && lPassword.equals(password)) {
            
            System.out.println("Hello " + lUser + ", you have successfully signed in!!!");
        }
        else
        {
            System.out.println("Username or Password not correct!!!");
        }
    }*/

}
