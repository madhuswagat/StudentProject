package controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	public String welcome(Map<String, Object> model) {
		model.put("message",this.message);
		return "welcome";
	}

}
