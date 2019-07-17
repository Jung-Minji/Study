package ch6;
// 기본형 매개변수와 참조형 매개변수를 동시에 사용한 예제
class ReturnTest {

	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		
		int result = r.add(3,5);
		System.out.println(result);
		
		int [] result2 = {0};
		r.add(3,5,result2);
		System.out.println(result2[0]);
	}
	int add(int a, int b) {  // 기본형 매개변수
		return a + b;
	}
	
	void add(int a, int b, int [] result) {  // 기본형 매개변수 , 참조형 매개변수
		result[0] = a + b;
	}

}
