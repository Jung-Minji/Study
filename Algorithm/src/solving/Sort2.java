package solving;

import java.util.*;
public class Sort2 {
  public static void main(String[] args) {
	  String s = "Zbcdefg";
	  String answer = "";
	  char [] lst = new char [s.length()];
	  
	  //1. ���ڿ�s�� ������ ���ڸ� �迭�� ��´�.
	  for (int i=0 ; i<s.length() ; i++){
	      lst[i] = s.charAt(i);
	  }
	  
	  //2. �迭�� ������������ �����Ѵ�.
	  Arrays.sort(lst);
	  
	  //3. ������������ ������ �迭�� ������ �ݴ�� �Ͽ� ���ڿ��� ���ڸ� ��ģ��.
	  for (int i=0 ; i<lst.length ; i++) {
		  answer += lst[lst.length-(i+1)];
		  
	  }
	  
	  //4. answer�� ������ ����Ѵ�.
	  System.out.println(answer);
	  
	  
	  
	  
	  

	}

}
