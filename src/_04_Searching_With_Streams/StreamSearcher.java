package _04_Searching_With_Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class StreamSearcher {
	// 1. This method takes an array of Strings and a String. The method returns the
	// number of times the String parameter appears in the String array. This method
	// will use Streams to help us out.
	public long containsCount(String[] strArr, String strToCount) {
		int l = 0;
		// 2. Convert the String array to a stream
		Stream<String> sm = Arrays.stream(strArr);
		// 3. Use the filter method with a lambda to extract all the String
		// elements that match the String parameter.
		// sm.filter((i) -> {
		// if (i.equals(strToCount)) {
		// //l+=1;
		// return true;
		// } else {
		// return false;
		// }
		// });
		sm.forEach((i) -> {
			if (i.equals(strToCount)) {
			l+=1;
			} else {
			}

		});
		// 4. Return the count of the filtered stream.
		System.out.println(sm.count());

	}
}
