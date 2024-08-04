package classTest;

public class ClassTask3 {
   public static void main(String[] args) {
//      마켓은 단 1개이다.
//      2명의 손님이
//      상품을 각각 구매하면
//      할인율에 맞게 잔액이 반영된다.
      Market emart = new Market("새우깡", 1200, 10);
      
      Customer[] arCustomer = {
            new Customer("한동석", "01012341234", 10000, 30),
            new Customer("오현준", "01099998888", 1000000, 0),
      };
      
      for (int i = 0; i < arCustomer.length; i++) {
         emart.sell(arCustomer[i]);
      }
      
      System.out.println(emart.stock + "개의 재고");
      
      for (int i = 0; i < arCustomer.length; i++) {
         System.out.println(arCustomer[i].name + "님의 현재 잔액: "+ arCustomer[i].money + "원");
         System.out.println(arCustomer[i].name+"님의 전화번호 : "+arCustomer[i].phone+"\n");
         
      }
      
   }
}
