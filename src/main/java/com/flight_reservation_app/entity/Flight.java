package com.flight_reservation_app.entity;

import java.sql.Timestamp;
import java.util.Date;


import jakarta.persistence.Entity;

@Entity
public class Flight extends AbstractEntity {
	private String flightNumber;
	private String operatingAirlines;
	private String departutreCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Timestamp estimatedDepartutreTime;

	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}
	public String getDepartutreCity() {
		return departutreCity;
	}
	public void setDepartutreCity(String departutreCity) {
		this.departutreCity = departutreCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimatedDepartutreTime() {
		return estimatedDepartutreTime;
	}
	public void setEstimatedDepartureTime(Timestamp estimatedDepartutreTime) {
		this.estimatedDepartutreTime = estimatedDepartutreTime;
	}

}
