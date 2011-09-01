package net.marioosh.zkstarter.model.entities;

import javax.persistence.Transient;

import org.apache.log4j.Logger;


public abstract class AbstractEntity {
	@Transient
	protected Logger log = Logger.getRootLogger();
}
