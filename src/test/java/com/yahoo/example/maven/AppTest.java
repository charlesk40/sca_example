package com.yahoo.example.maven;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.yahoo.example.maven.App;

public class AppTest {

    @Test
    public void testApp() throws Exception {
        
        App app = new App();
        Assert.assertNotNull(app);
        
        String expected = "hi";
        String actual = App.helloWorld(expected);
        Assert.assertEquals(actual, expected);
        
        actual = App.helloWorldv2(expected);
        Assert.assertEquals(actual, "v2:" + expected);
    }
}
