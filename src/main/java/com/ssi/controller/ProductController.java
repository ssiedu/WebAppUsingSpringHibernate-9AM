package com.ssi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.model.Product;
import com.ssi.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	//mapping to process search
	@RequestMapping("dosearch")
	public ModelAndView searchProduct(@RequestParam("pcode") int code) {
		//talk to service to get the product-details
		Product product=productService.productDetails(code);
		ModelAndView modelAndView=new ModelAndView("details.jsp");
		modelAndView.addObject("product", product);
		return modelAndView;
	}
	//mapping to show input-page
	@RequestMapping("searchinput")
	public String showSearchForm() {
		return "searchpage.jsp";
	}

}
