package web.client;

import logic.account.Account;

import com.google.gwt.user.client.rpc.AsyncCallback;


public interface AccountServiceAsync {
	void getSessionAccount(AsyncCallback<Account> callback) 
			throws IllegalArgumentException;
	void doAuthorize(String login, String pass, AsyncCallback<Account> callback) 
			throws IllegalArgumentException;
	void doRegister(String params[], AsyncCallback<Account> callback)
			throws IllegalArgumentException;
}
