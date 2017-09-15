package by.nikolaev.implannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import by.nikolaev.interfaces.MessageProvider;
import by.nikolaev.interfaces.MessageRenderer;
@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer{
	private MessageProvider messageProvider;
	@Override
	public void render() {
		if(messageProvider == null){
			throw new RuntimeException(
					"You must set the property messageProvider of class:"
					+ StandardOutMessageRenderer.class.getName());
					// Вы должны установить свойство messageProvider класса
		}
		System.out.println(messageProvider.getMessage());
	}

	@Override
	@Autowired
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
		
	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
