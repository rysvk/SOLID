package com.oop.solid.srp;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.json.JSONArray;
import org.junit.Before;
import org.junit.Test;

public class UserAggregatorTest {
    private UserAggregator userAggregator;
    private String response;

    private void getResponse(){
        response = userAggregator.getUsersfromRestAPI();
    }

    @Before
    public void init() {
      userAggregator = new UserAggregator();
      getResponse();
    }

    @Test
    public void getUsersShouldNotBeEmpty(){
        assertNotEquals(response, null);
        assertNotEquals(response.length(),0);
    }

    @Test
    public void getUsersValidateUserCount(){
        JSONArray users = new JSONArray(response);
        assertEquals(200, users.length());
    }

    @Test
    public void saveToFileSuccess(){
        try{
            userAggregator.saveToFile();
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }
}
