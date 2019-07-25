package code;

public class Mother extends Human{
	
	public Mother() {
		
	}
	
	@Override
	public void eat() {
		System.out.println("적게 먹는다.");
	}
	
	public void cook() {
		System.out.println("요리한다.");
	}

}
