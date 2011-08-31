package net.marioosh.zkstarter.model.impl;

import java.io.Serializable;

import net.marioosh.zkstarter.model.dao.GenericDAO;

import org.hibernate.Session;
import org.zkoss.zkplus.hibernate.HibernateUtil;

public class GenericDAOImpl<T> implements GenericDAO<T> {

	protected final Class<T> persistentClass;
	
	GenericDAOImpl(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	  protected Session currentSession() {
	        return HibernateUtil.currentSession();
	    }

	@Override
	public Serializable add(T obj) {
		return currentSession().save(obj);
	}

	@Override
	public void update(T obj) {
		currentSession().update(obj);
	}

	@Override
	public void delete(Long id) {
		currentSession().delete(get(id));
	}

	@Override
	public T get(Long id) {
		return (T) currentSession().get(persistentClass, id);
	}

}
