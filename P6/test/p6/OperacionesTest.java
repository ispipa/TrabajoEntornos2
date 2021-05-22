/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ispip
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumarPar method, of class Operaciones.
     */
       @Test
    public void testSumarPar() {
        System.out.println("sumarPar");
         Operaciones instance = new Operaciones();
        int a = 2;
        int b = 2;
        int resultado = instance.sumarPar(a, b);
        
        int expResult = 4;
        assertEquals(expResult, resultado);
        
    }
    @Test
    public void testSumarImpar() {
        System.out.println("sumarImpar");
         Operaciones instance = new Operaciones();
        int a = 3;
        int b = 2;
        int resultado = instance.sumarPar(a, b);
        
        int expResult = 6;
        assertEquals(expResult, resultado);  
    }

   
    @Test
    public void testSumarImparPositivo() {
        System.out.println("testSumarImparPositivo");
         Operaciones instance = new Operaciones();
        int a = -2;
        int b = -2;
        int resultado = instance.sumarPar(a, b);
        
        int expResult = -4;
        assertEquals(expResult, resultado);  
    }
   
    
   
     @Test
    public void testSumarNegativoPositivo() {
        System.out.println("testSumarNegativoPositivo");
         Operaciones instance = new Operaciones();
        int a = -3;
        int b = 2;
        int resultado = instance.sumarPar(a, b);
        
        int expResult = 0;
        assertEquals(expResult, resultado);  
    }
    /**
     * Test of mayor method, of class Operaciones.
     */
 
    @Test
    public void testMayor() {
        System.out.println("mayor");
         Operaciones instance = new Operaciones();
         
        int a = 0;
        int b = 2;
       int result = instance.mayor(a, b);
       
        int expResult = 0;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sumarVector method, of class Operaciones.
     */

    @Test
    public void testSumarVector() {
        System.out.println("sumarVector");
         Operaciones instance = new Operaciones();
         
        int[] numeros = {1,2,3,4};
        int result = instance.sumarVector(numeros);
        int expResult = 10;
     
        assertEquals(expResult, result);
       
    }
    
}