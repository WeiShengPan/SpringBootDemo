package cn.wspan.SpringBootDemo.service;

import cn.wspan.SpringBootDemo.annotation.Auth;
import cn.wspan.SpringBootDemo.dao.CityRepository;
import cn.wspan.SpringBootDemo.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author panws
 * @since 2017-08-02
 */
@Service
public class CityService {
	
	@Autowired
	private CityRepository cityRepository;
	
	public Page<City> findAll() {
		return cityRepository.findAll(new PageRequest(0, 15));
	}
	
	public Page<City> findCity(String state, String country) {
		return cityRepository.findByStateAndCountryAllIgnoringCase(state, country, new PageRequest(0, 15));
	}
	
	public City save(String name, String state, String country) {
		City city = new City();
		city.setName(name);
		city.setState(state);
		city.setCountry(country);
		return cityRepository.save(city);
	}

	@Auth(type = Auth.AuthType.READ)
	public City get() {
		City city = new City();
		city.setName("HangZhou");
		city.setState("ZheJiang");
		city.setCountry("China");
		return city;
	}
}
