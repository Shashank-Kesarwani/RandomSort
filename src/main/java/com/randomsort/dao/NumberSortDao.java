/**
 * @author shashank
 *
 */
package com.randomsort.dao;

import java.util.List;

import com.randomsort.model.NumberSortModel;

public interface NumberSortDao{
	
	/**
	 * Add sorted number in DB
	 * 
	 * @param numberSort
	 */
	public void addSortEntry(NumberSortModel numberSort);
	
	/**
	 * Display recent output
	 * 
	 * @param id
	 * @return
	 */
	public NumberSortModel displayRecentSorting(Integer id);
	
	/**
	 * Display complete result
	 * 
	 * @return
	 */
	public List<NumberSortModel> listNumberSort();
	
}