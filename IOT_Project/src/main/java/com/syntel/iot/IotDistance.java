/**
 * This is a basic entity class designed to hold information regarding Exchange Value data.
 * This format is hence utilized in the data.sql file found under resources.
 * Through the Forex Spring Tutorial.
 * - Richard
 */

package com.syntel.iot;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IotDistance {

	@Id
	private Long id;

	@Column(name = "origin")
	private String from;

	@Column(name = "destination")
	private String to;

	private BigDecimal distance;
	private int port;

	public IotDistance() {

	}

	public IotDistance(Long id, String from, String to, BigDecimal distance) {
		// super();
		// super's not needed in this case.
		this.id = id;
		this.from = from;
		this.to = to;
		this.distance = distance;
	}

	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getDistance() {
		return distance;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}