package net.marioosh.zkstarter;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;

public class DemoWindowComposer extends GenericForwardComposer {
	
	private Logger log = Logger.getLogger(getClass());
	
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	}
	
	public void onClick$okButton() {
		log.debug("click");
	}
}