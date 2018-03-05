package assignment;

import assignment.entities.WUResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		RestTemplate restTemplate = new RestTemplate();
		WUResponse wuResponse = restTemplate.getForObject("http://api.wunderground.com/api/fd1e148f67645411/history_20171030/q/NY/New_York.json", WUResponse.class);
		log.info(wuResponse.toString());
	}
}