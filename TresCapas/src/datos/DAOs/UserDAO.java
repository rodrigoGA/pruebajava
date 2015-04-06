package datos.DAOs;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import datos.Models.User;

@LocalBean
@Stateless
public class UserDAO {
	
	@PersistenceContext EntityManager em;
	
	public void saveUser(User u ){
		em.merge(u);
	}
	
	public List<User> findAll(){
		return em.createNamedQuery("User.findAll").getResultList();
	}
	

}
