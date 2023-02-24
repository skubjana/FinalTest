/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package validateuser;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author skubjana
 */
public class ValidateTest {
    Validate va = new Validate();
    
    public ValidateTest() {
    }

    /**
     * Test of RegisterUsername method, of class Validate.
     */
    @Test
    public void testRegisterUsername(String tName ) {
        tName = "James_";
        
        boolean usr = va.RegisterUsername(tName);
        
        assertEquals(true, usr);
        
    }

    /**
     * Test of RegisterPassword method, of class Validate.
     */
    @Test
    public void testRegisterPassword() {
        String tPass = "James";
        
        boolean pwd = va.RegisterUsername(tPass);
        
        assertEquals(true, pwd);

    }
    
}
