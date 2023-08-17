package pet.park.entity;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class Contributor {
	
																	// primary colum annotiaion
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long contributorId;				// PRINT WILL COME OUT LIKE TIS contributor_id snake case
						


	private String contributorName;
	
	@Column(unique = true)
	private String contributorEmail;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToMany(mappedBy = "contributor", cascade = CascadeType.ALL)		// one to many realationship

															// a contributor is in common

	private Set<PetPark> petParks = new HashSet<>();	// a list of pet parks'
	

		
		
		
	}

