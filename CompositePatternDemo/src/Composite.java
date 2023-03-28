import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private String name;
    List<Component> compList = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }
    public void addComponent(Component comp)
    {
        compList.add(comp);
    }

    @Override
    public void showPrice() {

        System.out.println(name);
        for (Component component : compList)
        {
            component.showPrice();
        }
    }
}
