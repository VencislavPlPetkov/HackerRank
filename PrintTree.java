import java.util.Scanner;

public class PrintTree {

	public static void main(String[] args) {
		
		/**
		 * 
		 *  Print a Tree in the following format
		 *
		 *  Ex: n = 4:
		 *  
		 *   	   *
		 * 	      **
		 *  	 ***
		 * 	    ****
		 *
		 *
		*/

		System.out.print("Give a number of levels for the tree: ");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int cnt1 = 0;
		int line = N - 1;
		char c1 = '*';
		char c2 = ' ';

		if (N > 0) {
			while (cnt1 < N) {
				StringBuilder sb = new StringBuilder(); // CHANGED
				int cnt2 = 0; // CHANGED
				int cnt3 = 0; // CHANGED

				while (cnt2 < N - line) {
					while (cnt3 < line) {
						sb.append(c2);
						cnt3++;
					}
					sb.append(c1);
					cnt2++;
				}
				line--;
				cnt1++;
				System.out.println(sb.toString());
			}
		}

	}

}
