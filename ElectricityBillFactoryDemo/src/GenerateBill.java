public class GenerateBill {
    public static void main(String[] args) {

        PlanFactory factory = new PlanFactory();

        System.out.println("=======Know your Bill========\n");
        System.out.println("Bill for domestic plan for 50 units:");
    //    Plan domesticPlan = new DomesticPlan();
        Plan domesticPlan = factory.getInstance("Domestic");
        domesticPlan.setRate();
        domesticPlan.calculateBill(50);



        System.out.println("Bill for institutional plan for 80 units:");
      //  Plan institutionalPlan = new InstutionalPlan();
        Plan institutionalPlan = factory.getInstance("institutional");
        institutionalPlan.setRate();
        institutionalPlan.calculateBill(80);

        System.out.println("Bill for commercial plan for 100 units:");
       // Plan commercialPlan = new CommercialPlan();
        Plan commercialPlan = factory.getInstance("COMMERCIAL");
        commercialPlan.setRate();
        commercialPlan.calculateBill(100);



    }
}