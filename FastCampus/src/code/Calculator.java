package code;
/*  # ���� Ŭ���� �����
 * 1. ����� ���� ��� ����� ����ϰ� �־�� �Ѵ�.
 * 2. ����� ���� ��� ����� ������ ���� +,-,*,/,%������ ������ �� �־�� �Ѵ�.
 * 3. �����ڸ� ���ؼ� ���� ��� ������ �ʱⰪ�� �����Ѵ�.
 * 4. ��� ����� int�� �ƴ� ��쿡�� �ݿø��Ͽ� int�� ������ش�.
 * 5. ��� ����� ������ ��� 0���� �Ѵ�.
 * 6. ���� ����� �����Ѵ� �Լ��� �־�� �Ѵ�.
 * Calculator calculator = new Calculator(10);
 * calculator.add(3)
 * calculator.multiple(2)
 * calculator.percent(4)
 * calculator.minus(5) -> 0
 * calculator.getResult()
 * 
 * �� minusCheck �Լ� ����� & ���Ǵ� ��� ������ 
 *  �޾Ƶ��̴� ���ھ��� if���� ����� this.number�� ���¸� Ȯ���ؼ� ���� �������Ѵ�.
 *  ���� ���� 0�������� üũ�ϱ� ���� ���� �޼ҵ� �ؿ��� üũ�Լ��� ����Ѵ�. 
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
