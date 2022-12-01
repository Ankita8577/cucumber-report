package com.example.walletapp;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = {"com.example.walletapp"})

public class Runner {

}
