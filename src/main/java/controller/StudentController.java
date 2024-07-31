package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import repository.StudentRepository;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepository stdRepo;
	
	 @RequestMapping(value="/ping", method=RequestMethod.GET)
	    @ResponseBody
	    public String healthCheck() {
	        return "This is working well";
	    }

}
