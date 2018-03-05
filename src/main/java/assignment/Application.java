package assignment;

import assignment.entities.WUResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) throws JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();

		// Get the daily summary of New York city for 2017/10/30.
		WUResponse wuResponse = restTemplate.getForObject("http://api.wunderground.com/api/fd1e148f67645411/history_20171030/q/NY/New_York.json", WUResponse.class);

		// Beautify json response for print
		ObjectMapper mapper = new ObjectMapper();
		log.info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(wuResponse));
	}
}