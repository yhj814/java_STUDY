package objectTest;

public class EqualsTest {
   public static void main(String[] args) {
      Customer customer = new Customer(1, "Mike");
      
      System.out.println(customer.equals(new Customer(1, "Mike")));
      //주소가 다르기떄문에 equals로 문자열 값이 같나 확인
   }
}