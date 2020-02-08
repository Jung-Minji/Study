package solving;

public class StringCheck {
  public static void main(String[] args) {
	  boolean answer = true;
	  String s = "a234";
   
      //1. s�� ���̰� 4�Ǵ� 6�� �ƴϸ� answer = false
      
       if (s.length() != 4 && s.length() != 6)
           answer = false;
       
      //2. ���� answer �� true �� �� s���� ��Ұ� �������� �ƴ����� �Ǻ��Ѵ�.
      // --> ���� ���ڰ� �ƴ� ���� �ϳ��� �ִٸ� answer = false
      // ��� ���ڿ� s�� �Ǽ��� ��ȯ���� �� ������ ���ٸ� ���ڰ� ���� ��!
      // --> ���� ���ڿ��� �Ǽ��� ��ȯ��Ű�� ����� �������� ó�� ����� �ʿ��ϴ�.
      if (answer == true){

      try {
          Double.parseDouble(s);
      }
      catch(NumberFormatException e){
              answer = false;        
          }
      }
      
      // s�� e�� ���ٸ� false�� ����ؾ� �Ѵ�. ������ 2�������� ������ �� e�� �ε��Ҽ���ó���� �Ͽ� true�� �����Ѵ�. ���� ����ó���� ���ش�.
      for(int i = 0 ; i<s.length() ; i++){
          if (s.charAt(i) == 'e')
              answer = false;
      }
      System.out.println(answer);
      
      String s1 = "1e22";
      System.out.println(Double.parseDouble(s1));
 }
}
