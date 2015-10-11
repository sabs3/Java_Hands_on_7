
public class Constructor {
	
	private int intNum;
	private double floatNum;
	
	public Constructor(){
		System.out.println("I do not take any attributes");
	}

	public Constructor(int number) {
		intNum=number;
		System.out.println("I am the integer " + intNum);
		
	}
	
	public Constructor(double number) {
		floatNum=number;
		System.out.println("I am the float " + floatNum);
	}
	
}
