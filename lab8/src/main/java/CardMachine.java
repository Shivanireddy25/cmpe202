public class CardMachine implements ICardObserver{

    private NumberState num;
    private ExpiryState exp;
    private CVVState cvv;
    private ICardState cardState;
    private String focus = "Number";
    private int currentCount;

    public CardMachine() {
        num =  new NumberState(this);
        exp =  new ExpiryState(this);
        cvv = new  CVVState(this);
        this.cardState = num;
    }

    public void setFocus(String currentScreen) {
        this.focus = currentScreen;
    }

    public String getCurrentScreen() {
        return this.focus;
    }


    public void setState() {
        if(this.currentCount<=15) {
            num.setState();
            this.cardState = num;
        }
        else if(this.currentCount<=19)
        {   exp.setState();

        this.cardState = exp; }
        else  if(this.currentCount==20)
        { cvv.setState();
        this.cardState = cvv;}
    }


    public void setCurrentCount(int count) {
        this.currentCount = count;
        setState();
    }


    public String getPrevious(){
        return this.cardState.getPrevious();
    }

    public String getNext() {
        return this.cardState.getNext();
    }
}