

public class Main {

	public static void main(String[] args) {
	    
	    /* Instantiating Gumball Machine with option 1 to choose Machine 1
	    accepts only 25 cents  */
		GumballMachine gumballMachine1 = new GumballMachine(5, 1);
		System.out.println(gumballMachine1);
		
		System.out.println("Gumball Machine 1 does not accept 10 cent coin");
		gumballMachine1.insertCoin(10);
		gumballMachine1.turnCrank();
		
		System.out.println("Gumball Machine 2 accepts 25 cents");
		GumballMachine gumballMachine2 = new GumballMachine(3, 2);
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();
		
		System.out.println("Gumball Machine 3 accepts any coins and ball comes out rolling");
		GumballMachine gumballMachine3 = new GumballMachine(2, 3);
		gumballMachine3.insertCoin(25);
		gumballMachine3.insertCoin(25);
		gumballMachine3.turnCrank();
		
	
		
	}
}
