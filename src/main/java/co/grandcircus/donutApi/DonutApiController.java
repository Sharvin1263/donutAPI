package co.grandcircus.donutApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DonutApiController {

	@Autowired
	private ApiService apiService;

	@RequestMapping("/")
	public ModelAndView showDonuts() {
		DonutsResponse response = apiService.getDonuts();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("donuts", response.getDonuts());
		mv.addObject("count", response.getCount());
		return mv;

	}

	@RequestMapping("/details")
	public ModelAndView showDetails(@RequestParam("id") Long id) {

		ModelAndView mv = new ModelAndView("details");
		mv.addObject("results", apiService.getById(id));

		return mv;

	}
}
