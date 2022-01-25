package poc.basic.react.DlitheBootcampBasicPoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poc.basic.react.DlitheBootcampBasicPoc.entity.Corporate;
import poc.basic.react.DlitheBootcampBasicPoc.repository.CorporateRepository;

@Service
public class CorporateService 
{
	@Autowired //get the instance/memory of the component
    CorporateRepository repo;
	
	public  Corporate addingNew(Corporate object) 
	{
		return repo.save(object) ; //pass the entity object that can be converted as record in the table
		
	}
	
	
}
