package by.nikolaev.impl;

import by.nikolaev.interfaces.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {
	
	@Override
	public String getMessage() {
		return "Hello World";
	}

}
