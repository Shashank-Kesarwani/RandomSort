/**
 * @author shashank
 *
 */
package com.randomsort.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SortedData")
public class NumberSortModel implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="TimeConsumed")
	private long timeConsumed;
	
	@Column(name="PositionChanged")
	private Integer positionChanged;

	@Column(name="InputParam")
	private String inputParam;
	
	@Column(name="OutputParam")
	private String outputParam;
	
	@Column(name="timeStart")
	private long timeStart;
	
	@Column(name="timeEnd")
	private long timeEnd;
	
	

	

	/**
	 * @return the timeStart
	 */
	public long getTimeStart() {
		return timeStart;
	}

	/**
	 * @param timeStart the timeStart to set
	 */
	public void setTimeStart(long timeStart) {
		this.timeStart = timeStart;
	}

	/**
	 * @return the timeEnd
	 */
	public long getTimeEnd() {
		return timeEnd;
	}

	/**
	 * @param timeEnd the timeEnd to set
	 */
	public void setTimeEnd(long timeEnd) {
		this.timeEnd = timeEnd;
	}

	@Column(name="inputParamAsArrayList")
	private ArrayList<Integer> inputParamAsArrayList;
	
	@Column(name="outputParamAsArrayList")
	private ArrayList<Integer> outputParamAsArrayList; 
	
	
	/**
	 * @return the inputParamAsArrayList
	 */
	public ArrayList<Integer> getInputParamAsArrayList() {
		return inputParamAsArrayList;
	}

	/**
	 * @param inputParamAsArrayList the inputParamAsArrayList to set
	 */
	public void setInputParamAsArrayList(ArrayList<Integer> inputParamAsArrayList) {
		this.inputParamAsArrayList = inputParamAsArrayList;
	}

	/**
	 * @return the outputParamAsArrayList
	 */
	public ArrayList<Integer> getOutputParamAsArrayList() {
		return outputParamAsArrayList;
	}

	/**
	 * @param outputParamAsArrayList the outputParamAsArrayList to set
	 */
	public void setOutputParamAsArrayList(ArrayList<Integer> outputParamAsArrayList) {
		this.outputParamAsArrayList = outputParamAsArrayList;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the inputParam
	 */
	public String getInputParam() {
		return inputParam;
	}

	/**
	 * @param inputParam the inputParam to set
	 */
	public void setInputParam(String inputParam) {
		this.inputParam = inputParam;
	}

	/**
	 * @return the outputParam
	 */
	public String getOutputParam() {
		return outputParam;
	}

	/**
	 * @param outputParam the outputParam to set
	 */
	public void setOutputParam(String outputParam) {
		this.outputParam = outputParam;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the timeConsumed
	 */
	public long getTimeConsumed() {
		return timeConsumed;
	}

	/**
	 * @param timeConsumed the timeConsumed to set
	 */
	public void setTimeConsumed(long timeConsumed) {
		this.timeConsumed = timeConsumed;
	}

	/**
	 * @return the positionChanged
	 */
	public Integer getPositionChanged() {
		return positionChanged;
	}

	/**
	 * @param positionChanged the positionChanged to set
	 */
	public void setPositionChanged(Integer positionChanged) {
		this.positionChanged = positionChanged;
	}
	
	
	
}