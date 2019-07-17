package ch6;
// 참조형 변수가 배열인 경우에도 값을 읽고 변경할 수 있다. 
public class ReferenceEx2 {

	public static void main(String[] args) {
		int [] x = {10};
		x[0] = 10;
		System.out.println("main() : x = " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);
		
	}
	
	static void change(int[] x) {
		x[0] = 10000;
		System.out.println("change() : x = " + x[0]);
	}

}
