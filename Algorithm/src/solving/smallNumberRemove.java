package solving;
import java.util.*;
public class smallNumberRemove {
	public static void main(String[] args) {
		
      int[] arr = {4,3,2,1};
      int[] answer = new int[arr.length-1];
      ArrayList <Integer> lst = new ArrayList <> ();
     
      
      for (int i=0 ; i<arr.length ; i++){
          lst.add(arr[i]);
      }
      for (int i=0 ; i<lst.size() ;i++ )
          System.out.println("lst:"  + lst.get(i));
         
     System.out.println(arr.length);
      if (arr.length == 1){
          answer[0] = -1;
      }else{
    	  System.out.println("in");
    	  int small = lst.get(0);
          for(int i=1 ; i<lst.size() ; i++){
              if (small > lst.get(i)){
                  small = lst.get(i);
                  System.out.println("small:"+small);
              }
          }
          lst.remove(small);
          
      }
      for (int i=0 ; i<lst.size() ;i++){
          answer[i] = lst.get(i);
      }
      for (int i=0 ; i<answer.length ;i++ )
      System.out.println("answer: " + answer[i]);
     
  
	
	}

}
