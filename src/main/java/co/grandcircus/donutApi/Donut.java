package co.grandcircus.donutApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Donut {

	private Long id;

	@JsonProperty("ref")
	private String url;

	private String name;

	public Donut() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Donut [id=" + id + ", url=" + url + ", name=" + name + "]";
	}

}
