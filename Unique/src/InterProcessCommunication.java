class Customer{
  int amount =1000;
  synchronized void withdraw(int amount){
      System.out.println("Going to withdraw Amount ");
      if(this.amount<amount){
          System.out.println("less balance ; waitimg for deposit : ");
          try{
              wait();
          }
          catch(Exception e){
              System.out.println(e);
          }
      }
      this.amount=this.amount-amount;
      System.out.println("widtharaw Completed ..."+amount);
  }
  synchronized void deposit(int amount ){
      System.out.println("Going to deposit ... ");
      this.amount=this.amount+amount;
      System.out.println("deposited amount: "+amount);
      notify();
  }

}
public class InterProcessCommunication{
    public static void main(String[] args){
        final Customer c=new Customer();
        new Thread(){
            public void run(){
                c.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run(){
                c.deposit(10000);
            }
        }.start();
    }
}

