package solving;

import java.util.*;
public class Sort2 {
  public static void main(String[] args) {
	  String s = "Zbcdefg";
	  String answer = "";
	  char [] lst = new char [s.length()];
	  
	  //1. 문자열s의 각각의 문자를 배열에 담는다.
	  for (int i=0 ; i<s.length() ; i++){
	      lst[i] = s.charAt(i);
	  }
	  
	  //2. 배열을 오름차순으로 정렬한다.
	  Arrays.sort(lst);
	  
	  //3. 오름차순으로 정렬한 배열의 순서를 반대로 하여 문자열에 문자를 합친다.
	  for (int i=0 ; i<lst.length ; i++) {
		  answer += lst[lst.length-(i+1)];
		  
	  }
	  
	  //4. answer이 내용을 출력한다.
	  System.out.println(answer);
	  
	  
	  
	  
	  

	}

}
