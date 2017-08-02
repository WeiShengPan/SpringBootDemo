package cn.wspan.SpringBootDemo.controller;

import cn.wspan.SpringBootDemo.model.City;
import cn.wspan.SpringBootDemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panws
 * @since 2017-08-02
 */
@RestController
@RequestMapping("/city/")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping(value = "get", method = RequestMethod.GET)
	public Page<City> findCity(String state, String country) {
		return cityService.findCity(state, country);
	}
	
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public City createCity(String name, String state, String country) {
		return cityService.save(name, state, country);
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public Page<City> findAll() {
		return cityService.findAll();
	}
}