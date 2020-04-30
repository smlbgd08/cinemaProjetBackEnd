package org.sid.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name="salle")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Salle {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private String name ;
	private int nombrePlace ;
	@ManyToOne
	private Cinema cinema ;
	@OneToMany(mappedBy = "salle")
	private List<Place> places;
	
	@OneToMany(mappedBy = "salle")
	private List<Projection> projections;

	@OneToMany(mappedBy = "salle")
	private List<Ticket> tickets;
}
