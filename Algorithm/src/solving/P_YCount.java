package solving;

public class P_YCount {
    public static void main(String[] args) {
    String s = "pPoooyY";
	boolean answer = false;
	int pCount = 0;
	int yCount = 0;

	
	//1. s�� ��� ���ڸ� �ҹ��ڷ� ��ȯ�Ѵ�.
	s = s.toLowerCase();
	
	//2. s�� ���ڿ����� p�� y�� ������ ����.
	
	for(int i=0 ; i<s.length() ; i++ ){
//		if (s.charAt(i).equals('p')) {
//			pCount += 1;}
//	    
	    if (s.charAt(i) == 'y'){
	        yCount += 1;}
	}
	
	//3. p�� y�� ������ ���ٸ� true�� �����Ѵ�.
	        
    if (pCount == yCount)
        answer = true;
    
    if (pCount == 0 && yCount == 0)
        answer = true;
    
    System.out.println(answer);
    
    System.out.println("H"+"a");
    System.out.println('H'+'a');
   
}

}
