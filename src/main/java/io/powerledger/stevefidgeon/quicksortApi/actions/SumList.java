package io.powerledger.stevefidgeon.quicksortApi.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Numerical list totaller.
 * @author steve
 *
 */
public class SumList {
	
	/** Add the elements of a list together andreturn the total.
	 * @param elements
	 * @return
	 */
	public static Integer sumList(List<Integer> elements) {
		if (elements == null) return null;
		if (elements.size() < 2) return elements.get(0);
		
		return elements.stream().reduce(0, (x,y) -> x+y);
	}
	
	/** Not a real unit test, should be JUnit
	 * @param args
	 */
	public static void main(String[] args) {
		//Sorry, no proper test just this
		System.out.println(SumList.sumList(new ArrayList<Integer>(Arrays.asList(2,4,6,8,1,3,5,7,9))));
	}

}
