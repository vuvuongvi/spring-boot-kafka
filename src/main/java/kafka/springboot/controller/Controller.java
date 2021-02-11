package kafka.springboot.controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@SpringBootApplication
public class Controller {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	  public String available() {
	    return "Spring in Action";
	  }
	@RequestMapping(value = "/policy", method = RequestMethod.POST)
	  public String importPolicy() {
		return "Start import";
	}
}
