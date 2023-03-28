public interface Subject {
    String getName();

    void subscribe(Subscriber sub);

    void unsubscribe(Subscriber sub);

    void notifySubscribers(String title);

    void uploadEvent(String t);
}
