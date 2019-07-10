package code;
/*  # 계산기 클래스 만들기
 * 1. 계산기는 이전 계산 결과를 기억하고 있어야 한다.
 * 2. 계산기는 이전 계산 결과에 정수에 대한 +,-,*,/,%연산을 수행할 수 있어야 한다.
 * 3. 생성자를 통해서 이전 계산 변수의 초기값을 설정한다.
 * 4. 계산 결과가 int가 아닌 경우에는 반올림하여 int로 만들어준다.
 * 5. 계산 결과가 음수인 경우 0으로 한다.
 * 6. 최종 결과를 리턴한는 함수가 있어야 한다.
 * Calculator calculator = new Calculator(10);
 * calculator.add(3)
 * calculator.multiple(2)
 * calculator.percent(4)
 * calculator.minus(5) -> 0
 * calculator.getResult()
 * 
 * ※ minusCheck 함수 만들기 & 사용되는 방법 익히기 
 *  받아들이는 인자없이 if문을 사용해 this.number의 상태를 확인해서 값을 재정의한다.
 *  계산된 수가 0이하인지 체크하기 위해 연산 메소드 밑에서 체크함수를 사용한다. 
 */

public class Calculator {
	int number;
	
	public Calculator(int number) {
		this.number = number;
	}
	
	public void add(int addNumber) {
		this.number += addNumber;
		minusCheck();
	}
	
	public void multiple(int multiNumber) {
		this.number = this.number * multiNumber;
		minusCheck();
	}
	
	public void percent(int percentNumber) {
		this.number = this.number % percentNumber;
		minusCheck();
	}
	
	public void minus(int minusNumber) {
		this.number -= minusNumber;
		minusCheck();
	}
	
	public void div(int divNumber) {
		this.number = this.number / divNumber;
		minusCheck();
	}
	
	public void minusCheck() {
		if (this.number < 0) {
			this.number = 0;
		}
	}
	
	public void getResult() {
		System.out.println(number);
	}
	




public static void main(String[] args) {
	Calculator myCal = new Calculator(10);
	myCal.add(3);
	myCal.minus(3);
	myCal.multiple(2);
	myCal.minus(20);
	myCal.getResult();
}
}
