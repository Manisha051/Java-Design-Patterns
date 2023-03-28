public class Main {
    public static void main(String[] args) {

        System.out.println("Build a vehicle\n");

        Vehicle bus = new Bus(new Produce(),new Assemble());
        bus.manufacture();


        Vehicle bike1 = new Bike(new Produce(),new Assemble(),new Paint());
        bike1.manufacture();














//        Vehicle bus = new Bus(new Produce(),new Assemble());
//        bus.manufacture();




    }
}