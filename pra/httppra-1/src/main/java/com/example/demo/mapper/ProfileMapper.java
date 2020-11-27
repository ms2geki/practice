package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.Address;
import com.example.model.Profile;

@Mapper
public interface ProfileMapper {
	public void insertProfile(Profile profile);

	public void insertAddress(Address address);

}
