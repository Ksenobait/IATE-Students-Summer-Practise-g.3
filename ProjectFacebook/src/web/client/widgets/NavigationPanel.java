package web.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class NavigationPanel extends Composite {
	
	interface NavigationPanelUiBinder extends UiBinder<Widget, NavigationPanel> {}
	private static NavigationPanelUiBinder uiBinder = GWT
			.create(NavigationPanelUiBinder.class);
	
	@UiField Button toMain; 
	@UiField Button toDocuments;
	@UiField Button toNews;

	public NavigationPanel() {
		initWidget(uiBinder.createAndBindUi(this));
		}
}
