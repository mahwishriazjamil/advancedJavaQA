/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riazjamil.mahwish.tests;

import java.util.List;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import riazjamil.mahwish.math.SimpleCalculator;

/**
 *
 * @author Administrator
 */
public class SimpleCalculatorTest {

    public SimpleCalculatorTest() {
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
    
    @Test
    public void testAdd(){
        int expectedResult = 8;
        int actualResult = riazjamil.mahwish.math.SimpleCalculator.add(3,5);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testMultiply(){
        int expectedResult = 16;
        int actualResult = riazjamil.mahwish.math.SimpleCalculator.multiply(8,2);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testDivide(){
        int expectedResult = 24;
        int actualResult = riazjamil.mahwish.math.SimpleCalculator.divide(48,2);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testSubtract(){
        int expectedResult = 98;
        int actualResult = riazjamil.mahwish.math.SimpleCalculator.subtract(108,10);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void initialBasketIsEmpty(){
        int expectedTotal = 0;
        List<String> basket = SimpleCalculator.getBasket();
        assertEquals(expectedTotal, basket.size());
    }
}





































