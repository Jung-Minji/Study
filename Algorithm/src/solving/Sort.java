package solving;

import java.util.Arrays;

public class Sort {
  public static void main (String[] args) {
	  String [] strings = {"sun", "bed", "car"};
      
	  // 1. strings의 모든 요소의 첫번째 인덱스에 문자열[n]의 문자를 추가해서 새로운 배열에 값을 넣는다.
      String [] newArr = new String[strings.length];
      char newString;
      for(int i = 0; i < strings.length ; i++) {
          
          newString = strings[i].charAt(1);
          strings[i] = newString + strings[i];
          newArr[i] = strings[i];}
        
      // 2. newArr를 오름차순으로 배열한다.
      Arrays.sort(newArr);
          
      // 3. 1번 과정에서 추가했던 문자를 제거한다.
	      for (int i = 0 ; i < newArr.length ;  i++){
	          newArr[i] = newArr[i].substring(1,newArr[i].length());
	      }
	      
	      for (String i : newArr)
	    	  System.out.println(i);
  }
}
