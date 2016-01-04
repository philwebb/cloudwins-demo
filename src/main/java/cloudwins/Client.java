package cloudwins;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Client {
	
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	@ManyToOne
	private Provider provider;

	Client() {
	}
	
	public Client(String name, Provider provider) {
		this.name = name;
		this.provider = provider;
	}
	
	public String getName() {
		return name;
	}
	
	public Provider getProvider() {
		return provider;
	}
	
}
