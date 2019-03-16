package lab6;

public class Receipt implements Strategy{

	@Override
    public String Display(Order o) {

		 String result =  "         FIVE GUYS     " + '\n' ;
		 result  = result +  "     BURGER AND FRIES     " + '\n' ;
		 result  = result +  "      STORE # CA-1294     " + '\n' ;
		 result  = result +  "   5353 ALMADEN EXPY N60     " + '\n' ;
		 result  = result +  "   SAN JOSE , CA 95118    " + '\n' ;
		 result  = result +  "    (P) 408-264-9300     " + '\n' ;
		 result = result +  "------------------------------------- \n";
		 result = result +  "Order Number: 45       \n";
		 
	       result  = result + o.getName() + "             " + o.getCost() + '\n' ;
        if(o.getToppings() != null) {
            for (Toppings topping : o.getToppings()) {
                result = result + "     " + topping.getName() + '\n';
            }
        }
        result = result + "------------------------------------- \n";
        result = result + "Sub-Total" + "          " + o.getCost() + '\n'; 
        result = result + "Tax (9%)" + "           " + String.format("%.2f", 0.09*o.getCost()) + '\n'; 
        result = result + "Total" + "             " + 1.09*o.getCost() + '\n';
        result = result + "Cash" + "             " + "10$" + '\n';
        result = result + "Change" + "             " + "4.55" + '\n';
        result = result + "------------------------------------- \n";
        return result;
    }

}
