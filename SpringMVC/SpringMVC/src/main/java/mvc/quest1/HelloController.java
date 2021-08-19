package mvc.quest1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value= "/welcome")
	public ModelAndView helloWorld() {
		ModelAndView mav= new ModelAndView("HelloPage");
		mav.addObject("msg", "Hello World!!");
		return mav;
	}
	
}
