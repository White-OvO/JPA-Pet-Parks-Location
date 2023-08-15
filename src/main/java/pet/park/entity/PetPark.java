package pet.park.entity;



import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Entity;
import lombok.Data;




@Entity
@Data

public class PetPark {
	private Long petParkId;
	private String parkName;
	private String directions;
	private String stateOrProvince;
	private String country;
	
	private GeoLocation geoLocation;
	
	private Contributor contributor;
	
	private Set<Amenity> amentities = new HashSet<>();
	
	
}
