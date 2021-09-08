package za.co.discovery.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Route {

	@Id
	private Short routeID;

	@OneToOne
	@JoinColumn(name = "source")
	private Planet source;

	@OneToOne
	@JoinColumn(name = "destination")
	private Planet destination;

	private float distance;

	public Route(Short routeID, Planet source, Planet destination, float distance) {
		this.routeID = routeID;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
	}

	public Short getRouteID() {
		return routeID;
	}

	public void setRouteID(Short routeID) {
		this.routeID = routeID;
	}

	public Planet getSource() {
		return source;
	}

	public void setSource(Planet source) {
		this.source = source;
	}

	public Planet getDest() {
		return destination;
	}

	public void setDestination(Planet destination) {
		this.destination = destination;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public Route() {
	}
}