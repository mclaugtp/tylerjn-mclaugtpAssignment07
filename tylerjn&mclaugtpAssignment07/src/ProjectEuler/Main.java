package ProjectEuler;

public class Main {

	public static void main(String[] args) {
		
		Problem06 p = new Problem06();
		
		System.out.println("Project Euler");
		System.out.println("Problem 06");
		System.out.println("Sum of Squares = " + p.sumOfSquares(10));
		System.out.println("Square of Sum = " + p.squaresOfSum(10));
		System.out.println("The answer of the difference: " + p.squaresOfSum(10) + " - " + p.sumOfSquares(10) + " = " + (p.squaresOfSum(10) - p.sumOfSquares(10)));
		
	}

}
