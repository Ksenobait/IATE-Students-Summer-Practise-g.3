package web.client;

import logic.account.Account;
import com.google.gwt.user.client.rpc.RemoteService;

public interface AccountService extends RemoteService {
	public Account getSessionAccount() throws IllegalArgumentException;
	public Account doAuthorize(String login, String pass) throws IllegalArgumentException;
	public Account doRegister(String[] params) throws IllegalArgumentException;
}
