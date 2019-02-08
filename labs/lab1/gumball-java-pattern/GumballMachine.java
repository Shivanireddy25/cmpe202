import java.util.*;

public class GumballMachine {
    
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    
    List<Integer> acceptingCoins = new ArrayList<Integer>();
    int amountPresent = 0;
    int costOfEjection = 0;
    
    
    State state = soldOutState;
    int count = 0;
 
    public GumballMachine(int numberGumballs,  int machineNumber) {
        switch(machineNumber) {
        case 1:
            acceptingCoins.add(25);
            costOfEjection = 25; 
            break;
        case 2:
            acceptingCoins.add(25);
            costOfEjection = 50;
            break;
        case 3:
            acceptingCoins.add(5);
            acceptingCoins.add(10);
            acceptingCoins.add(25);
            costOfEjection = 50;
            break;
        default: 
            System.out.print("Only 3 Machines Available, choose 1 or 2 or 3");
        }
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } 
    }
    
    // Insert Coin 
    
    public void insertCoin(int coin){
        if(this.acceptingCoins.contains(coin)){
            state.insertCoin(coin);
    } else {
        System.out.print("Invalid coin");
        state.ejectCoin();
    }
}
        
        
        public void ejectCoin() {
            state.ejectCoin();
        }
        
     public void setAmountPresent( int amount ) { 
    
            amountPresent = amount + amountPresent;
            }
            
     public int getAmountPresent() {
          return amountPresent;
        }
        
    public int getCost() {
        return costOfEjection;
    }
    
     
    
    void setCost(int cost){
        this.costOfEjection = cost;
    }

 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
    
    void nullifyAmount() {
        this.amountPresent = 0;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    public List<Integer> getAcceptingCoins() {
        return acceptingCoins;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
