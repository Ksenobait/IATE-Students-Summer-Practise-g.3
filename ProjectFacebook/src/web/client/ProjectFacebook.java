package web.client;

import web.client.widgets.AccountInfoPanel;
import web.shared.FieldVerifier;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HeaderPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ProjectFacebook implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	/*private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);*/

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		HeaderPanel accinf = new HeaderPanel();
		RootPanel.get("1").add(accinf);
		/*Image img = new Image();
		img.setUrl("http://www.google.com/images/logo.gif");
		RootPanel.get("1").add(img);*/
	}
}
