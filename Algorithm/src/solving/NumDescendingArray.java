package solving;

import java.util.*;
public class NumDescendingArray {
  public static void main(String[] args) {
  long answer = 0;
  long n = 118372;
  String stringN = "";
  
  // 1. n이 정수이므로 n을 문자열로 형변환한다.
  stringN = Long.toString(n);
  
  // 2. 문자열 n을 한 자리씩 배열에 담는다.
  long [] num = new long[stringN.length()];
  for(int i=0 ; i < stringN.length() ; i++){
      num[i] = stringN.charAt(i);
  }

  // 3. 배열을 오름차순으로 정렬한다.
  Arrays.sort(num);
  
  // 4. 배열의 순서를 거꾸로하여 새로운 문자열에 담는다.
  String newString = "";
  
  for(int i=0 ; i<num.length ; i++){
      newString += String.valueOf(num[num.length - (i+1)]);
      
  }
  
  // 5. 문자열을 long타입으로 형변환하여 리턴한다.
  answer = Long.parseLong(newString);
  System.out.println(answer);
  
  }
}
