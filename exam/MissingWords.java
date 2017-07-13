import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingWords {

	public static void main(String[] args) {

		/**
		 * Compare two Strings and find the Missing Words
		 */

		String s = "I am using HackerRank to improve programming";
		String[] strList1 = s.split(" ");

		String t = "am HackerRank to improve";
		String[] strList2 = t.split(" ");

		List<String> list1 = Arrays.asList(strList1);
		List<String> list2 = Arrays.asList(strList2);

		// Prepare a union
		List<String> union = new ArrayList<>(list1);
		union.addAll(list2);

		// Prepare an intersection
		List<String> intersection = new ArrayList<>(list1);
		intersection.retainAll(list2);

		// Subtract the intersection from the union
		union.removeAll(intersection);

		/**
		 * Print function and cast to array for (String se : union) {
		 * System.out.println(se); } union.toArray(); return union;
		 */

		String[] myArr = new String[union.size()];
		myArr = union.toArray(myArr);
		// return myArr;

	}

}
