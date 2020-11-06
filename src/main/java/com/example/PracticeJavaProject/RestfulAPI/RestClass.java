package com.example.PracticeJavaProject.RestfulAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestClass {
	
	private String ItemName;
	private int ItemPrice;
	private int ItemWeight;
	private int ItemId;
	
	
	@GetMapping(path ="/getitemprice")
	public String getitemdetails(){
		/*if (ItemName.contains("Dal")){
			return ItemPrice;
		}
		else {
			return 0;
		}*/
		return "All Dal";
	}
	
	/*@PutMapping(path = "/insertitemdetails/{id}")
	public RestClass insertitemdetails(@PathVariable(value = "id") int ItemId,  @RequestBody RestClass rest) {
	
		RestClass rest1 = restrepository.findById(ItemId);
				
				/*employee.setEmailId(employeeDetails.getEmailId());
				 employee.setLastName(employeeDetails.getLastName());
				 employee.setFirstName(employeeDetails.getFirstName());
				 final Employee updatedEmployee = employeeRepository.save(employee);
				 return restrepository.save(rest1);
	}*/
}
