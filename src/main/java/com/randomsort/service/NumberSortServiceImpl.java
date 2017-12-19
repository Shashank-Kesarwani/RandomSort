/**
 * 
 */
package com.randomsort.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.randomsort.dao.NumberSortDao;
import com.randomsort.model.NumberSortModel;

/**
 * @author shashank
 *
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class NumberSortServiceImpl implements NumberSortService{
	
	
	 public NumberSortDao numberSortDao;
		public void setNumberSortDao(NumberSortDao numberSortDao) {
			this.numberSortDao = numberSortDao;
		}
	 
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addSortEntry(NumberSortModel numberSort) {
		numberSortDao.addSortEntry(numberSort);		
	}

	@Override
	public NumberSortModel displayRecentSorting(Integer id) {

		return numberSortDao.displayRecentSorting(id);
	}
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	 public List<NumberSortModel> listNumberSort() {
		 return numberSortDao.listNumberSort();
		 }
	



}
