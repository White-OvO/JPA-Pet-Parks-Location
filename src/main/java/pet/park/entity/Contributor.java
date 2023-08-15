package pet.park.entity;


import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Contributor {
	
	// primary colum annotiaion
@Id
@GeneratedValue(strategy = Generationtype.Identity)
	private Long contributorId;
	private String contributorName;
	private String contributorEmail;
	// one to many realationship
	
	private Set<PetPark> petParks = new HashSet<>();
	

		
		
		
	}

