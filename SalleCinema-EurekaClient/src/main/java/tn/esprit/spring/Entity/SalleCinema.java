package tn.esprit.spring.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
public class SalleCinema implements Serializable {
	
	private static final long serialVersionUID = -453832438298777310L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idSalle;
	
    String Nom;
    String Lieu;
    
    //@ManyToOne()
    //CentreCinema centre ;
	
    @OneToMany(cascade = CascadeType.ALL)
    List<Siege> Sieges ;

	public SalleCinema(Long idSalle, String nom, String lieu,  List<Siege> sieges) {
		super();
		this.idSalle = idSalle;
		Nom = nom;
		Lieu = lieu;
		Sieges = sieges;
	}

	public SalleCinema() {
		super();
	}

	public Long getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(Long idSalle) {
		this.idSalle = idSalle;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getLieu() {
		return Lieu;
	}

	public void setLieu(String lieu) {
		Lieu = lieu;
	}



	public List<Siege> getSieges() {
		return Sieges;
	}

	public void setSieges(List<Siege> sieges) {
		Sieges = sieges;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SalleCinema [idSalle=" + idSalle + ", Nom=" + Nom + ", Lieu=" + Lieu + ", centre=" +", Sieges=" + Sieges + "]";
	}
    




}
