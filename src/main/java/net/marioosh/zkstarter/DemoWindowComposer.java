package net.marioosh.zkstarter;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.api.Textbox;

public class DemoWindowComposer extends GenericForwardComposer {
	
	private Logger log = Logger.getLogger(getClass());
	
	private Textbox textbox;
	
	private int times;
	
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	}
	
	public void onClick$okButton() {
		log.debug("click");
		textbox.setText("Clicked " + ++times + " times.");
	}
}