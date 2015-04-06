package presentacion;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import datos.DAOs.UserDAO;
import datos.Models.User;

@ApplicationScoped
@ManagedBean
public class UserController {
	
	@Inject UserDAO userDAO;
	User newUser = new User();

	public List<User> getAllUsers(){
		return userDAO.findAll();
	}	
	
	public String addUser(){
		userDAO.saveUser(newUser);
		return "index.xhtml";
	}
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public User getNewUser() {
		return newUser;
	}

	public void setNewUser(User newUser) {
		this.newUser = newUser;
	}
	
	
	
	

}
