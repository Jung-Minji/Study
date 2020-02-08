package solving;

import java.util.*;
public class NumDescendingArray {
  public static void main(String[] args) {
  long answer = 0;
  long n = 118372;
  String stringN = "";
  
  // 1. n�� �����̹Ƿ� n�� ���ڿ��� ����ȯ�Ѵ�.
  stringN = Long.toString(n);
  
  // 2. ���ڿ� n�� �� �ڸ��� �迭�� ��´�.
  long [] num = new long[stringN.length()];
  for(int i=0 ; i < stringN.length() ; i++){
      num[i] = stringN.charAt(i);
  }

  // 3. �迭�� ������������ �����Ѵ�.
  Arrays.sort(num);
  
  // 4. �迭�� ������ �Ųٷ��Ͽ� ���ο� ���ڿ��� ��´�.
  String newString = "";
  
  for(int i=0 ; i<num.length ; i++){
      newString += String.valueOf(num[num.length - (i+1)]);
      
  }
  
  // 5. ���ڿ��� longŸ������ ����ȯ�Ͽ� �����Ѵ�.
  answer = Long.parseLong(newString);
  System.out.println(answer);
  
  }
}
