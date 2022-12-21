package cat.itacademy.barcelonactiva.moreno.perez.pilar.s04.t02.n02.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruites")
public class Fruita {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "nom")
	private String nom;

	@Column(name = "quantitatQuilos")
	private int quantitatQuilos;

	public Fruita(String nom, int quantitatQuilos) {
		this.nom = nom;
		this.quantitatQuilos = quantitatQuilos;
	}

	public Fruita() {}

	public long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantitatQuilos() {
		return quantitatQuilos;
	}

	public void setQuantitatQuilos(int quantitatQuilos) {
		this.quantitatQuilos = quantitatQuilos;
	}
    
    
}
