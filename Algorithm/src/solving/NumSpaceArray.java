package solving;
import java.util.*;
public class NumSpaceArray {
  public static void main(String[] args) {
	int x = 2;
	int n = 5;

  long[] answer = new long[n];
  long newX = x;
  for (int i=0 ; i<n ; i++){
      
      System.out.println(newX);
      answer[i] = newX;
      newX += x;
      System.out.println(newX);}
  System.out.println("ddddddddddd");
  
  for (int i=0; i< answer.length ; i++) {
  System.out.println(answer[i]);}
	

}

}
