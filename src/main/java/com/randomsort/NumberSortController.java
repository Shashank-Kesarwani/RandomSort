/**
 * 
 */
/**
 * @author shashank
 *
 */
package com.randomsort;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.randomsort.model.NumberSortModel;
import com.randomsort.service.NumberSortService;
import com.randomsort.util.RandomSortUtil;

@Controller
@RequestMapping("/")
public class NumberSortController {

	
	public NumberSortService numberSortService;
	@Autowired(required=true)
	public void setNumberSortService(NumberSortService numberSortService) {
		this.numberSortService = numberSortService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showView(@ModelAttribute("command") NumberSortModel numberSortModel, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		  model.put("numbers",  numberSortService.listNumberSort());
		return new ModelAndView("index",model);
		
	}

	@RequestMapping(value = "/sortnumbers", method = RequestMethod.POST)
	public ModelAndView sortNumber(@ModelAttribute("command") NumberSortModel numberSortModel, BindingResult result) {
		
		numberSortModel.setTimeStart(System.currentTimeMillis());
	
		numberSortModel.setInputParamAsArrayList(RandomSortUtil.stringToArrayList(numberSortModel.getInputParam()));
		numberSortService.addSortEntry(numberSortModel);
		
		  Map<String, Object> model = new HashMap<String, Object>();
		  model.put("number", RandomSortUtil.prepareNumberSortBean(numberSortModel));
		  model.put("numbers",  numberSortService.listNumberSort());

		 
		
		return new ModelAndView("index", model);

	}


}