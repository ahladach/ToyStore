package com.samplesbproj.toyapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samplesbproj.toyapp.entity.Toy;
import com.samplesbproj.toyapp.repository.ToyRepository;

@Service
public class ToyService {
	
	@Autowired
	public ToyRepository toyrepo;
	
	//creating a new toy
	public Toy addToy(Toy toy) {
		return toyrepo.save(toy);
	}
	
	//getting details of specific toy
	public Toy gettoy(int toyid) {
		return toyrepo.findById(toyid).orElse(null);
	}
	
	//Retrieve all toys
	public List<Toy> getalltoys(){
		return toyrepo.findAll();
	}
	
	//Updating the prices of a toy
	public Toy updateprice(Toy toy) {
		Toy pt=toyrepo.findById(toy.getToyid()).orElse(null);
		pt.setToyname(toy.getToyname());
		pt.setToyprice(toy.getToyprice());
		pt.setToyquantity(toy.getToyquantity());
		return toyrepo.save(pt);
		
	}
	
	//Deleting a toy
	public void deletetoy(int toyid) {
		toyrepo.deleteById(toyid);
	}
}
