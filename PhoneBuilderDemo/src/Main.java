public class Main {
    public static void main(String[] args) {

//        Phone phone = new Phone("Android",4,"AMD",5.5,3000);
//        System.out.println(phone);
//
//        Phone phone1 = new Phone("Windows");
//        Phone phone2 = new Phone("Android","Qualcomm");

        Phone phone = new PhoneBuilder().getPhone();
        System.out.println(phone);

        Phone phone1 = new PhoneBuilder().setOs("Windows").setRam(4).setScreenSize(5).getPhone();
        System.out.println(phone1);

    }
}