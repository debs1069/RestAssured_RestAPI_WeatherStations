//package apiTest;

public class payLoad {

	public static String baseURI() {
		String uri="http://api.openweathermap.org/data/3.0/stations";
		return uri;
	}
	
		
public static String CreateStation1() {
	return "{\r\n" + 
			"  \"external_id\": \"DEMO_TEST001 \",\r\n" + 
			"  \"name\": \"Interview Station 1\",\r\n" + 
			"  \"latitude\": 33.33,\r\n" + 
			"  \"longitude\": -111.43,\r\n" + 
			"  \"altitude\": 444\r\n" + 
			"}";
	

	}

public static String CreateStation2() {
	return "{\r\n" + 
			"  \"external_id\": \"Interview1 \",\r\n" + 
			"  \"name\": \"Interview Station 2\",\r\n" + 
			"  \"latitude\": 33.44,\r\n" + 
			"  \"longitude\": -12.44,\r\n" + 
			"  \"altitude\": 444\r\n" + 
			"}";
}





/*public static String DeleteStation1() {
	return "{\r\n" + 
			"   \"id\": \"583436dd9643a9000196b8d6\",\r\n" + 
			"   \"created_at\": \"2016-11-22T12:15:25.967Z\",\r\n" + 
			"   \"updated_at\": \"2016-11-22T12:15:25.967Z\",\r\n" + 
			"   \"external_id\": \"DEMO_TEST001\",\r\n" + 
			"   \"name\": \"Interview Station 1\",\r\n" + 
			"   \"longitude\": -111.43,\r\n" + 
			"   \"latitude\": 33.33,\r\n" + 
			"   \"altitude\": 444,\r\n" + 
			"   \"rank\": 0\r\n" + 
			"}";
}
public static String DeleteStation2() {
	return "{\r\n" + 
			"   \"id\": \"583436dd9643a9000196b8d6\",\r\n" + 
			"   \"created_at\": \"2016-11-22T12:15:25.967Z\",\r\n" + 
			"   \"updated_at\": \"2016-11-22T12:15:25.967Z\",\r\n" + 
			"   \"external_id\": \"Interview1\",\r\n" + 
			"   \"name\": \"Interview Station 2\",\r\n" + 
			"   \"longitude\": -12.44,\r\n" + 
			"   \"latitude\": 33.44,\r\n" + 
			"   \"altitude\": 444,\r\n" + 
			"   \"rank\": 0\r\n" + 
			"}";
}*/
}
