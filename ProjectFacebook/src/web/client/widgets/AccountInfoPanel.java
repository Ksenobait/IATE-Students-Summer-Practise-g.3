package web.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class AccountInfoPanel extends Composite {
	interface AccountInfoPanelUiBinder extends UiBinder<Widget, AccountInfoPanel> {}//руками не трогать
	
	private static AccountInfoPanelUiBinder uiBinder = GWT
			.create(AccountInfoPanelUiBinder.class);//руками не трогать
	
	@UiField Label nameField;//виджеты внутри нашей панели
	@UiField Button toPrivatePage;
	@UiField Button logOut;

	public AccountInfoPanel() {
		initWidget(uiBinder.createAndBindUi(this));//руками не трогать
	}
	
	@UiHandler("toPrivatePage")
	void onClick(ClickEvent e){//нажатие на кнопку Личный кабинет
		Window.alert("Not implemented yet!");
	}
}
