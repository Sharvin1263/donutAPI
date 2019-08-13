package co.grandcircus.donutApi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DonutsResponse {

	@JsonProperty("results")
	private List<Donut> donuts;
	private Integer count;

	public DonutsResponse() {
		super();
	}

	public List<Donut> getDonuts() {
		return donuts;
	}

	public void setDonuts(List<Donut> donuts) {
		this.donuts = donuts;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "DonutsResponse [donuts=" + donuts + ", count=" + count + "]";
	}

}
