public class PlanFactory {


    public Plan getInstance(String type)
    {
        if(type == null)
            return null;

        if(type.equalsIgnoreCase("domestic"))
            return new DomesticPlan();
        else if (type.equalsIgnoreCase("commercial")) {
            return new CommercialPlan();
        } else if (type.equalsIgnoreCase("institutional")) {
            return new InstutionalPlan();
        }

        return null;
    }
}
