package co.grandcircus.donutApi;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {

	private RestTemplate restTemplate;
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public DonutsResponse getDonuts() {
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";

		DonutsResponse response = restTemplate.getForObject(url, DonutsResponse.class);
		return response;
	}

	public Detail getById(Long id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		Detail response = restTemplate.getForObject(url, Detail.class);
		return response;
	}

}
