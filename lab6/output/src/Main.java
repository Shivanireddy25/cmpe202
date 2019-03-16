package lab6;


	public class Main {

	    public static void main(String[] args){
  
	    	Order b = new Burger("LLB");

	        b.addToppings(new Toppings("Bacon",1,3));
	        b.addToppings(new Toppings("Lettuce",1,1));
	        b.addToppings(new Toppings("Tomato",1,1));
	        b.addToppings(new Toppings("G Onion",1,2));
	        b.addToppings(new Toppings("JALA Grilled",1,2));

	      

	        System.out.println("This is Receipt");
	        System.out.println(b.display());
	      
	        System.out.println("This is PackingBill");
	        b.setStrategy(new PackingSlip());
	      
	        System.out.println(b.display());
	       

	    }

	    }
