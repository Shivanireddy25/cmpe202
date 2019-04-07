/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App implements  ICardSubject{

    private Screen screen;
    private IDisplayComponent num;
    private IDisplayComponent exp;
    private CreditCardCVC cvc;
    private ICardObserver cardObserver;

    private int count;
    private ICardObserver machine;

    public App() {

        screen = new Screen();
        num = new CardNumDecorator (new CreditCardNum());
        exp = new CardExpiryDecorator (new CreditCardExp());
        cvc = new CreditCardCVC();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        machine = new CardMachine();
        this.attach(machine);

        //count denotes the position of cursor
        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        output += "PREV:" + machine.getPrevious() +"  CURR : " + machine.getCurrentScreen() +  "  NEXT: " + machine.getNext() + "\n"" ;
        output += "Count: " + this.count;
        return output;
    }

    public void key(String ch) {

            if (ch.equals("X")) {

                if(count>22)
                    count=23;
                if (count == 0) {
                    return;
                }
                count--;
                screen.key(ch, count);
            } else if (Integer.parseInt(ch) >= 0 || Integer.valueOf(ch) <= 9) {

                if(count<=22)
                    screen.key(ch, count);
                count++;
            }

                notifyCard();


    }



    public void attach(ICardObserver obj) {
        this.machine = obj;
    }




    public void notifyCard() {

            machine.setCurrentCount(count);
    }

}

