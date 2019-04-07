public class CreditCardDecorator implements IDisplayComponent, IKeyEventHandler {
    private IDisplayComponent component;
    private IKeyEventHandler handler;
    public CreditCardDecorator (IDisplayComponent c) {
        component = c;
        handler = (IKeyEventHandler) c;
    }

    public String display() {
        return component.display();
    }

    public void addSubComponent(IDisplayComponent c) {
        component.addSubComponent(c);

    }

    public void key(String ch, int cnt) {

        handler.key(ch,cnt);

    }

    public void setNext(IKeyEventHandler next) {
        handler.setNext(next);
    }
}