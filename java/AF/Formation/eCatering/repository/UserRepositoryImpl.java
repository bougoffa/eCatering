package AF.Formation.eCatering.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import AF.Formation.eCatering.model.TA_USER;

@Repository
public  class UserRepositoryImpl implements UserRepository {
	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	/*public List<TA_USER> getListUtilisateurs(){
		Session session = this.sessionFactory.getCurrentSession();
		List<TA_USER> userList = session.createQuery("select u from TA_USER u").list( );
		return userList;
	}
	
	public void ajouterUtilisateur(TA_USER user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
	}
	
	public void modifierUtilisateur(TA_USER user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(user);		
	}*/
	
	

	@Override
	public TA_USER LoginUtilisateur(String T_LOGIN,String T_PASSWORD) {
		Session session = getSession();
		List<TA_USER> userList = session.createQuery("select u from TA_USER u where u.T_LOGIN=:T_LOGIN and u.T_PASSWORD=:T_PASSWORD")
				.setParameter("T_LOGIN", T_LOGIN)
				.setParameter("T_PASSWORD", T_PASSWORD).list();
		
		if (userList.size()!=0) {
			return userList.get(0);
		}else {
			return null;
		}
	}

	@Override
	public List<TA_USER> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TA_USER> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TA_USER> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TA_USER> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends TA_USER> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<TA_USER> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TA_USER getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TA_USER> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TA_USER> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TA_USER> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TA_USER> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TA_USER> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TA_USER entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends TA_USER> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends TA_USER> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TA_USER> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TA_USER> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends TA_USER> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}



}
