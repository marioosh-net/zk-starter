package net.marioosh.zkstarter;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class SpringService {
	
	public Date getDate() {
		return new Date();
	}
	
}
