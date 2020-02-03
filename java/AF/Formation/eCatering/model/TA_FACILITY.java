package AF.Formation.eCatering.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class TA_FACILITY {
	@Id
	@GeneratedValue
	private long I_ID;
	private String T_Label_facility;
	private String T_Code_facility;
	
	
	
	
	public TA_FACILITY() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TA_FACILITY(String t_Label_facility, String t_Code_facility) {
		super();
		T_Label_facility = t_Label_facility;
		T_Code_facility = t_Code_facility;
	}

	public long getI_ID() {
		return I_ID;
	}

	public void setI_ID(long i_ID) {
		I_ID = i_ID;
	}

	public String getT_Label_facility() {
		return T_Label_facility;
	}

	public void setT_Label_facility(String t_Label_facility) {
		T_Label_facility = t_Label_facility;
	}

	public String getT_Code_facility() {
		return T_Code_facility;
	}

	public void setT_Code_facility(String t_Code_facility) {
		T_Code_facility = t_Code_facility;
	}
	
	

}
