package lab6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PackingSlip implements Strategy {

	 @Override
	    public String Display(Order o) {
		 String result =  "------------------------------------- \n";
		 result = result +  "Order Number: 45       \n";
		 result = result +  "     FIVE GUYS     " + '\n' ;
	       result  = result + o.getName() + "      "  + '\n' ;
	        if(o.getToppings() != null) {
	            ArrayList<Toppings> sortedToppings= o.getToppings();
	            sortedToppings.sort(Comparator.comparing(Toppings::order));
	            for (Toppings topping : sortedToppings) {
	                result = result + "     " + topping.getName() + '\n';
	              
	            }
	        }
	        result = result + "Register:1      Train Seq No : 57845 \n";
	        result = result + "Cashier: Sakda*S .\n";
	      /*  result = result + "Tax" + "          " + "9%" + '\n'; 
	        result = result + "Total" + "        " + 1.09*o.getCost() + '\n';
	        result = result + "------------------------------------- \n"; */

	        return result;
	    }
}
