package by.nikolaev.spring;

import by.nikolaev.spring.interfaces.Hand;
import by.nikolaev.spring.interfaces.Head;
import by.nikolaev.spring.interfaces.Leg;

public class ModelT1000 extends Robot {
	private Hand hand;
	private Leg leg;
	private Head head;
	
	public ModelT1000() {
	}
	
	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	@Override
	public void dance(){
		System.out.println("Robot dence !");
	}

	@Override
	void fire() {
		head.calc();
		leg.go();
		hand.cathSomething();
		
	}
}
