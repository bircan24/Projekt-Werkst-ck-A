package de.frauas.version.Startseite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Startseite {
	
	@RequestMapping("/startseite")
	public @ResponseBody String startseite() {
		return "Herzlich Willkommen";
	}
	

}
