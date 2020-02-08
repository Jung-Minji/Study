package solving;

public class StringCheck {
  public static void main(String[] args) {
	  boolean answer = true;
	  String s = "a234";
   
      //1. s의 길이가 4또는 6가 아니면 answer = false
      
       if (s.length() != 4 && s.length() != 6)
           answer = false;
       
      //2. 만약 answer 가 true 일 때 s안의 요소가 숫자인지 아닌지를 판별한다.
      // --> 만일 숫자가 아닌 값이 하나라도 있다면 answer = false
      // 방법 문자열 s를 실수로 변환했을 때 에러가 난다면 숫자가 없는 것!
      // --> 따라서 문자열을 실수로 변환시키는 방법과 에러구문 처리 방법이 필요하다.
      if (answer == true){

      try {
          Double.parseDouble(s);
      }
      catch(NumberFormatException e){
              answer = false;        
          }
      }
      
      // s에 e가 들어간다면 false를 출력해야 한다. 하지만 2번과정을 거쳤을 때 e를 부동소수점처리를 하여 true를 리턴한다. 따라서 예외처리를 해준다.
      for(int i = 0 ; i<s.length() ; i++){
          if (s.charAt(i) == 'e')
              answer = false;
      }
      System.out.println(answer);
      
      String s1 = "1e22";
      System.out.println(Double.parseDouble(s1));
 }
}
