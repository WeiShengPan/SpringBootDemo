package cn.wspan.SpringBootDemo.dao;

import cn.wspan.SpringBootDemo.model.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 使用Spring JPA作为数据持久层
 * 
 * @author panws
 * @since 2017-08-02
 */
public interface CityRepository extends JpaRepository<City, Long> {
	
	Page<City> findAll(Pageable pageable);
	
	Page<City> findByStateAndCountryAllIgnoringCase(String state, String country, Pageable pageable);
	
	City save(City city);
}
