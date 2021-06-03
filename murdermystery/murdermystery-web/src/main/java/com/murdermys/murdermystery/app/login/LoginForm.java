package com.murdermys.murdermystery.app.login;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

public class LoginForm implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// omitted
    @NotEmpty // (1)
    private String username;

    @NotEmpty // (1)
    private String password;
    // omitted
    

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}