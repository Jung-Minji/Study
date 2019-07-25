package code;

public class Father extends Human{
	
	public Father() {
		
	}
	
	@Override
	public void eat() {
		System.out.println("¸¹ÀÌ ¸Ô´Â´Ù.");
	}

	public void work() {
		System.out.println("ÀÏÇÑ´Ù.");
	}
	
	public void wash(String sampoo) {
		System.out.println("¼¤Çª·Î ¾Ä´Â´Ù.");
	}
	

}
