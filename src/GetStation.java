//package apiTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;


import java.util.Properties;


public class GetStation {
	//public static Properties prop;
	//Properties prop= new Properties();
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		RestAssured.baseURI=payLoad.baseURI();
		given().header("Content-Type","application/json").header("APPID","454a7e2b224641163768836ff26025e0").
		when().get("/stations").then().log().all().assertThat().statusCode(200);
	
		
	}

}
