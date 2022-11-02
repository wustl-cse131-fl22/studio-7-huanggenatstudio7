package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	
	public Fraction addFraction(Fraction otherFraction) {
		int resultNumerator = otherFraction.numerator * this.denominator + this.numerator * otherFraction.denominator;
		int resultDenominator = this.denominator * otherFraction.denominator;
		return new Fraction(resultNumerator, resultDenominator);
	}

	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction frac1 = new Fraction(5, 2);
		Fraction frac2 = new Fraction(2, 5);
		Fraction see = frac1.addFraction(frac2);
		System.out.println(see);
	}

}
