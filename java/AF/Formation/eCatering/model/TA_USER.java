package AF.Formation.eCatering.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "ta_user")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class TA_USER {
	@Id
	@GeneratedValue
	private long I_ID;
	private String T_NOM;
	private String T_PRENOM;
	private String T_LOGIN;
	private String T_PASSWORD;
//	private long I_Profil;
//	private long I_Customer;
	
	@OneToOne
	@JoinColumn(name="I_Profil")
	private TA_PROFILE profil;
	
	@OneToOne
	@JoinColumn(name="I_Customer")
	private  TA_CUSTOMER customer;
	
	
	public TA_USER() {
		super();
	}


	public TA_USER(String t_NOM, String t_PRENOM, String t_LOGIN, String t_PASSWORD) {
			super();
			T_NOM = t_NOM;
			T_PRENOM = t_PRENOM;
			T_LOGIN = t_LOGIN;
			T_PASSWORD = t_PASSWORD;
		}
	
	public String getT_NOM() {
		return T_NOM;
	}
	
	
	public void setT_NOM(String t_NOM) {
		T_NOM = t_NOM;
	}
	
	
	public String getT_PRENOM() {
		return T_PRENOM;
	}
	
	
	public void setT_PRENOM(String t_PRENOM) {
		T_PRENOM = t_PRENOM;
	}
	
	
	public String getT_LOGIN() {
		return T_LOGIN;
	}
	
	
	public void setT_LOGIN(String t_LOGIN) {
		T_LOGIN = t_LOGIN;
	}
	
	
	public String getT_PASSWORD() {
		return T_PASSWORD;
	}
	
	
	public void setT_PASSWORD(String t_PASSWORD) {
		T_PASSWORD = t_PASSWORD;
	}
// Get et set de les clés étrangères  
	


	public TA_PROFILE getProfile() {
		return profil;
	}

	public void setProfile(TA_PROFILE profil) {
		this.profil = profil;
	}

	public TA_CUSTOMER getCustomer() {
		return customer;
	}

	public void setCustomer(TA_CUSTOMER customer) {
		this.customer = customer;
	}
	

}
