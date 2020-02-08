package solving;

public class P_YCount {
    public static void main(String[] args) {
    String s = "pPoooyY";
	boolean answer = false;
	int pCount = 0;
	int yCount = 0;

	
	//1. s의 모든 문자를 소문자로 변환한다.
	s = s.toLowerCase();
	
	//2. s의 문자열에서 p와 y의 개수를 센다.
	
	for(int i=0 ; i<s.length() ; i++ ){
//		if (s.charAt(i).equals('p')) {
//			pCount += 1;}
//	    
	    if (s.charAt(i) == 'y'){
	        yCount += 1;}
	}
	
	//3. p와 y의 개수가 같다면 true를 리턴한다.
	        
    if (pCount == yCount)
        answer = true;
    
    if (pCount == 0 && yCount == 0)
        answer = true;
    
    System.out.println(answer);
    
    System.out.println("H"+"a");
    System.out.println('H'+'a');
   
}

}
