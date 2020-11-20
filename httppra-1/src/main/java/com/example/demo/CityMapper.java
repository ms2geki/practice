package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface CityMapper {
 City[] selectCity(String state);
 void insertCity(City city);
 }