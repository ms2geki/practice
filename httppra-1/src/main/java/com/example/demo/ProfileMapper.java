package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProfileMapper {
	public void insertProfile(Profile profile);

	public void insertAddress(Address address);

}
