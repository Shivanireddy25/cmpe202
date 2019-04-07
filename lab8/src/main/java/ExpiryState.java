public class ExpiryState implements ICardState {
    CardMachine cardMachine;

    public ExpiryState (CardMachine m) {
        this.cardMachine = m;
    }

    public void setState() {
        this.cardMachine.setFocus("Expiry");
    }

    public String getNext() {
        return "CVV";
    }

    public String getPrevious() {
        return "Number";
    }


}