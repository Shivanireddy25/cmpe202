

import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin(int coin) {
		System.out.println("You already have sufficient money in the machine");
	}
 
	public void ejectCoin() {
		System.out.println("coin returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

        public void dispense() {
        System.out.println("No gumball dispensed");
        }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
