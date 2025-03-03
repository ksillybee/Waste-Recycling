package com.enviro.assessment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.Entity.Waste;
import com.enviro.assessment.Service.WasteService;

@RestController
public class WasteController {
	
	@Autowired
	private WasteService wasteService;
	
	
	@PostMapping("/addWaste")
	public Waste addWaste(@RequestBody Waste waste)
	{
		return wasteService.createWaste(waste);
		
	}
	
	@PostMapping("/addWastes")
	public List<Waste> addWastes(@RequestBody List<Waste> wastes)
	{
		
		return wasteService.createWastes(wastes);
		
	}
	
	@GetMapping("/waste/{id}")
	public Waste getWasteById(@PathVariable int id)
	{
		return  wasteService.getWasteByID(id);
		
	}
	
	@GetMapping("/wastes")
	public List<Waste> getAllWates()
	{
		return wasteService.getWastes();
		
	}
	@PutMapping("/updatewaste")
	public Waste updateWaste(@RequestBody Waste waste)
	{
		
		return wasteService.updateWate(waste);
		
	}
	@DeleteMapping("/waste/{id}")
	public String deleteWaste(@PathVariable int id)
	{
		return wasteService.deleteWasteById(id);
		
		
	}
	
}
