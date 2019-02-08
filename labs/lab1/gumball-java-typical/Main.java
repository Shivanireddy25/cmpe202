

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine1 = new GumballMachine(5, 1);

        System.out.println(gumballMachine1);
        System.out.println(".........Machine1.....");
        //Inserting invalid coin to gumballMachine1 so that it throws error
        gumballMachine1.insertCoin(25);
        gumballMachine1.turnCrank();
        
        System.out.println(".........Machine2.....");
        GumballMachine gumballMachine2 = new GumballMachine(5, 2);
        //Inserting valid coin with less amount to machine 2
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();
        
        System.out.println(".........Machine3.....");
       GumballMachine gumballMachine3 = new GumballMachine(6, 3);
        //Inserting valid coin with less amount to machine 2
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.insertCoin( 5 );
        gumballMachine3.insertCoin( 10);
        gumballMachine3.insertCoin( 10);
        gumballMachine3.turnCrank();
    }
}
