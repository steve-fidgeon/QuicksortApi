package io.powerledger.stevefidgeon.quicksortApi.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** QuickSort implementation using streams.
 * @author steve
 *
 */
public class quickSort {

	/** Sort a List of Integers.
	 * @param elements
	 * @return
	 */
	public static List<Integer> quickSort(List<Integer> elements) {
		if (elements == null || elements.size() < 2) {
			return elements;
		}
		int firstElement = elements.get(0);
		
		List<Integer> bigs = quickSort(elements.stream().skip(1).filter(i -> i > firstElement).collect(Collectors.toList()));
		List<Integer> smalls = quickSort(elements.stream().skip(1).filter(i -> i <= firstElement).collect(Collectors.toList()));
		
		return Stream.concat(Stream.concat(smalls.stream(), Stream.of(firstElement)), bigs.stream()).collect(Collectors.toList());
	}
	
	/** Not a real unit test, would use JUnit or similar in reality.
	 * @param args
	 */
	public static void main(String[] args) {
		//Quick and really horrible unit test
		System.out.println(quickSort.quickSort(new ArrayList<Integer>(Arrays.asList(2,4,6,8,1,3,5,7,9))));
	}

}
