package com.spring.springboot.dubbo;
 
import com.spring.springboot.domain.City;
 
/**
 * 城市业务 Dubbo 服务层
 *
 * Created by zzg on 01/04/2017.
 */
public interface CityDubboService {
 
    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
