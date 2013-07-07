package gwt.client;

import logic.account.AccountController;
import gwt.shared.FieldVerifier;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwt implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";
	private HorizontalPanel hpan = new HorizontalPanel();
	private VerticalPanel vpan = new VerticalPanel();
	private TextBox loginfield = new TextBox();
	private PasswordTextBox passfield = new PasswordTextBox();
	private Button register = new Button();
	private Button authorize = new Button();
	private Label messagelabel = new Label();
	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		register.setText("Register");
		authorize.setText("Authorize");
		
		hpan.add(authorize);
		hpan.add(register);
		
		vpan.add(loginfield);
		vpan.add(passfield);
		vpan.add(hpan);
		vpan.add(messagelabel);
		
		RootPanel.get("placeforvpan").add(vpan);
		loginfield.setFocus(true);
		
		register.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent e){
				greetingService.greetServer("register&"+loginfield.getText()+"&"+passfield.getText(),
						new AsyncCallback<String>() {
							public void onFailure(Throwable caught) {
								// Show the RPC error message to the user
								messagelabel.setText(SERVER_ERROR);
							}
							public void onSuccess(String result) {
								// 
								String message = "";
								if(result.equals("registersucceed")){message = "You've been registered";}
								if(result.equals("registerfailed")){message = "Error while registering";}
								messagelabel.setText(message);
							}
						});
			}
		});
		authorize.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent e){
				greetingService.greetServer("authorize&"+loginfield.getText()+"&"+passfield.getText(),
						new AsyncCallback<String>() {
							public void onFailure(Throwable caught) {
								// Show the RPC error message to the user
								messagelabel.setText(SERVER_ERROR);
							}
							public void onSuccess(String result) {
								// 
								String message = "";
								if(result.equals("authorizesucceed")){message = "You've been authorized";}
								if(result.equals("authorizefailed")){message = "Error while logging in";}
								messagelabel.setText(message);
							}
						});
			}
		});
		
		
		
	}
}
