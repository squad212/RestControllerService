package com.RestCalculation;




import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestCalculation {
	//http://localhost:40/jsonReqMul/10/20
	@RequestMapping(value = "/jsonReqMul", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public int mul(@RequestBody Input in) {
		int mul = in.param1 * in.param2 * in.param3;
		return mul;
	}
 @RequestMapping(value = "/areaService", method = RequestMethod.POST,
		 consumes = MediaType.APPLICATION_JSON_VALUE,
		 produces = MediaType.APPLICATION_JSON_VALUE)
 public MathOutput areaService(@RequestBody MathInput mi) {
	 MathOutput result = new MathOutput();
	 result.areaOfCircle = (int) 3.222 * mi.radius * mi.radius;
	 result.areaOfSquare = mi.sides * mi.sides;
	 result.areaOfRectangle = mi.length * mi.breadth;
	
	 return result;
	 }
 //http://localhost:40/jsonReturn/20/10
 @RequestMapping(value = "jsonReturn/{a}/{b}", method = RequestMethod.GET,
		 produces = MediaType.APPLICATION_JSON_VALUE)
 public Result math(@PathVariable int a, @PathVariable int b) {
	 Result res = new Result();
	 res.setSum(a+b);
	 res.setSub(a-b);
	 res.setMul(a*b);
	 res.setDiv(a/b);
	 return res;
 }
	
}