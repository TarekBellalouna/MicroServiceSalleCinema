package tn.esprit.spring.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
public class Siege implements Serializable {
	private static final long serialVersionUID = -453832438298777310L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idSiege;
	
    String Positon;
    String Type;
    
    @ManyToOne()
    SalleCinema salle ;

	public Long getIdSiege() {
		return idSiege;
	}

	public void setIdSiege(Long idSiege) {
		this.idSiege = idSiege;
	}

	public String getPositon() {
		return Positon;
	}

	public void setPositon(String positon) {
		Positon = positon;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public SalleCinema getSalle() {
		return salle;
	}

	public void setSalle(SalleCinema salle) {
		this.salle = salle;
	}

	public Siege(Long idSiege, String positon, String type, SalleCinema salle) {
		super();
		this.idSiege = idSiege;
		Positon = positon;
		Type = type;
		this.salle = salle;
	}

	public Siege() {
		super();
	}

	@Override
	public String toString() {
		return "Siege [idSiege=" + idSiege + ", Positon=" + Positon + ", Type=" + Type + ", salle=" + salle + "]";
	}


    
    
    
}
