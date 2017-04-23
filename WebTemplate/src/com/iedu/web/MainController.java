package com.iedu.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iedu.domain.Products;
import com.iedu.service.ProductsService;


@Controller
public class MainController {

	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private final ProductsService productsService = null;
	
	@RequestMapping("/index.do")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("index");	
		
		List<Products> results = productsService.findAll();
		System.out.println(results);
		
		model.addObject("products", results);
		return model;
    }
	
	@RequestMapping("/showProducts.do")
    public ModelAndView showProducts(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("index");				
		return model;
    }
}
