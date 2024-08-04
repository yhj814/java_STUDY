package staticTest;

public class Gangnam {
	   public static void main(String[] args) {
	      Company 박슬기 = new Company();
	      Company 하민지 = new Company();
	      Company 최대환 = new Company();
	      
//	      박슬기.income = 1_000_000;
//	      하민지.income = 500_000;
//	      최대환.income = 1_500_000;
	      
	      //Company.totalIncome = 박슬기.income + 하민지.income + 최대환.income;
	      // 굳이 객체로 접근하지 않고 totalIncome static 으로 선언을 했기 때문에 company 클래스에
	      // 바로 접근하여 알수 있다.
	      박슬기.getIncome(1_000_000);
	      하민지.getIncome(500_000);
	      최대환.getIncome(1_500_000);
	      //메소드로 더 편하게 할수 있다
	      //많은 직원들 관리할때 편함
	      
	      System.out.println(Company.totalIncome);

	   }
	}