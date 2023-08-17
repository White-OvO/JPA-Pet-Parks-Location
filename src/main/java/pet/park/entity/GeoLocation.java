package pet.park.entity;

import java.math.BigDecimal;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
public class GeoLocation {
	private BigDecimal latitude;
	private BigDecimal longitude;
	//getters and setters will automatically populate
	// BIG decimal is like a double with alot of numbers
	public GeoLocation(GeoLocation geoLocation) {
		this.latitude = geoLocation.latitude;
		this.longitude = geoLocation.longitude;
	}
	
}
