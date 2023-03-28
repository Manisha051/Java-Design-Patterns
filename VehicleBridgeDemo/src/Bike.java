public class Bike extends Vehicle{

    private Workshop paintWorkshop;

//    public Bike(Workshop workshop1, Workshop workshop2) {
//        super(workshop1, workshop2);
//    }

    public Bike(Workshop workshop1, Workshop workshop2, Workshop paintWorkshop) {
        super(workshop1, workshop2);
        this.paintWorkshop = paintWorkshop;
    }

    @Override
    public void manufacture() {
        System.out.println("Bike-------------------");
        workshop1.work();
        workshop2.work();
        this.paintWorkshop.work();
    }
}
