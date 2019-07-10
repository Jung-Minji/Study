package code;

/* # 1


 * 1. ArrayList 2개를 만든다.
 * 2. 첫번째 ArrayList에는 0부터 9까지 값을 넣는다.(반복문 사용)
 * 3. 두번째 ArrayList에는 첫번째 ArrayList의 값을 하나씩 확인한 후
 * 5보다 작으면 true를 넣고 그렇지 않으면 false를 넣는다.(반복문 사용)
 * 
 * # 2 
 * 1. 0부터 9까지 들어있는 배열을 만든다.
 * 2. 배열 안에 있는 홀수의 갯수를 리턴하는 함수를 만든다. -> howMannyOdds
 * 함수를 만들때 public다음 static붙이기
 * 
 * # 3 
 * 1. 0부터 9까지 들어있는 ArrayList만든다.
 * 2. 9부터 0까지 들어있는 ArrayList만든다.
 * 3. 두 ArrayList의 같은 인덱스의 값들의 곱을 출력하는 함수를 만든다. -> multipleTwoArrayLists
 * 
 * ※ 함수를 만들때 main문 밖에서 만든다. public static 반환할 자료형 함수명(매개변수){실행문}
 */

import java.util.*;
public class HW1 {
	public static void main(String[] args) {
		
		//# 1
		ArrayList <Integer> Array1 = new ArrayList<Integer>();
		ArrayList <Boolean> Array2 = new ArrayList<Boolean>();
		
		for (int i=0 ;i<10;i++) {
			Array1.add(i);
		}
		
		for (int i=0;i<Array1.size();i++) {
			if (Array1.get(i) < 5) {
				Array2.add(true);}
			else {
					Array2.add(false);
				}
		}
		System.out.println(Array1);
		System.out.println(Array2);
		
		
		//#2
		ArrayList<Integer> Array3 = new ArrayList<>();
		for (int i=0 ;i<10;i++) {
			Array3.add(i);
		}
		System.out.println(howManyOdds(Array3));
		
		//#3 
		ArrayList<Integer> Array4 = new ArrayList<>();
		ArrayList<Integer> Array5 = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			Array4.add(i);
		}
		
		for(int i=9;i>=0;i--) {
			Array5.add(i);
		}
		System.out.println(Array5);
		multipleTwoArrayLists(Array4, Array5);
		
	}
	
	//함수 만들기
	
	public static int howManyOdds(ArrayList<Integer>lst) {
		int count = 0;
		for (int i=0;i<lst.size();i++) {
			if (lst.get(i)%2 ==1) {
				count += 1;}
			}return count;
	}
	
	public static void multipleTwoArrayLists(ArrayList<Integer>lst_1,ArrayList<Integer>lst_2) {
		for(int i=0;i<lst_1.size();i++) {
			int result = lst_1.get(i) * lst_2.get(i);
			System.out.println(result);
			
		}
		
	}
	
	
	
	
	
	
	
	
}
