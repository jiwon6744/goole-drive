package goole.drive.common;


import goole.drive.IndexcerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { IndexcerApplication.class })
public class CucumberSpingConfiguration {
    
}
