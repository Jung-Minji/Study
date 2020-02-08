package solving;
import java.util.*;
public class TestProblem {
	public static void main(String[] args) {
		ArrayList <Integer> result = new ArrayList<> ();
		int [] answers = {1,3,2,4,2};
        int [] student1 = {1,2,3,4,5};
        int [] student2 = {2,1,2,3,2,4,2,5};
        int [] student3 = {3,3,1,1,2,2,4,4,5,5};
        int [] countLst = {0,0,0};   // 3명의 학생의 정답 개수 저장 리스트 
        
        // 1. answers와 학생들이 찍는 방식을 비교한다 -> 맞으면 countLst에 각 학생의 자리에 +1을 한다.
        for (int i = 0 ; i<answers.length ; i++){
            if (student1[i] == answers[i]){
                countLst[0] += 1;
            }
            if (student2[i] == answers[i]){
                countLst[1] += 1;
            }
            if (student3[i] == answers[i]){
                countLst[2] += 1;
            }     
        }
        for (int i=0 ; i<countLst.length ;i++) 
        	System.out.println(countLst[i]);
        
        // 2. 모든 학생의 정답 개수가 같은 경우
        if (countLst[0] == countLst[1]){
        	if (countLst[1] == countLst[2]) {
		        result.add(1);
		        result.add(2);
		        result.add(3);
		        for (int i=0 ; i<result.size() ; i++) {
		        	System.out.println(result.get(i));
            	
            }}
            
            
        }else{
            // 3. countList에서 가장 많이 맞은 사람을 리턴한다.
            // 리스트에서 가장 큰 값을 구한다.
            int maxCount = 0;
            for(int i=0 ; i<countLst.length ; i++){
                if (maxCount < countLst[i]){
                    maxCount = countLst[i];
                }
            }
            System.out.println(maxCount);
             
            // 가장 큰 값과 비교해서 그 값의 인덱스+1 (학생)을 결과 리스트에 추가한다. -> 최대값이 두 개인 경우를 위한 장치
            for (int i=0 ; i<countLst.length ; i++){
                if (maxCount == countLst[i]){
                    result.add(i+1);
                }
            }
        }
        for (int i=0 ; i<result.size() ; i++) {
        	System.out.println(result.get(i));
        	
        }
        int [] arr = new int[result.size()];
        for (int i=0 ; i<result.size() ; i++) {
        	arr[i] = result.get(i);
        }
        
        for (int i=0 ; i<arr.length ; i++) {
        	System.out.println(arr[i]);
        	
        }

 }

}