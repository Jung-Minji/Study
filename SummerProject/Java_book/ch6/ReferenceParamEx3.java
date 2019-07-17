package ch6;
// ������ ���� ������ ���� 
// �޼ҵ带 �̿��Ͽ� �迭�� ��� ���, ������������ ����

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		int [] arr = {3,2,1,6,5,4};
		
		printArr(arr);  // �迭�� ��� ��Ҹ� ����ϴ� �޼ҵ�
		sortArr(arr);   // �迭�� ���� �����ϴ� �޼ҵ�
		printArr(arr);  // ������ �迭 ��� 
		System.out.println("sum=" + sumArr(arr));
	}
	
	static void printArr(int [] arr) {
		System.out.print("[");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("]");
	}
	
	static void sortArr(int [] arr) {   // ������������ �迭 �����ϴ� �޼ҵ�
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
