

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
   
    public void insertCoin(int coin) {
        
        System.out.println("You inserted " + coin + "cents");
        gumballMachine.setAmountPresent(coin);
        if(!(gumballMachine.getCost() > gumballMachine.getAmountPresent())) {
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        gumballMachine.nullifyAmount();
            if(gumballMachine.getCost() < gumballMachine.getAmountPresent()) {
                System.out.println("You get change" + (gumballMachine.getAmountPresent() - gumballMachine.getCost()));
        } } else {
        
            gumballMachine.setState(gumballMachine.getNoQuarterState());
          }
}
 
    public void ejectCoin() {
        System.out.println("You haven't inserted a coin yet!");
    }
 
    public void turnCrank() {
        System.out.println("You turned,but there's not enough money" +
        (gumballMachine.getCost() - gumballMachine.getAmountPresent()) +
        "more needed");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for enough money";
    }
}
