package dev.newrest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Anotação
@Repository
// Interface
public interface RegisterRepository
	extends JpaRepository<Register, Long>{
	
}