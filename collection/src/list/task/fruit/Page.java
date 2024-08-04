package list.task.fruit;

import java.util.ArrayList;

public class Page {
   public static void main(String[] args) {
      Fruit melon = new Fruit("멜론", 15000);
      Fruit apple = new Fruit("사과", 5000);
      
      Market market = new Market();
      
      if(market.checkFruitName(melon.getName()) == null) {
         market.add(melon);
      }
    
      if(market.checkFruitName(apple.getName()) == null) {
         market.add(apple);
      }
      
      ArrayList<Fruit> fruits = market.findAll();
      System.out.println(fruits);
      
      market.remove(apple);
      
      fruits = market.findAll();
      //한번더 조회를 해야 삭제가됨
      System.out.println(fruits);
      
      System.out.println(market.checkPrice(melon));
      //평균가격보다 멜론가격이 높기 때문에 null출력
      System.out.println(market.checkPrice(apple));
      //평균가격보다 사과가격이 낮기 때문에 사과가 출력
      System.out.println(market.checkFruitName("멜론").getPrice());
      //맬론의 가격을 출력
   }
}
