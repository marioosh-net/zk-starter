package net.marioosh.zkstarter.model.dao;

import java.util.List;

import net.marioosh.zkstarter.model.entities.User;

public interface UserDAO extends GenericDAO<User> {

	public User getByLogin(String login);
	public List<User> findAll();
	public List<User> findAll(int page);
	public int countPages(int rowPerPage);
}
