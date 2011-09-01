package net.marioosh.zkstarter;

import java.util.Date;
import java.util.List;

import net.marioosh.zkstarter.model.dao.UserDAO;
import net.marioosh.zkstarter.model.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringService {
	
	@Autowired
	private UserDAO userDAO;
	
	public Date getDate() {
		return new Date();
	}
	
	public List<User> getUsers() {
		return userDAO.findAll();
	}
	
}
