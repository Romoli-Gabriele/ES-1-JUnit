/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gabbo
 */
public class TriangoloTest {
    
    public TriangoloTest() {
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
     * Test of getPerimetro method, of class Triangolo.
     */
    @Test
    public void testGetPerimetro() {
      System.out.println("perimetro");
        Triangolo instance = new Triangolo(4.0,5.0,3.0);
        double expResult = 12.0;
        double result = instance.getPerimetro();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getArea method, of class Triangolo.
     */
    @Test
    public void testGetArea() {
       System.out.println("area");
        Triangolo instance = new Triangolo(4.0,5.0,3.0);
        double expResult = 6.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
    }
     /**
     * Test of getArea method, of class Triangolo.
     */
    @Test
    public void testGetType() {
       System.out.println("tipo");
        Triangolo instance = new Triangolo(4.0,5.0,3.0);
        String expResult = "rettangolo";
        String result = instance.getType();
        assertEquals(expResult, result);
       
    }
}
