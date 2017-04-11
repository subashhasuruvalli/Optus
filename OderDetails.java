package com.optus.orderdetails;

@Controller 
public class  OderDetails 
{ 

	@RequestMapping (value = "/subscribe", method = RequestMethod.GET)     
	public String subscribe(HttpServletRequest request) 
	{         
		String orderDetails = getOrderDetails(request);
		String truncatedOrderDetails = StringUtil.truncate(orderDetails, 250);
		log(truncatedOrderDetails);         
	} 
	
}