package set.test;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
   public static void main(String[] args) {
      HashSet<String> bloodTypeSet = new HashSet<String>();
      
      bloodTypeSet.add("A");
      bloodTypeSet.add("O");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("B");
      bloodTypeSet.add("O");
      bloodTypeSet.add("O");
      bloodTypeSet.add("A");
      
      //hashset으로 값을 막 넣어도 Iterator 를 쓰면 순서가 없는 객체에게 순서를 부여하고,
      //순서가 있는 객체더라도 Iteratoe에 맞게 순서를 부여한다
      Iterator<String> iter=bloodTypeSet.iterator();
      
      //hasNext()를 사용하면, 다름 값이 있는지 검사하고 next()를 사용해서 값을 가져올 수 있다.
      while(iter.hasNext()) {
    	  System.out.println(iter.next());
      }
   }
}