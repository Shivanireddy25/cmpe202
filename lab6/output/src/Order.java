package lab6;

import java.util.ArrayList;

public interface Order {

	double getCost();
    String getName();
    void addToppings(Toppings toppings);
    ArrayList<Toppings> getToppings();
    String display();
    void setStrategy(Strategy strategy);

}
