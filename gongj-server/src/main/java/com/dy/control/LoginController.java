package com.dy.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/*@RestController*/
@SpringBootApplication
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("/index")
	public String index() {
		logger.debug("-------------index------------");
		return "index";
	}

	@RequestMapping("/home")
	public String toHome() {
		logger.debug("===111-------------home------------");
		return "home";
	}
    
}