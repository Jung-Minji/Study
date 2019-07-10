package code;

/* # 1


 * 1. ArrayList 2���� �����.
 * 2. ù��° ArrayList���� 0���� 9���� ���� �ִ´�.(�ݺ��� ���)
 * 3. �ι�° ArrayList���� ù��° ArrayList�� ���� �ϳ��� Ȯ���� ��
 * 5���� ������ true�� �ְ� �׷��� ������ false�� �ִ´�.(�ݺ��� ���)
 * 
 * # 2 
 * 1. 0���� 9���� ����ִ� �迭�� �����.
 * 2. �迭 �ȿ� �ִ� Ȧ���� ������ �����ϴ� �Լ��� �����. -> howMannyOdds
 * �Լ��� ���鶧 public���� static���̱�
 * 
 * # 3 
 * 1. 0���� 9���� ����ִ� ArrayList�����.
 * 2. 9���� 0���� ����ִ� ArrayList�����.
 * 3. �� ArrayList�� ���� �ε����� ������ ���� ����ϴ� �Լ��� �����. -> multipleTwoArrayLists
 * 
 * �� �Լ��� ���鶧 main�� �ۿ��� �����. public static ��ȯ�� �ڷ��� �Լ���(�Ű�����){���๮}
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
	
	//�Լ� �����
	
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
