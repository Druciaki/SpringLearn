package dev.newrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class Controller {
	@Autowired
	private final RegisterRepository repository;
	
	Controller(RegisterRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/show")
	public List<Register> getRegister() {
		System.out.println("GET IT!");
		List<Register> data = new ArrayList<Register>();
		repository.findAll().forEach(register -> data.add(register));
		return data;
	}
	
	@PostMapping(path="/save", consumes = "application/json", produces = "application/json")
	public Register create(@RequestBody Register newRegister){
		System.out.println(newRegister);
		return repository.save(newRegister); 
	}
	
	@GetMapping("/clear")
	public List<Register> clearRegister() {
		List<Register> data = new ArrayList<Register>();
		repository.findAll().forEach(register -> repository.delete(register));
		repository.findAll().forEach(register -> data.add(register));
		return data;
	}
}
