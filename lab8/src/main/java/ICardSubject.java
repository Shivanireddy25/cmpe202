 public interface ICardSubject {
    void attach(ICardObserver obj);

    void notifyCard();
}