package ch6;

// 클래스 초기화 변수를 사용한 예제

public class StaticBlockTest {
	static int[] arr = new int[10];
	
	static {
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = (int)(Math.random()*10) + 1;// 1과 10사이의 임의의 값을 배열 arr에 저장한다.
		}
	}
	
	public static void main(String[] args) {
		for(int i=0 ; i<arr.length ; i++)
			System.out.println("arr["+i+"] :" + arr[i]);
	}
}
