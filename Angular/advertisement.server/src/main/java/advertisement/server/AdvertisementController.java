package advertisement.server;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdvertisementController {
	
	@Autowired
	AdvertisementRepository advRepo;
	
	@RequestMapping(value="/advertisement", method=RequestMethod.POST)
	public void add(@RequestBody Advertisement adv) {
		System.out.println(adv);
		advRepo.save(adv);
	}
	
	@RequestMapping(value="/advertisement/{id}", method=RequestMethod.GET)
	public Advertisement get(@PathVariable("id") int id) {
		return advRepo.findById(id).get();
	}
	
	@RequestMapping(value="/advertisement/{id}")
	public void delete(@PathVariable("id") int id) {
		advRepo.deleteById(id);
	}
	
	@RequestMapping(value="/advertisement")
	public List<Advertisement> getAll(){
		List<Advertisement> list= new ArrayList<>();
		advRepo.findAll().forEach(list::add);
		return list;
	}
	
	@RequestMapping(value="/advertisement/{id}", method=RequestMethod.PUT)
	public void update(@PathVariable("id") int id, @RequestBody Advertisement adv) {
		advRepo.save(adv);
	}

}
