public class CardNumDecorator extends CreditCardDecorator {

    StringBuilder result;
    private String output;

    public CardNumDecorator(IDisplayComponent component) {
            super(component);

        }

        public String display() {
           output = super.display();
           return addedBehaviour(output);
        }

        private String addedBehaviour(String in){
        result = new StringBuilder();
        if (!in.equals("[4444 4444 4444 4444]" + "  ")) {
        for (int i = 0; i < in.length(); i++) {
        if (i > 1 && (i % 4 == 0) && (i < 16))
            result.append(in.charAt(i) + " ");
        else
            result.append(in.charAt(i));
        }
        return result.toString();
        } else
        return in;

        }

    public void addSubComponent(IDisplayComponent c) {
        super.addSubComponent(c);

    }

    public void key(String ch, int cnt) {

        super.key(ch,cnt);

    }

    public void setNext(IKeyEventHandler next) {
        super.setNext(next);
    }


        }