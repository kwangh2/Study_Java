package pack03.godata;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;

public class Ex01_GoData {
	//json &xml : 서버로 클라이언트는 여러가지 요청을 보냄.=> Request
	//				서버는 클라이언트의 요청에 따라 페이지 또는 데이터를 통해 "응답" => Response
	//데이터의 요청은 여러가지 언어나 플랫폼에서 할 수 있음 => 타입 공통적으로 사용 (json & xml)
	//json=> String  " "
	//변수  : "변수명 " : "변수값"
	//객체 : { "변수명" : "변수값" } dto 1건 dto 내부에 변수
	//배열(리스트) : [] -> ArrayList<dto> , DTO[] 
	
	//웹주소 ? 파라메터 1= 값 & 파라메터2=값2 ..............
	//?page=1&perPage=100&serviceKey=%2FRsk1qhHxamNk45RWl%2FwA7fjZ300Hb732UgN9rj%2BLPtea3TumyH6FR6dZ8Zmpo8u8S9OLiTAYQxwN1xxPSdKMu%3D%3D
	
	
	//Retrofit & OkHttp 등의 여러 클라이언트 API존재함
	public static void main(String[] args) {
		HttpClient client = HttpClients.createDefault();
		try {
			//주소를 만들기 위한 객체 
			URIBuilder builder = new URIBuilder("https://api.odcloud.kr/api/3082925/v1/uddi:b4759786-c28c-41dd-b600-a9abdbec3ae1");
			builder.addParameter("page", "1");
			builder.addParameter("perPage", "100");
			builder.addParameter("serviceKey", "xwN1xxPSdKMu/Rsk1qhHxamNk45RWl/wA7fjZ300Hb732UgN9rj+LPtea3TumyH6FR6dZ8Zmpo8u8S9OLiTAYQ==");
			//Get&Post : 요청 시 url에 파라메터가 보이는지 여부
			HttpGet request = new HttpGet(builder.build());
			
			//아파치걸로 자동완성
			HttpResponse response = client.execute(request);
			String responseBody = EntityUtils.toString(response.getEntity());
			System.out.println(responseBody);
			//JsonObject API(Library) < = StringJson 에서는 하나씩 데이터를 빼오는것이 불편함.
			//String -> Json 객체 형태로 변환(파싱) 
//			JsonElement jElement = JsonParser.parseString(responseBody);
//			JsonObject jObj = jElement.getAsJsonObject(); //키값으로 인정
//			JsonArray jArray = (JsonArray) jObj.get("data"); // data빼기 
//			System.out.println(jArray.size());
//			for (int i = 0; i < jArray.size(); i++) {
//				JsonObject tempObject = jArray.get(i).getAsJsonObject();
//				System.out.println(tempObject.get("데이터기준일자") + " " );
//				System.out.println(tempObject.get("비고") + " " );
//				System.out.println(tempObject.get("상호명") + " " );
//				System.out.println(tempObject.get("소재지도로명주소") + " " );
//			}
			PojoClass pojo = new Gson().fromJson(responseBody, PojoClass.class);
			System.out.println(pojo.list.size());
			System.out.println(pojo.list.get(0).storeName);
			//fromJson ==> StringJson -> 객체화
			//toJson ==> 객체를 ->StringJson
			//Jsoup <= Html Parser 내부에 있는 태그를 식별해서 짜르기 가능
			String pojoJson = new Gson().toJson(pojo);
			System.out.println(pojoJson);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	//Plain Old Java Object : DTO 와 같으나 임시로 데이터를 변환하기 위한 객체. 중요한 데이터 담으면 안됨.
	public class PojoClass{
		@SerializedName("data")
		ArrayList<PojoInnerData> list;
		public class PojoInnerData{
			@SerializedName("상호명")
			public String storeName;
			@SerializedName("데이터기준일자")
			public String InfoDate;
			@SerializedName("비고")
			public String comment;
		}
	}
}
