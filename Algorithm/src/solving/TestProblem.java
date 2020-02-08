package solving;
import java.util.*;
public class TestProblem {
	public static void main(String[] args) {
		ArrayList <Integer> result = new ArrayList<> ();
		int [] answers = {1,3,2,4,2};
        int [] student1 = {1,2,3,4,5};
        int [] student2 = {2,1,2,3,2,4,2,5};
        int [] student3 = {3,3,1,1,2,2,4,4,5,5};
        int [] countLst = {0,0,0};   // 3���� �л��� ���� ���� ���� ����Ʈ 
        
        // 1. answers�� �л����� ��� ����� ���Ѵ� -> ������ countLst�� �� �л��� �ڸ��� +1�� �Ѵ�.
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
        
        // 2. ��� �л��� ���� ������ ���� ���
        if (countLst[0] == countLst[1]){
        	if (countLst[1] == countLst[2]) {
		        result.add(1);
		        result.add(2);
		        result.add(3);
		        for (int i=0 ; i<result.size() ; i++) {
		        	System.out.println(result.get(i));
            	
            }}
            
            
        }else{
            // 3. countList���� ���� ���� ���� ����� �����Ѵ�.
            // ����Ʈ���� ���� ū ���� ���Ѵ�.
            int maxCount = 0;
            for(int i=0 ; i<countLst.length ; i++){
                if (maxCount < countLst[i]){
                    maxCount = countLst[i];
                }
            }
            System.out.println(maxCount);
             
            // ���� ū ���� ���ؼ� �� ���� �ε���+1 (�л�)�� ��� ����Ʈ�� �߰��Ѵ�. -> �ִ밪�� �� ���� ��츦 ���� ��ġ
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