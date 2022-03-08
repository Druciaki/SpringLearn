package dev.newrest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Register {
	private @Id @GeneratedValue Long id;
	private float temperature;
	private float umidity; 
	
	// TODO - Adicionar Data e hora
	/* 
	public Register() {
		System.out.println("- vazio -");
	}
	
	public Register(float temperature, float umidity) {
		System.out.println("- dois args -");
		this.temperature = temperature;
		this.umidity = umidity;
	}
	
	public Register(Long id, float temperature, float umidity) {
		System.out.println("- tres args -");
		this.id = id;
		this.temperature = temperature;
		this.umidity = umidity;
	}
	
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
    @GeneratedValue()
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
	
	public float getTemperature() {
		return temperature;
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	
	public float getUmidity() {
		return umidity;
	}
	
	public void setUmidity(float umidity) {
		this.umidity = umidity;
	}
	*/
	
	
}
