package ch6;

class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; //���̰� 3�� Tv��ü �迭
		
		for (int i=0;i<tvArr.length;i++) {
			tvArr[i] = new Tv(); // tv��ü�� �����ؼ� �迭�� ����
			tvArr[i].channel = i+10;
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
			}
		
		for (int i=0 ;i<tvArr.length;i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
			
		}
		
		
	}

}
