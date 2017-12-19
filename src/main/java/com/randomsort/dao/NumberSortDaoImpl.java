/**
 * 
 */
package com.randomsort.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.randomsort.model.NumberSortModel;
import com.randomsort.util.RandomSortUtil;

public class NumberSortDaoImpl implements NumberSortDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addSortEntry(NumberSortModel numberSort) {
		sortArray(numberSort.getInputParamAsArrayList(), numberSort);
		numberSort.setTimeEnd(System.currentTimeMillis());
		numberSort.setTimeConsumed(numberSort.getTimeEnd() - numberSort.getTimeStart());
		sessionFactory.getCurrentSession().saveOrUpdate(numberSort);

	}

	private void sortArray(ArrayList<Integer> numberList, NumberSortModel numberSort) {
		RandomSortUtil.bogo(numberList, numberSort);
		numberSort.setOutputParam(numberSort.getOutputParamAsArrayList().toString());
	}
	
	/**
	 * Display complete result
	 * 
	 * @return
	 */
	@Override
	public List<NumberSortModel> listNumberSort() {
		return (List<NumberSortModel>) sessionFactory.getCurrentSession().createCriteria(NumberSortModel.class).list();
	}

	@Override
	public NumberSortModel displayRecentSorting(Integer id) {
		return (NumberSortModel) sessionFactory.getCurrentSession().get(NumberSortModel.class, id);

	}

}
