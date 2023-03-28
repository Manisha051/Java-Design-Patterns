public class Main {
    public static void main(String[] args) {




        SocketAdapter socketAdapter = new SocketAdapterImpl();
        Volt v3 = socketAdapter.get3Volt();
        System.out.println("v3 volts using socket adapter"+v3.getVolts());

        Volt v12 = socketAdapter.get12Volt();
        System.out.println("v12 volts using socket adapter"+v12.getVolts());

        Volt v120 = socketAdapter.get120Volt();
        System.out.println("v120 volts using socket adapter"+v120.getVolts());



        }

}