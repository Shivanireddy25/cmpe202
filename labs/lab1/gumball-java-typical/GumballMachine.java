import java.util.*;
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_coin;
    private boolean hasEnoughMoney;
    
    
    List<Integer> acceptingCoins = new ArrayList<Integer>();
    int amountPresent = 0;
    int costOfEjection = 0;

    public GumballMachine( int size, int machineNumber )
    {
        this.has_coin = false;
        this.hasEnoughMoney = false;
        this.num_gumballs = size;
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
    }

    public List<Integer> getAcceptingCoins() {
        return acceptingCoins;
    }
    public void insertCoin(int coin)
    {
        if ( this.getAcceptingCoins().contains(coin)){
            this.has_coin = true;
            this.amountPresent += coin; 
            if(!(this.amountPresent < this.costOfEjection)){
                this.hasEnoughMoney = true;
                if(this.amountPresent > this.costOfEjection) {
                    System.out.println("You have inserted" + (this.amountPresent - this.costOfEjection) + "more , Take change!!");
                }
            } 
    } else {
        System.out.println("you have entered invalid coin");
    }
}
    
    public void turnCrank()
    {
    	if ( this.hasEnoughMoney )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.hasEnoughMoney = false ;
    			this.amountPresent = 0;
    			System.out.println( "Thanks for your money.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{ if(!this.has_coin) {
    	   System.out.println( "Insert money to eject gumballs." ) ;
    	   } 
    	   else if(this.amountPresent < this.costOfEjection){
    	       System.out.println("Insert enough money for gumball");
    	   }
    	   
    	   
  
    	}        
    }
    
    
}
