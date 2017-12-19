/**
 * 
 */
/**
 * @author shashank
 *
 */
package com.randomsort.service;

import java.util.List;

import com.randomsort.model.NumberSortModel;

public interface NumberSortService{
	public void addSortEntry(NumberSortModel numberSort);
	public NumberSortModel displayRecentSorting(Integer id);
	public List<NumberSortModel> listNumberSort();
	
	
}