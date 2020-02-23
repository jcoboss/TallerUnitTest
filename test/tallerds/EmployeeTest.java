/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerds;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josue
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cs method, of class Employee.
     */
    @Test
    public void testCsWorker() {
        System.out.println("cs");
        Employee instance = new Employee(50,"USD",100,EmployeeType.Worker);
        float expResult = 50.0f;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testCsSupervisor() {
        System.out.println("cs");
        Employee instance = new Employee(50,"USD",100,EmployeeType.Supervisor);
        float expResult = 85f;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testCsManager() {
        System.out.println("cs");
        Employee instance = new Employee(50,"USD",100,EmployeeType.Manager);
        float expResult = 120f;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    


    
}
