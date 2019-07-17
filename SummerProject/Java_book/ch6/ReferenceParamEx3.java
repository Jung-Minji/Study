package ch6;
// 참조형 변수 응용한 문제 
// 메소드를 이용하여 배열의 요소 출력, 오름차순으로 정렬

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		int [] arr = {3,2,1,6,5,4};
		
		printArr(arr);  // 배열의 모든 요소를 출력하는 메소드
		sortArr(arr);   // 배열의 값을 정렬하는 메소드
		printArr(arr);  // 정렬한 배열 출력 
		System.out.println("sum=" + sumArr(arr));
	}
	
	static void printArr(int [] arr) {
		System.out.print("[");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("]");
	}
	
	static void sortArr(int [] arr) {   // 오름차순으로 배열 정리하는 메소드
		for(int i=0;i<arr.length-1;i++) 
			for(int j=0;j<arr.length-1-i;j++) 
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;}
	}
	
	static int sumArr(int [] arr) {
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	

}
