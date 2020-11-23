package io.powerledger.stevefidgeon.quicksortApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.powerledger.stevefidgeon.quicksortApi.actions.quickSort;
import io.powerledger.stevefidgeon.quicksortApi.actions.sumList;

@RestController
public class ListResultController {
	
	@GetMapping("/processList")
	public ListResult processList(@RequestParam() List<Integer> unsortedList) {
		return new ListResult(quickSort.quickSort(unsortedList), sumList.sumList(unsortedList));
	}
}
