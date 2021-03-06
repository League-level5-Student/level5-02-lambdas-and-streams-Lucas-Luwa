package _04_Searching_With_Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class StreamSearcher {
	// 1. This method takes an array of Strings and a String. The method returns the
	// number of times the String parameter appears in the String array. This method
	// will use Streams to help us out.
	// 2. Convert the String array to a stream
	public long containsCount(String[] strArr, String strToCount) {
		return Arrays.stream(strArr).filter((i) -> {
			if (i.equals(strToCount)) {
				return true;
			} else {
				return false;
			}
		}).count();
		// 3. Use the filter method with a lambda to extract all the String
	}
}
