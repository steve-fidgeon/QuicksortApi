package io.powerledger.stevefidgeon.quicksortApi;

import java.util.List;

/** Pojo model of return results
 * @author steve
 *
 */
public class ListResult {

	private final List<Integer> sortedList;
	private final Integer listTotal;
	
	public ListResult(List<Integer> sortedList, Integer listTotal) {
		this.sortedList = sortedList;
		this.listTotal = listTotal;
	}
}
