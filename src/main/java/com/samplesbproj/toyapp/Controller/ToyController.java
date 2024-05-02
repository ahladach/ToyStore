package com.samplesbproj.toyapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samplesbproj.toyapp.Service.ToyService;
import com.samplesbproj.toyapp.entity.Toy;

@RestController
public class ToyController {
	
	@Autowired
	public ToyService service;
	
	@PostMapping("/addtoy")
	public Toy addToy(@RequestBody Toy toy) {
		return service.addToy(toy);
	}
	
	@GetMapping("/gettoy/{toyid}")
	public Toy gettoy(@PathVariable int toyid) {
		return service.gettoy(toyid);
	}
	
	@GetMapping("/gettoys")
	public List<Toy> gettoys() {
		return service.getalltoys();
	}
	
	@PutMapping("/updateprice/{toyid}")
	public Toy updateprice(@RequestBody Toy toy) {
		return service.updateprice(toy);
	}
	
	@DeleteMapping("/deletetoy/{toyid}")
	public String deletetoy(@PathVariable int toyid) {
		service.deletetoy(toyid);
		return "The toy has been successfully deleted";
	}
	
}
