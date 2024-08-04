package staticTest;

public class Company {
	String name;
	int income;
	// 수익
	static int totalIncome;
	// 회사수익, 회사의 자본은 모든 직원이 공유하기 때문에 static 으로 선언

	public Company() {;}
	// 객체화시, 오류 발생을 막기위해 기본생성자를 직접 만들어 놓는다
	// 혹시라도 다른 개발자가 초기화 생성자를 선언하더라도
	// 오버로딩덕분에 문제가 생기지 않을 것이다.

	public Company(String name, int income) {
		this.name = name;
		this.income = income;
	}

	void getIncome(int income) {
		this.income = income;
		totalIncome += this.income;
	}
}
