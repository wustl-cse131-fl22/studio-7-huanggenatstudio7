package studio7;

public class Die {
	private int numberOfSides;
	
	public Die(int n) {
		numberOfSides = n;
	}
	public int roll() {
		return (int) (Math.random() * (numberOfSides)) + 1;
	}
	

	public static void main(String[] args) {
		Die myDie = new Die(6);
		for (int i = 0; i<20; i++) {
			System.out.println(myDie.roll());
		}
	}

}
