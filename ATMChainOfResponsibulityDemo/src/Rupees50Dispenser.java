public class Rupees50Dispenser implements DispenseChain{


    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
            this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {

                if(currency.getAmount() >= 50)
                {
                    int num = currency.getAmount()/50 ;
                    int rem = currency.getAmount()%50;

                    System.out.println("Dispensing "+num+" 50 Rupees notes.");
                    if(rem !=0 )
                        this.nextChain.dispense(new Currency(rem));
                }
                else {
                    this.nextChain.dispense(currency);
                }
    }
}
