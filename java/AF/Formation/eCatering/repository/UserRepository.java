package AF.Formation.eCatering.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import AF.Formation.eCatering.model.TA_USER;



public interface UserRepository extends JpaRepository <TA_USER, Long>  {

//	public List<TA_USER> getListUtilisateurs();
//	public TA_USER getUtilisateurById(int I_ID);
//	public void ajouterUtilisateur(TA_USER user);
//	public void modifierUtilisateur(TA_USER user);
//	public void supprimerUtilisateur(int I_ID);

	TA_USER LoginUtilisateur(String T_LOGIN,String T_PASSWORD);
//	public TA_USER getOne(long id);
//	public List<TA_USER> findAll();
	}
//CrudRepository  spring data