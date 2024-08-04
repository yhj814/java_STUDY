package lambdaTask;

public class PrintNameTest {
   public void printFullName(PrintName printName, String lastName, String firstName) {
      String fullName = printName.getFullName(lastName, firstName);
      System.out.println(fullName);
   }
   
   public static void main(String[] args) {
      PrintNameTest printNameTest = new PrintNameTest();
      printNameTest.printFullName((l, f) -> l + f, "한", "동석");
      
      System.out.println("A,B,C".split("")[1]);
      //.split은 ""안에 있는 []번방 값을 불러오는것이다
   }
}