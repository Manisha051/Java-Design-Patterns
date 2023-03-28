public class Subscriber implements Observer {

    private String name;
    private Community community = new Community();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String str)
    {
        System.out.println("Hey "+name+", event: "+str+" uploaded on community: "+community.getName());
    }

    @Override
    public void subscribeCommunity(Community comm)
    {
        community = comm;
        community.subscribe(this);
    }
    @Override
    public void unSubscribeCommunity(Community comm)
    {

        community.unsubscribe(this);
        community = new Community();
    }
}
