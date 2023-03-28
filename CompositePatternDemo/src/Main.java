public class Main {
    public static void main(String[] args) {


        //Leaf
        Component hdd = new Leaf("HDD",5000);
        Component ram = new Leaf("RAM",5000);
        Component cpu = new Leaf("CPU",15000);
        Component keyboard = new Leaf("Keyboard",800);
        Component mouse = new Leaf("Mouse",500);

        Composite cabinet = new Composite("Cabinet");
        Composite motherboard = new Composite("Motherboard");
        Composite peripherals = new Composite("Peripherals");
        Composite computer = new Composite("Computer");

        motherboard.addComponent(ram);
        motherboard.addComponent(cpu);

        cabinet.addComponent(hdd);
        cabinet.addComponent(motherboard);

        peripherals.addComponent(keyboard);
        peripherals.addComponent(mouse);

        computer.addComponent(cabinet);
        computer.addComponent(peripherals);

        computer.showPrice();


    }
}