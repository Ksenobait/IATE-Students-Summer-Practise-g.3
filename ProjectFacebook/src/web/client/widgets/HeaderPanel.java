package web.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class HeaderPanel extends Composite  {
	
	interface HeaderPanelUiBinder extends UiBinder<Widget, HeaderPanel> {}

	private static HeaderPanelUiBinder uiBinder = GWT
			.create(HeaderPanelUiBinder.class);

	
	
	@UiField
	NavigationPanel navi;
	@UiField
	AccountInfoPanel accinf;

	public HeaderPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
