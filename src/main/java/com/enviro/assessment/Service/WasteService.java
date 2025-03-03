package com.enviro.assessment.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enviro.assessment.Dao.WasteRepository;
import com.enviro.assessment.Entity.Waste;

@Service
public class WasteService {
	
	@Autowired
 private WasteRepository repository;
	
	public Waste createWaste(Waste waste)
	{
		return repository.save(waste);
		
	}
	
	public List<Waste> createWastes(List<Waste> wastes)
	{
		return repository.saveAll(wastes);
		
	}
	
	public Waste getWasteByID(int id)
	{
		
		return repository.findById(id).orElse(null);
		
	}
	
	public List<Waste> getWastes()
	{
		
		return repository.findAll();
		
	}
	
	
	public Waste updateWate(Waste waste)
	{
		
		Waste oldUser=null;
	
		Optional<Waste> optionaluser=repository.findById(waste.getId());
		if(optionaluser.isPresent())
		{
			
			oldUser=optionaluser.get();
			oldUser.setWasteNames(waste.getWasteNames());
			oldUser.setCatergory(waste.getCatergory());
			
			repository.save(oldUser);
		}else {
			
			return new Waste();
		}
				
		return oldUser;
		
	}
	
	public String deleteWasteById(int id)
	{
		repository.deleteById(id);
		return "Waste Got Deleted";
		
		
	}


}
