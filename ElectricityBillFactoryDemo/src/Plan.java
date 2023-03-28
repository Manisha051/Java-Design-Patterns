public abstract class Plan {

    protected double rate;
    abstract void setRate();

    public void calculateBill(int units)
    {
        System.out.println("Your bill is Rs. "+units*rate);
    }
}
