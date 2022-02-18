package com.justlife.step_definitions;

import com.justlife.utilities.BrowserUtils;
import com.justlife.utilities.ConfigurationReader;
import com.justlife.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
