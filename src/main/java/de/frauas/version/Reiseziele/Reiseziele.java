package de.frauas.version.Reiseziele;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller


public class Reiseziele {

	@RequestMapping("/reiseziele")
	public @ResponseBody String reiseziel() {
		return "Die Top 10 Reiseziele" ;
	}
	

}


