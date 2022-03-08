package dev.newrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Controller {
	
	private final RegisterRepository repository;
	Controller(RegisterRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/show")
	public Register getRegister() {
		System.out.println("GET IT!");
		return null;
	}
	

	@PostMapping(path="/save", consumes = "application/json", produces = "application/json")
	public Register create(@RequestBody Register newRegister){
		System.out.println("------------");
		System.out.println(newRegister);
		return newRegister;
	}
}
