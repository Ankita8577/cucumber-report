package demo.example.amazon;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = {"demo.example.amazon"},publish = true)
public class Runner {

}
