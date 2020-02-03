package AF.Formation.eCatering.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class RE_USER_FACILITY_KEY implements Serializable{
	private long I_User;
	private long I_Facility;
}
