package by.nikolaev.interfaces;

public interface MessageRenderer {
	void render();
	void setMessageProvider(MessageProvider messageProvider);
	MessageProvider getMessageProvider();
}