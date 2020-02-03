package AF.Formation.eCatering.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "re_user_facility")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
//@IdClass(RE_USER_FACILITY_KEY.class)
public class RE_USER_FACILITY{
	
	@EmbeddedId
	RE_USER_FACILITY_KEY keyId;
	
	private long I_Default;
	
	@ManyToOne
	@JoinColumn(name="I_User", insertable = false, updatable = false)
	private TA_USER user;
	
	@ManyToOne
	@JoinColumn(name="I_Facility", insertable = false, updatable = false)
	private TA_FACILITY facility;
	
	public RE_USER_FACILITY() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RE_USER_FACILITY(long i_Default) {
		super();
		I_Default = i_Default;
	}

//	public long getI_USER() {
//		return I_USER;
//	}
//
//	public void setI_USER(long i_USER) {
//		I_USER = i_USER;
//	}
//
//	public long getI_FACILITY() {
//		return I_FACILITY;
//	}
//
//	public void setI_FACILITY(long i_FACILITY) {
//		I_FACILITY = i_FACILITY;
//	}

	public RE_USER_FACILITY_KEY getKeyId() {
		return keyId;
	}

	public void setKeyId(RE_USER_FACILITY_KEY keyId) {
		this.keyId = keyId;
	}

	public long getI_Default() {
		return I_Default;
	}

	public void setI_Default(long i_Default) {
		I_Default = i_Default;
	}

	public TA_USER getUser() {
		return user;
	}

	public void setUser(TA_USER user) {
		this.user = user;
	}

	public TA_FACILITY getFacility() {
		return facility;
	}

	public void setFacility(TA_FACILITY facility) {
		this.facility = facility;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (I_Default ^ (I_Default >>> 32));
//		result = prime * result + (int) (I_FACILITY ^ (I_FACILITY >>> 32));
//		result = prime * result + (int) (I_USER ^ (I_USER >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RE_USER_FACILITY other = (RE_USER_FACILITY) obj;
		if (I_Default != other.I_Default)
			return false;
//		if (I_FACILITY != other.I_FACILITY)
//			return false;
//		if (I_USER != other.I_USER)
//			return false;
		return true;
	}

	

}
