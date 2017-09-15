package by.nikolaev.implannotation;

import org.springframework.stereotype.Service;

import by.nikolaev.interfaces.MessageProvider;
//@Service("messageProvider")
public class HelloWorldМessageProvider implements MessageProvider{

	@Override
	public String getMessage() {
		return "Hello World using annotation";
	}

}
