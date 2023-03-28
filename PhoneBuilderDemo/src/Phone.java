public class Phone {

    //optional
    private String os;
    //Optional
    private int ram;
    //Optional
    private String processor;
    //Optional
    private double screenSize;
    //Optional
    private int battery;

    public Phone(String os, int ram, String processor, double screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    public Phone(String os) {
        this.os = os;
    }



    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}
