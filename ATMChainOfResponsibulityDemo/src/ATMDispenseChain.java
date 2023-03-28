public class ATMDispenseChain {

    private DispenseChain c1;

    public ATMDispenseChain() {
        //Initialize the chain
        this.c1 = new Rupees50Dispenser();
        DispenseChain c2 = new Rupees20Dispenser();
        DispenseChain c3 = new Rupees10Dispenser();

        //Setting the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);

    }


    public static void main(String[] args) {


        System.out.println("ATM Dispense Machine----------");

        ATMDispenseChain atmDispenser = new ATMDispenseChain();

        int amount = 490;

        if(amount % 10 != 0)
        {
            System.out.println("Amount should be in multiple of 10 Rs.");
            return;
        }
        atmDispenser.c1.dispense(new Currency(amount));

    }
}