package net.marioosh.zkstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zkoss.spring.context.annotation.EventHandler;
import org.zkoss.spring.util.GenericSpringComposer;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Button;

@Component("zkSpringController")
public class ZKSpringController extends GenericSpringComposer {
	
	@Autowired
    private Button button;
	
	 @Autowired
	 private Textbox textbox;
	
	@EventHandler("button.onClick")
    public void showGreeting(Event evt) throws WrongValueException, InterruptedException {
        Messagebox.show("Hello " + textbox.getValue() + "!");
    }
}
