public class Main {
    public static void main(String[] args) {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                B a1 = B.getInstance();
                System.out.println(a1);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                B a1 = B.getInstance();
                System.out.println(a1);
            }
        });

      t1.start();
      t2.start();


    }
}


class A{

    private static A obj; //Eager

    private A()
    {
        System.out.println("Instance created for A");
    }

    public static A getInstance()
    {
        if(obj == null)
        {
            synchronized (A.class)      //Double check locking
            {
                if(obj == null)
                    obj = new A();
            }
        }


        return obj;
    }

}

class B
{
    private B()
    {
        System.out.println("Instance creadted for B");
    }

    private static class BillPughSingleton{
        private static final B obj = new B();
    }

    public static B getInstance()
    {
        return BillPughSingleton.obj;
    }
}