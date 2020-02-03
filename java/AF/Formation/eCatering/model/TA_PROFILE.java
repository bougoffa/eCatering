package AF.Formation.eCatering.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ta_profile")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class TA_PROFILE {
	@Id
	@GeneratedValue
	private long I_ID;
	private String T_Label_Profile;
	private String T_Code_Profile;
	
	
	
	
	public TA_PROFILE() {
		super();
		
	}
	public TA_PROFILE(String t_Label_Profile, String t_Code_Profile) {
		super();
		T_Label_Profile = t_Label_Profile;
		T_Code_Profile = t_Code_Profile;
	}
	public long getI_ID() {
		return I_ID;
	}
	public void setI_ID(long i_ID) {
		I_ID = i_ID;
	}
	public String getT_Label_Profile() {
		return T_Label_Profile;
	}
	public void setT_Label_Profile(String t_Label_Profile) {
		T_Label_Profile = t_Label_Profile;
	}
	public String getT_Code_Profile() {
		return T_Code_Profile;
	}
	public void setT_Code_Profile(String t_Code_Profile) {
		T_Code_Profile = t_Code_Profile;
	}


}
