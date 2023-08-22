package org.example.persistence.models;

import jakarta.persistence.*;
import lombok.ToString;

import java.time.Instant;
@ToString
@Entity
@Table(name = "country")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id", columnDefinition = "smallint UNSIGNED not null")
	private Integer id;

	@Column(name = "country", nullable = false, length = 50)
	private String country;

	@Column(name = "last_update", nullable = false)
	private Instant lastUpdate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Instant getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}