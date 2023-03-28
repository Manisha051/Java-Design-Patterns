public class Glo {
    public static void main(String[] args) {


        System.out.println("Observer pattern demo\n");

        Community techTrek = new Community("TechTrek");

        Subscriber s1 = new Subscriber("Manisha");
        Subscriber s2 = new Subscriber("Minakshi");
        Subscriber s3 = new Subscriber("Vipin");

        s1.subscribeCommunity(techTrek);
        s2.subscribeCommunity(techTrek);
        s3.subscribeCommunity(techTrek);

        techTrek.uploadEvent("\"Tech talk on Kafka Day1\"");

        s1.unSubscribeCommunity(techTrek);

        System.out.println("\n\n");

        techTrek.uploadEvent("\"Tech talk on Kafka Day 2\"");




       // s5.unSubscribeCommunity(techTrek);
       // System.out.println("\n\n");
       // techTrek.uploadEvent("\"Tech talk on Java Design Patterns, Day2\"");


    }
}