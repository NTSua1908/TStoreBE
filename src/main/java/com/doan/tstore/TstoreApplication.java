package com.doan.tstore;

// import java.io.Console;

// import com.doan.tstore.Model.Game;
// import com.fasterxml.jackson.core.JsonProcessingException;
// import com.fasterxml.jackson.databind.JsonMappingException;
// import com.fasterxml.jackson.databind.ObjectMapper;

// import org.apache.tomcat.util.json.JSONParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(TstoreApplication.class, args);
		
		// try {
		// 	Game game = new ObjectMapper().readValue(
		// 			"{\"id\":1,\"name\":\"\",\"images\":null,\"thumbnailHorizontal\":\"\",\"thumbnailVertical\":\"\",\"trailer\":\"\",\"banner\":\"\",\"price\":10,\"quantity\":10,\"discount\":5,\"developer\":\"\",\"publisher\":\"\",\"provider\":null,\"releaseDate\":\"2022-5-12\",\"flatform\":\"PlayStation 5\",\"types\":null,\"expirationDate\":\"2022-5-12\",\"positiveReview\":\"1\",\"negativeReview\":\"2\",\"overallReview\":\"3\",\"description\":\"\",\"content\":\"\",\"lstCart\":null,\"lstBillDetails\":null}",
		// 			Game.class);
		// 			System.out.println(game.toString());
		// } catch (JsonMappingException e) {
		// 	// TODO Auto-generated catch block
		// 	e.printStackTrace();
		// } catch (JsonProcessingException e) {
		// 	// TODO Auto-generated catch block
		// 	e.printStackTrace();
		// }

	}

}
