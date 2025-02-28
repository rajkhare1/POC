package com.rajkhare.jackson;

import java.io.IOException;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FirstApplication {
	
	private static Logger logger = Logger.getLogger(FirstApplication.class.getName());

	public static void main(String[] args) {
		// Create an instance of ObjectMapper class
		ObjectMapper mapper = new ObjectMapper();

		// Create a JSON String to employees details to deserilized object
		String empString ="{\n\"employees\" : [\n{\n\"empId\":\"001\",\n\"jobTitleName\":\"Developer\","  
                + "\n\"firstName\":\"Nicholas\",\n\"lastName\":\"Clemens\",\n\"preferredFullName\":\"Nicholas Clemens\","  
                + "\n\"employeeCode\":\"E010\",\n\"region\":\"CA\",\n\"phoneNumber\":\"408-1234567\",\n\"emailAddress\""  
                + ":\"nicholas.clemens@gmail.com\"\n},\n{\n\"empId\":\"002\",\n\"jobTitleName\":\"Developer\","  
                + "\n\"firstName\":\"Sharon\",\n\"lastName\":\"Lorenz\",\n\"preferredFullName\":\"Sharon Lorenz\","  
                + "\n\"employeeCode\":\"E011\",\n\"region\":\"CA\",\n\"phoneNumber\":\"408-1111111\",\n\"emailAddress\""  
                + ":\"sharon.lorenz@gmail.com\"\n},\n{\n\"empId\":\"thanks\",\n\"jobTitleName\":\"Program Directory\","  
                + "\n\"firstName\":\"Brittany\",\n\"lastName\":\"Hart\",\n\"preferredFullName\":\"Brittany Hart\",\n\""  
                + "employeeCode\":\"E012\",\n\"region\":\"CA\",\n\"phoneNumber\":\"408-2222222\",\n\"emailAddress\":\"brittany.hart@gmail.com\"\n}\n]\n}";

		try {
			// deserialize to object with the help of ObjectMapper
			Employees employees = mapper.readValue(empString, Employees.class);
			logger.info(""+employees);
			
			// serialize employees into json string
			empString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employees);
			logger.info(empString);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
