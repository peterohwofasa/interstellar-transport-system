package za.co.discovery.domain;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Planet {
	@Id
	private String plaentID;

	private String planetName;

	public Planet(String id, String name) {
		this.plaentID = id;
		this.planetName = name;
	}

	public String getPlanetID() {
		return plaentID;
	}

	public void setPlaentID(String plaentID) {
		this.plaentID = plaentID;
	}

	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}

	@Override
	public String toString() {
		return planetName;
	}

	public Planet() {

	}
}


