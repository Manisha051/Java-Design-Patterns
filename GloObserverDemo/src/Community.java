import java.util.ArrayList;
import java.util.List;

public class Community implements Subject {

    private String name;
    private List<Subscriber> subscriberList = new ArrayList<>();

    private String eventTitle;

    public Community(String name) {
        this.name = name;
    }

    public Community() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void subscribe(Subscriber sub)
    {
        subscriberList.add(sub);
    }

    @Override
    public void  unsubscribe(Subscriber sub)
    {
        subscriberList.remove(sub);
    }

    @Override
    public void notifySubscribers(String title)
    {
        for(Subscriber subscriber: subscriberList)
        {
            subscriber.update(title);
        }
    }

    @Override
    public void uploadEvent(String t)
    {
        eventTitle = t;
        notifySubscribers(t);
    }

}
