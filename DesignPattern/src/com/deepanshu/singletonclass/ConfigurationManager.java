package com.deepanshu.singletonclass;

/*Behave like the singleton class*/
public class ConfigurationManager {

	private static ConfigurationManager instance;

	/* Confugiration settings */
	private String databaseUrl;
	private String databaseUsername;
	private String databasePassword;
	private String apiUrl;

	/* private constructor */
	private ConfigurationManager() {
		databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
		databaseUsername = "root";
		databasePassword = "password";
		apiUrl = "https://api.example.com";
	}
	/* getters */

	public String getDatabaseUrl() {
		return databaseUrl;
	}

	public String getDatabaseUsername() {
		return databaseUsername;
	}

	public String getDatabasePassword() {
		return databasePassword;
	}

	public String getApiUrl() {
		return apiUrl;
	}
// check the instance and make the instance
	public static ConfigurationManager getInstance() {
		if (instance == null) {
			instance = new ConfigurationManager();
		}
		return instance;
	}
// show all the details 
	public String ShowDetails() {
		return "ConfigurationManager [databaseUrl=" + databaseUrl + ", databaseUsername=" + databaseUsername
				+ ", databasePassword=" + databasePassword + ", apiUrl=" + apiUrl + "]";
	}

}
