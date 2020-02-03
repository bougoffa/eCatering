//package AF.Formation.eCatering.service;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import AF.Formation.eCatering.model.TA_USER;
//import AF.Formation.eCatering.repository.UserRepository;
//
//
//@Service
//public  class UserServicelpml implements UserService  {
//
//	@Autowired
//	private UserRepository userrepository;
//	
//	
//	@Transactional
//	public List<TA_USER> getListUtilisateurs(){
//		return this.userrepository.getListUtilisateurs();
//	}
//	
//	
//	@Transactional
//	public TA_USER getUtilisateurById(int I_ID) {
//		return this.userrepository.getUtilisateurById(I_ID);
//	}
//	
//	@Transactional
//	public void ajouterUtilisateur(TA_USER user) {
//		this.userrepository.ajouterUtilisateur(user);
//	}
//	
//	
//	@Transactional
//	public void modifierUtilisateur(TA_USER user) {
//		this.userrepository.modifierUtilisateur(user);
//	}
//
//	
//	@Transactional
//	public void supprimerUtilisateur(int I_ID) {
//		this.userrepository.supprimerUtilisateur(I_ID);
//	}
//
//
//	@Transactional
//	public TA_USER loginUtilisateur(String T_Login_User, String T_Password_User) {
//		return this.userrepository.LoginUtilisateur(T_Login_User, T_Password_User);
//	}
//
//
//}
