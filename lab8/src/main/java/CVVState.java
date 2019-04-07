public class CVVState implements ICardState {
    CardMachine cardMachine;

    public CVVState (CardMachine m) {
        this.cardMachine = m;
    }

    public void setState() {
        this.cardMachine.setFocus("CVV");
    }

    public String getNext() {
       return "Nothing";
    }

    public String getPrevious() {
       return "Expiry";
    }


}