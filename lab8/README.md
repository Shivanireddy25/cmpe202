# Input Mask Design Patterns : #

I have used three design patterns in this Lab.

1. Decorator pattern to decorate the card number and card expiry using the respective decorators extending CreditCardDecorator which 
conforms to interfaces implemented by CreditCardNum and CreditCardExp.
2. I have used observer pattern to notify the card machine with the current count of digits entered. CardMachine is observer(ICardObserver)
and app is the subject(ICardSubject).
3. I have used state pattern to display the current, previous and next state . Here I have current number entry state(NumberState)
expiry entry(ExpiryState) and cvv entry (CVVState) which implements ICardState.

Now the screen displays the card number and expiry decorated with the count and also the current, next and previous state.
