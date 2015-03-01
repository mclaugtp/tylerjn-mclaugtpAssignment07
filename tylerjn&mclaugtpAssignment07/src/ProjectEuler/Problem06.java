package ProjectEuler;

public class Problem06 {
	/**
	 * @param int num 
	 * @return The total sum of squares from 1 to num
	 */
	private static int sumOfSquares(int num) {
		int total = 0;
		for (int i = 1; i <= num; i++)
			total += (i * i);
		return total;
	}
	/**
	 * @param int num 
	 * @return The total sum of the num from 1 to num squared
	 */
	private static int squaresOfSum(int num) {
		int total = 0;
		for (int i = 1; i <= num; i++)
			total += i;
			total = total * total;
		return total;
	}
}
