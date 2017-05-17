
import java.util.Arrays;
import java.util.Objects;

public class Comparator {
	
	/**
	 * Methods to compare int, Strings, int[]
	 */
	
	public boolean compare(int a, int b) {

		//
		// if (Integer.compare(a, b) == 0) {
		// return true;
		// } else{
		// return false;
		// }
		//

		return Objects.equals(a, b);

	}

	public boolean compare(String a, String b) {

		// return a.equals(b);

		return Objects.equals(a, b);
	}

	public boolean compare(int[] a, int[] b) {

		if (Arrays.equals(a, b)) {
			return true;
		} else {
			return false;
		}
		/**
		 * if (Arrays.deepEquals(a, b)) System.out.println("Same"); else
		 * System.out.println("Not same");
		 * 
		 * public static boolean ArrayCompare(int[] a, int[] a2) { if (a==a2) //
		 * checks for same array reference return true; if (a==null || a2==null)
		 * // checks for null arrays return false;
		 * 
		 * int length = a.length; if (a2.length != length) // arrays should be
		 * of equal length return false;
		 * 
		 * for (int i=0; i<length; i++) // compare array values if (a[i] !=
		 * a2[i]) return false;
		 * 
		 * return true; }
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
