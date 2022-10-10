package tn.esprit.spring.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    String idCentre ;
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
	public String getIdCentre() {
		return idCentre;
	}
	public void setIdCentre(String idCentre) {
		this.idCentre = idCentre;
	}
	@Override
	public String toString() {
		return "SalleCinema [idSalle=" + idSalle + ", Nom=" + Nom + ", Lieu=" + Lieu + ", idCentre=" + idCentre + "]";
	}




}
