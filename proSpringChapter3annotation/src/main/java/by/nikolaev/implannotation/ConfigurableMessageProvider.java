package by.nikolaev.implannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.nikolaev.interfaces.MessageProvider;
@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider{
	private String message;
	
	@Autowired
	public ConfigurableMessageProvider(String message) {
		super();
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}

}
