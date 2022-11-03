package goole.drive.common;


import goole.drive.NotificationApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotificationApplication.class })
public class CucumberSpingConfiguration {
    
}
