package poc.basic.react.DlitheBootcampBasicPoc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poc.basic.react.DlitheBootcampBasicPoc.entity.Corporate;
import poc.basic.react.DlitheBootcampBasicPoc.service.CorporateService;

@RestController
@RequestMapping("/rest")
//inform the backend and accept the request from url of react
@CrossOrigin(origins = "http://localhost:3000")
public class APIController {
	@Autowired
	CorporateService service;
	
	@GetMapping("/")
	public String xyz() {
		return "im alive";
	}
	
	// /rest/new
	// infosys has successfully inserted
	@PostMapping("/new")
	public String happy(@RequestBody Corporate corp) {
		
		return service.addingNew(corp).getOrg()+ "has successfully inserted";
		
	}
	
	@GetMapping("/")
     public List<Corporate> hogan()
     {
    	 return service.readEverything();
     }
}
