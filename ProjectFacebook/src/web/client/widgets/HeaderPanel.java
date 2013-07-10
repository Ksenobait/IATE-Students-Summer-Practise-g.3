package web.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HeaderPanel extends Composite {
	
	interface HeaderPanelUiBinder extends UiBinder<Widget, HeaderPanel> {}
	private static HeaderPanelUiBinder uiBinder = GWT
			.create(HeaderPanelUiBinder.class);
	
	@UiField 
	AccountInfoPanel accinf;
	/*@UiField
	NavigationPanel navi;*/
	


	
	

	public HeaderPanel() {
		
		initWidget(uiBinder.createAndBindUi(this));
		
		this.accinf = new AccountInfoPanel();
	}

}
