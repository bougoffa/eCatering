package AF.Formation.eCatering.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class TA_CUSTOMER {
	@Id
	@GeneratedValue
	private long I_ID;
	private String T_Label_Customer;
	private String T_Code_Customer;
	
	
	
	public TA_CUSTOMER() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TA_CUSTOMER(String t_Label_Customer, String t_Code_Customer) {
		super();
		T_Label_Customer = t_Label_Customer;
		T_Code_Customer = t_Code_Customer;
	}
	public long getI_ID() {
		return I_ID;
	}
	public void setI_ID(long i_ID) {
		I_ID = i_ID;
	}
	public String getT_Label_Customer() {
		return T_Label_Customer;
	}
	public void setT_Label_Customer(String t_Label_Customer) {
		T_Label_Customer = t_Label_Customer;
	}
	public String getT_Code_Customer() {
		return T_Code_Customer;
	}
	public void setT_Code_Customer(String t_Code_Customer) {
		T_Code_Customer = t_Code_Customer;
	}
	


}
