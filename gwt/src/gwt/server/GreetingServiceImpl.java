package gwt.server;

import logic.account.AccountController;
import gwt.client.GreetingService;
import gwt.shared.FieldVerifier;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {
	
	
	public String greetServer(String input) throws IllegalArgumentException {
		AccountController acontrol = new AccountController();
		String[] params = input.split("&");
		if(params[0].equals("authorize")){
			boolean result = acontrol.doAuthorize(params[1], params[2]);
			return result==true?"authorizesucceed":"authorizefailed";
		}
		if(params[0].equals("register")){
			boolean result = acontrol.doRegister(params[1], params[2]);
			return result==true?"registersucceed":"registerfailed";
		}
		return "";
	}

	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 * 
	 * @param html the html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}
}
