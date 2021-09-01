package mvc.quest12;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankAccountController {
	@Autowired
	BankAccountService bankServ;
	
	@RequestMapping(value="/bankHome")
	public ModelAndView home() {
		return new ModelAndView("Quest12/home");
	}
	
	@RequestMapping(value="/transfer")
	public ModelAndView transfer() {
		return new ModelAndView("Quest12/transfer");
	}
	
	@RequestMapping(value="/balance")
	public ModelAndView balance() {
		return new ModelAndView("Quest12/balance");
	}
	
	@RequestMapping(value="/transferSubmit", method=RequestMethod.POST)
	public ModelAndView transferResult(@RequestParam Map<String, String> req) throws LowBalanceException, AccountNotFoundException {
		long fromid= Long.parseLong(req.get("fromacc"));
		long toid= Long.parseLong(req.get("toacc"));
		double amt= Double.parseDouble(req.get("amount"));
		bankServ.fundTransfer(fromid, toid, amt);
		ModelAndView mv= new ModelAndView("Quest12/result");
		mv.addObject("msg", "Transfer Success");
		return mv;
	}
	
	@RequestMapping(value="/balanceSubmit", method=RequestMethod.POST)
	public ModelAndView checkBalance(@RequestParam String accid) throws AccountNotFoundException {
		Long accId=Long.parseLong(accid);
		ModelAndView mv= new ModelAndView("Quest12/result");
		Double balance= bankServ.getBalance(accId);
		mv.addObject("msg", "Balance :"+balance);
		return mv;
	}
}
