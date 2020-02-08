package solving;

import java.util.Queue;
import java.util.LinkedList;
class Solution {
    int plus(Queue<Integer> q){
        int sum1 = 0;
        while(!q.isEmpty()){
            sum1 += q.poll();
        }
    return sum1;
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> passing = new LinkedList<>();
        Queue<Integer> truck = new LinkedList<>();
        
        for (int i=0 ; i<bridge_length; i++){
            passing.add(0);
        }
        
        for(int i=0 ; i<truck_weights.length; i++){
        	System.out.println(truck_weights[i]);
            truck.add(truck_weights[i]);
        }
        
        while (!passing.isEmpty()){
            answer ++;
            System.out.println("q: " + passing);
            passing.poll();
            if (!truck.isEmpty()){
                System.out.println("sum " + plus(passing));
                if (plus(passing) + truck.peek() <= weight){
                	System.out.println("truck: " + truck);
                	int t = truck.poll();
                	System.out.println("add: " + t);
                    passing.add(t);
                }else{
                    passing.add(0);
                }
            }
            
        }
        return answer;
    }
}

public class test {
	static int print(Queue<Integer> q){
	    int sum = 0;
	    while(q.size() > 0){
	        sum += q.poll();
	    }
	    return sum;
	}
	 public static void main (String[] args) {
		 Solution s = new Solution();
		 int l = 2;
		 int m = 2;
		 int[] a = new int[4];
		 System.out.println(s.solution(l, m, a));
		 Queue<Integer> queue = new LinkedList<>();
		 queue.add(0);
		 queue.add(1);
		 System.out.println(queue);

	 }
}






