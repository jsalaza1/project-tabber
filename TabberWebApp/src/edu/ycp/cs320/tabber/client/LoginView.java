package edu.ycp.cs320.tabber.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;

import edu.ycp.cs320.tabber.shared.IPublisher;
import edu.ycp.cs320.tabber.shared.ISubscriber;
import edu.ycp.cs320.tabber.shared.Song;

import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;

public class LoginView extends Composite implements ISubscriber {

	public LoginView(){
		LayoutPanel panel = new LayoutPanel();
		initWidget(panel);
		
		TextBox textBox = new TextBox();
		panel.add(textBox);
		panel.setWidgetLeftWidth(textBox, 0.0, Unit.PX, 143.0, Unit.PX);
		panel.setWidgetTopHeight(textBox, 14.0, Unit.PX, 34.0, Unit.PX);
	}
	
	@Override
	public void eventOccurred(Object key, IPublisher publisher, Object hint) {
	}
}
