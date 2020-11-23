package io.powerledger.stevefidgeon.quicksortApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.powerledger.stevefidgeon.quicksortApi.actions.QuickSort;
import io.powerledger.stevefidgeon.quicksortApi.actions.SumList;

@RestController
public class ListResultController {
	
	@GetMapping("/processList")
	public ListResult processList(@RequestParam() List<Integer> unsortedList) {
		return new ListResult(QuickSort.quickSort(unsortedList), SumList.sumList(unsortedList));
	}
}
