package solving;

import java.util.Arrays;

public class Sort {
  public static void main (String[] args) {
	  String [] strings = {"sun", "bed", "car"};
      
	  // 1. strings�� ��� ����� ù��° �ε����� ���ڿ�[n]�� ���ڸ� �߰��ؼ� ���ο� �迭�� ���� �ִ´�.
      String [] newArr = new String[strings.length];
      char newString;
      for(int i = 0; i < strings.length ; i++) {
          
          newString = strings[i].charAt(1);
          strings[i] = newString + strings[i];
          newArr[i] = strings[i];}
        
      // 2. newArr�� ������������ �迭�Ѵ�.
      Arrays.sort(newArr);
          
      // 3. 1�� �������� �߰��ߴ� ���ڸ� �����Ѵ�.
	      for (int i = 0 ; i < newArr.length ;  i++){
	          newArr[i] = newArr[i].substring(1,newArr[i].length());
	      }
	      
	      for (String i : newArr)
	    	  System.out.println(i);
  }
}
