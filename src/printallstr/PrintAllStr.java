/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printallstr;
import java.util.Scanner;

/**
 *
 * @author skubjana
 */
public class PrintAllStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner str = new Scanner(System.in);
        
        
        System.out.println("Enter house number: ");
        int code = str.nextInt();
        
        str.nextLine(); //Capture the whole line, then take the cursor to the next line
        
        System.out.println("Enter street name: ");
        String strname = str.nextLine();
        
        System.out.println("Enter city name: ");
        String cname = str.next();
        
        System.out.println("Enter area code: ");
        int acode = str.nextInt();
        
        System.out.println("Your address:\t" + code + " "+ strname + "\n\t\t" + cname + "\n\t\t" + acode);
        
    }
    
}
