package net.marioosh.zkstarter;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.spring.SpringUtil;
import org.zkoss.zul.api.Textbox;

public class DemoWindowComposer extends GenericForwardComposer {
	
	private Logger log = Logger.getLogger(getClass());
	
	private Textbox textbox;
	
	private int times;
	
	/**
	 * SpringUtil - jeden ze sposobow na dostanie sie do beanow Springa
	 */
	private final SpringService springService = (SpringService) SpringUtil.getBean("springService");	
	
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	}
	
	public void onClick$okButton() {
		log.debug("click");
		textbox.setText("Clicked " + ++times + " times.");
	}
}