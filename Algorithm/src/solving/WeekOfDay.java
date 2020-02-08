package solving;

public class WeekOfDay {
    public static void main(String[] args) {
    	int a = 5;
    	int b = 3;

    	// 1. 요일이 담긴 배열을 생성한다.
        String [] dayOfWeek = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        // 2. 1~12월각각의 일 수가 담긴 배열을 생성한다.
        int [] day = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        // 3. 1~ a-1월의 일 수를 더하고 b-1일을 더한 값을 도출한다.
        int totalDay = 0;
        for (int i=0; i<a-1 ; i++){
            totalDay += day[i];
        }
        totalDay += b-1;
        
        // 4. 위에서 구한 값 % 7의 값으로 요일을 찾는다.
        System.out.println(dayOfWeek[totalDay%7]);	
	}
}

