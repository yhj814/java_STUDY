package anonymousTest;

public class Building {
   public static void main(String[] args) {
//      무료나눔 행사중이기 때문에 판매방식은 구현할 필요 없다.
      Starbucks jamsil = new Starbucks();
      System.out.println("잠실점");
      jamsil.register(new FormAdapter() {
         //익명클래스 사용
         @Override
         public String[] getMenu() {
            return new String[] {"아메리카노", "카페라떼"};
         }
      });
      
      Starbucks gangnam = new Starbucks();
      System.out.println("강남점");
      gangnam.register(new Form() {
         
         @Override
         public void sell(String order) {
            String[] menu = getMenu();
            for (int i = 0; i < menu.length; i++) {
               if(menu[i].equals(order)) {
                  System.out.println(order + " 판매완료");
               }
            }
         }
         
         @Override
         public String[] getMenu() {
            return new String[] {"아메리카노", "카페라떼"};
         }
      });
   }
}

