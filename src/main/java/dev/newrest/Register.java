package dev.newrest;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;
import java.time.LocalDateTime;


@Entity
@Table(name="Registers")
public class Register {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Long id;
	
	@Column(name = "temperature")
	private float temperature;
	@Column(name = "umidity")
	private float umidity; 
	@Column(name = "datetime")
	private Date datetime; 
	
	public Register() {}
	
	public Register(float temperature, float umidity) {
		this.temperature = temperature;
		this.umidity = umidity;
		this.datetime = new Date();
	}
	
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
	
	public Date getDatetime() {
		return datetime;
	}
	
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
	@Override
	public String toString() {
		return "Data:  Temperature:"+temperature+"   Umidity:"+umidity;
	}
	
	
}
