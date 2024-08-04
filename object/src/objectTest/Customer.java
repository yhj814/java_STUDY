package objectTest;

import java.util.Objects;

public class Customer {
   private int id;
   private String name;
   //기본생성자
   public Customer() {;}
   
   //초기화 생성자
   public Customer(int id, String name) {
      this.id = id;
      this.name = name;
   }
   
   //getter setter
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   
   //toString
   @Override
   public String toString() {
      return "Customer [id=" + id + ", name=" + name + "]";
   }

@Override
public int hashCode() {
	return Objects.hash(id, name);
}

@Override
public boolean equals(Object obj) {
	//주소가 같은지
	if (this == obj)
		return true;
	//주소가 다른지
	if (obj == null)
		return false;
	//클래스타입이 다르면
	if (getClass() != obj.getClass())
		return false;
	//전달한 값이 같은지 이름은 문자열이기 때문에 equals 로 비교
	Customer other = (Customer) obj;
	return id == other.id && Objects.equals(name, other.name);
}
   
   
//   @Override
//   public boolean equals(Object obj) {
//      if(this == obj) {
//         return true;
//      }
//      
//      if(obj instanceof Customer) {
//         Customer anotherCustomer = (Customer)obj;
//         return this.id == anotherCustomer.id;
//      }
//      
//      return false;
//   }
   
}
