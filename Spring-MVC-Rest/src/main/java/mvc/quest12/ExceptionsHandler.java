package mvc.quest12;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionsHandler {
	@ExceptionHandler(value=LowBalanceException.class)
	public ModelAndView lowBalance() {
		ModelAndView mv= new ModelAndView("Quest12/result");
		mv.addObject("msg", "Balance is low");
		return mv;
	}
	
	@ExceptionHandler(value=AccountNotFoundException.class)
	public ModelAndView noAccount() {
		ModelAndView mv= new ModelAndView("Quest12/result");
		mv.addObject("msg", "Account not found!! Enter correct Id");
		return mv;
	}
	
}
