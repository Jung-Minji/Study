package ch6;

class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; //길이가 3인 Tv객체 배열
		
		for (int i=0;i<tvArr.length;i++) {
			tvArr[i] = new Tv(); // tv객체를 생성해서 배열에 저장
			tvArr[i].channel = i+10;
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
			}
		
		for (int i=0 ;i<tvArr.length;i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
			
		}
		
		
	}

}

