package by.nikolaev.impl;

import by.nikolaev.interfaces.MessageProvider;

public class ConfigurableMessageProvider implements MessageProvider  {
	private String message;
	
	
	public ConfigurableMessageProvider(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
