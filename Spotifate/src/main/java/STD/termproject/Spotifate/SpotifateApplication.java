package STD.termproject.Spotifate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
*@author Aaron
*@param Description SpotifateApplication is the main driver class for the Spotoifate application
*
*/

@SpringBootApplication
//@RestController
public class SpotifateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifateApplication.class, args);
	}
/*
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "Bitch") String name) {
		return String.format("Hello %s!", name);
	}
*/
	

}
