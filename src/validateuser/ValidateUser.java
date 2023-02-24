/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validateuser;
import java.util.Scanner;
/**
 *
 * @author skubjana
 */
public class ValidateUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Validate va = new Validate();
        
        Scanner uc = new Scanner(System.in);
        
        System.out.print("Enter Username: ");
        va.User = uc.next();
        
        System.out.print("Enter password: ");
        va.Pass = uc.next();
        
        va.RegisterUsername(va.User);
        
        va.RegisterPassword(va.Pass);
    }
    
}
