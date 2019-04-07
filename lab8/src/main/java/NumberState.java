public class NumberState implements ICardState {
    CardMachine cardMachine;

    public NumberState (CardMachine m) {
        this.cardMachine = m;
    }

    public void setState() {
        this.cardMachine.setFocus("Number");
    }


    public String getNext() {
        return "Expiry";
    }

    public String getPrevious() {
        return "Nothing";
    }
}