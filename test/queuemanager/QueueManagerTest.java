/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package queuemanager;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class QueueManagerTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public QueueManagerTest() {
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
     * Test of main method, of class QueueManager.
     */
    @Test
    public void testMain() {
        
      InputStream stdin = System.in;
      System.setIn(new ByteArrayInputStream("sa".getBytes()));

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream ps = new PrintStream(byteArrayOutputStream);
      PrintStream stdout = System.out;
      System.setOut(ps);
      
//      System.out.println("main");
      String[] args = null;
      QueueManager.main(args);
      
      System.setIn(stdin);
      System.setOut(stdout);
      
      String outputText = byteArrayOutputStream.toString();
//      String key = "output:";
//      String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
//      Assert.assertEquals(output, "7");

         
      
      // TODO review the generated test code and remove the default call to fail.

      assertEquals("Using a sorted array.", outputText);
    }
    
}
