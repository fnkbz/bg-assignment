package assignment;

import assignment.entities.WUResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	// change before run
	private static final String FILENAME = "C:\\Users\\bouris\\Desktop\\test.txt";

	private static final String NEW_LINE = "line.separator";

	public static void main(String args[]) throws IOException {
		// Connect through proxy
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();

		Proxy proxy= new Proxy(Proxy.Type.HTTP, new InetSocketAddress("squid.eurodyn.com", 8080));
		requestFactory.setProxy(proxy);

		RestTemplate restTemplate = new RestTemplate(requestFactory);

		//RestTemplate restTemplate = new RestTemplate();

		// Get the daily summary of New York city for 2017/10/30.
		String response = restTemplate.getForObject("http://api.wunderground.com/api/fd1e148f67645411/history_20171030/q/NY/New_York.json", String.class);

		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(response);
		JsonNode historyNode = rootNode.get("history");
		JsonNode dailyNode = historyNode.get("dailysummary");

		// Print the daily summary
		Object json = mapper.readValue(dailyNode.toString(), Object.class);
		log.info( mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json));

		String content = "";
		if (dailyNode.isArray()) {

			String maxhumidity = "maxhumidity : " + dailyNode.path("maxhumidity").asText();
			String maxtempm = "maxtempm : " + dailyNode.path("maxtempm").asText();
			String mintempm = "mintempm : " + dailyNode.path("mintempm").asText();
			String precipm = "precipm : " + dailyNode.path("precipm").asText();

			content = new StringBuilder().append(maxhumidity).append(System.getProperty(NEW_LINE))
					.append(maxtempm).append(System.getProperty(NEW_LINE))
					.append(mintempm).append(System.getProperty(NEW_LINE))
					.append(precipm).toString();
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
			bw.write(content);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}