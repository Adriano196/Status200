package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.StringContains;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiGit {

	
	Response response;
	
	public Response acessarApi(String uri) {
		response = RestAssured.get();
		return response;
		
		}
	   
     public void statusCode(int status) {
    	 int statusCode = response.getStatusCode();
    	 assertEquals(status, statusCode);
    	 
     }
     
     public void bodyResponse(String texto) {
    	 String bodyResponse = response.asPrettyString();
    	 assertThat(bodyResponse, StringContains.containsString(texto));
    	 
     }
}
