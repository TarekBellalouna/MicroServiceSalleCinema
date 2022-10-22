package tn.esprit.spring.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class CentreCinema implements Serializable {

	private static final long serialVersionUID = -453832438298777310L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCentre;
	
    String Nom;
    String Lieu;
    String Tel ;
    
    @OneToMany(cascade = CascadeType.ALL)
    List<SalleCinema> salleCinemas;

    
	public Long getIdCentre() {
		return idCentre;
	}

	public void setIdCentre(Long idCentre) {
		this.idCentre = idCentre;
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

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public List<SalleCinema> getSalleCinemas() {
		return salleCinemas;
	}

	public void setSalleCinemas(List<SalleCinema> salleCinemas) {
		this.salleCinemas = salleCinemas;
	}

	@Override
	public String toString() {
		return "CentreCinema [idCentre=" + idCentre + ", Nom=" + Nom + ", Lieu=" + Lieu + ", Tel=" + Tel
				+ ", salleCinemas=" + salleCinemas + "]";
	}

	public CentreCinema(Long idCentre, String nom, String lieu, String tel, List<SalleCinema> salleCinemas) {
		super();
		this.idCentre = idCentre;
		Nom = nom;
		Lieu = lieu;
		Tel = tel;
		this.salleCinemas = salleCinemas;
	}

	public CentreCinema() {
		super();
	}

	
	
    
}
