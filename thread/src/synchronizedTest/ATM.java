package synchronizedTest;

public class ATM implements Runnable{
   private int money;
   
   public ATM() {
      this.money = 10000;
   }
   
   @Override
   public /* synchronized */ void run() {
      for (int i = 0; i < 5; i++) {
         withdraw();
         try {
            Thread.sleep(200);
         } catch (InterruptedException e) {;}
      }
   }
   
   public /* synchronized */ void withdraw() {
      synchronized (this) {
         this.money -= 1000;
      }
      this.money -= 1000;
      System.out.println(Thread.currentThread().getName() + "이(가) 1000원 출금");
      System.out.println("현재 잔액: " + this.money + "원");
   }

}






