/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jodielaurenson
 */
public class DatabaseTest {
    
    public DatabaseTest() {
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
     * Test of setUpConnection method, of class Database.
     */
    @Test
    public void testSetUpConnection() {
        System.out.println("setUpConnection");
        Database db = new Database();
        Connection result = db.setUpConnection();
        assertNotEquals("Connection successful",result,null);
        
        
    }

    
    
    @Test
    public void testSearchCity(){
        try{
            
            Database db = new Database();
            Connection con = db.setUpConnection();
            ResultSet result = db.runSearchCityP("MONTGOMERY"); //call procedure method with city "montgomery"
            
            int size =0;
            if (result != null) 
            {
              result.last();    // moves cursor to the last row
              size = result.getRow(); // get row id 
            }
            result.first();
            int providerCity[] = new int[size]; //create an array that will store the results
            
            int counter = 0;
            while(result.next()){
                    providerCity[counter] = result.getInt("providerID"); //add providerID to a position in the array
                    counter++;
            }
            assertEquals("Query run successfully - result 1 correct", providerCity[0],10023);
            assertEquals("Query run successfully - result 3 correct", providerCity[450],10149);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * Tests that the search address query successfully runs
     */
    @Test
    public void testSearchAddress(){
        try{
            int providerID[] = new int[98]; //create an array that will store the results
            Database db = new Database();
            Connection con = db.setUpConnection();
            ResultSet result = db.runSearchCityP("DATES DRIVE"); //call procedure method with city "montgomery"
            
            int counter = 0;
            while(result.next()){
                    providerID[counter] = result.getInt("providerID"); //add providerID to a position in the array
                    counter++;
            }
            assertNotEquals("Query run successfully", providerID[0],190025);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Test
    public void testSearchProcedure(){
        try{
            String providerCity[] = new String[934]; //create an array that will store the results
            String condition[] = new String[934];
            Database db = new Database();
            Connection con = db.setUpConnection();
            ResultSet result = db.runSearchConditionP("DYSEQUILIBRIUM"); //call procedure method 
            
            int counter = 0;
            while(result.next()){
                
                    condition[counter] = result.getString("DRG_Definition");
                    providerCity[counter] = result.getString("providerCity"); //add providerID to a position in the array
                    counter++;
            }
            
            assertEquals("Query run successfully - city 933 correct", "MILWAUKEE",providerCity[933]);
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    /**
     * locations[0] = new Location(48834,43.142,-85.049);
        locations[1] = new Location(55304,45.255,-93.287);
        * 697
     */
    @Test
    public void testRestrictPrice(){
        try{
            int providerID[] = new int[38]; //create an array that will store the results
            Database db = new Database();
            ResultSet result = db.runRestrictPriceP(3000, 3100); //call procedure method with a range between 3000 and 3100
            
            int counter = 0;
            while(result.next()){
                
                    providerID[counter] = result.getInt("providerID"); //add providerID to a position in the array
                    counter++;
            }
            
            assertEquals("Query run successfully", 10108,providerID[2]);
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * Tests that the database zipcodes are imported correctly and is sorted correctly
     */
    @Test
    public void testOrderDistance(){
        
        Database db = new Database();
        double[][] result = new double[3211][0];
        result = db.sortByDistance(1001);
        
        
        String closest = Double.toString(result[0][0]);
        assertEquals("Query run successfully","1104.0",closest);
        
    }
    
    
    @Test
    public void testCurrLocation(){
        try{
            int procedureID[] = new int[8]; //create an array that will store the results
            Database db = new Database();
            ResultSet result = db.runCurrLocationP(36301, "Heart"); //call procedure method with a range between 3000 and 3100

            int counter = 0;
            while(result.next()){

                    procedureID[counter] = result.getInt("procedureID"); //add providerID to a position in the array
                    counter++;
            }


            assertEquals("Query result 1 run successfully",61956,procedureID[0]);
            assertEquals("Query result 2 run successfully",71559,procedureID[1]);
            assertEquals("Query result 3 run successfully",74301,procedureID[2]);
        
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
