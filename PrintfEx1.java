class  PrintfEx1
{
	public static void main(String[] args) 
	{
		byte b = 1;
		short s = 2;
		char c = 'A';
		double f = 99994.5673;

		int finger = 123456;
		long big = 100_000_000l;
		long hex = 0xFFFF_FFFF_FFFF_FFFFl;

		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;

		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c%n", c, (int)c);
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%x%n",hex);
		System.out.printf("outNum=%o, %d%n",octNum,octNum);
		System.out.printf("hexNum=%x, %d%n" ,hexNum,hexNum);
		System.out.printf("binNum=%b, %d%n",Integer.toBinaryString(binNum),binNum); //10진수를 2진수로 출력해주는 지시자는 없기 때문에 정수를 2진수로 바꿔주기 위해 사용 
		System.out.printf("f=%f, [%0.2f]%n",f,f);
		

	}
}
