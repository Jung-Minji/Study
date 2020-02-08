package solving;

public class WeekOfDay {
    public static void main(String[] args) {
    	int a = 5;
    	int b = 3;

    	// 1. ������ ��� �迭�� �����Ѵ�.
        String [] dayOfWeek = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        // 2. 1~12�������� �� ���� ��� �迭�� �����Ѵ�.
        int [] day = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        // 3. 1~ a-1���� �� ���� ���ϰ� b-1���� ���� ���� �����Ѵ�.
        int totalDay = 0;
        for (int i=0; i<a-1 ; i++){
            totalDay += day[i];
        }
        totalDay += b-1;
        
        // 4. ������ ���� �� % 7�� ������ ������ ã�´�.
        System.out.println(dayOfWeek[totalDay%7]);	
	}
}

