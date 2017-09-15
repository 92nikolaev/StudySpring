package by.nikolaev.impl;

import by.nikolaev.interfaces.MessageProvider;
import by.nikolaev.interfaces.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer {
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
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
		
	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
