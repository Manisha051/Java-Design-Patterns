public interface Observer {
    void update(String str);

    void subscribeCommunity(Community comm);

    void unSubscribeCommunity(Community comm);
}
