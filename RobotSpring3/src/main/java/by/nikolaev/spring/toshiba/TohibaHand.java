package by.nikolaev.spring.toshiba;

import by.nikolaev.spring.interfaces.Hand;

public class TohibaHand implements Hand {

	@Override
	public void cathSomething() {
		System.out.println("Toshiba cath something");
	}

}
