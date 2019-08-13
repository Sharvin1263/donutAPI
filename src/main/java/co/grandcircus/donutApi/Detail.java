package co.grandcircus.donutApi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Detail {

	private Long id;

	@JsonProperty("ref")
	private String url;

	private String name;

	private Integer calories;

	private List<String> extras;

	public Detail() {
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

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public List<String> getExtras() {
		return extras;
	}

	public void setExtras(List<String> extras) {
		this.extras = extras;
	}

	@Override
	public String toString() {
		return "Detail [id=" + id + ", url=" + url + ", name=" + name + ", calories=" + calories + ", extras=" + extras
				+ "]";
	}

}
