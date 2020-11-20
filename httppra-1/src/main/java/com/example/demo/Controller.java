package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Controller {

@Autowired
private  ProfileMapper profileMapper;

	


@CrossOrigin
@PostMapping("/api")
void save(@RequestBody String body) throws JsonMappingException, IOException {
	 System.out.println(body);
	 String json=body;
	 System.out.println(json);
	 ObjectMapper mapper=new ObjectMapper();
	 Profile profile=mapper.readValue(json, Profile.class);	 
     System.out.println(profile.getAddress().getStreet());
	 profileMapper.insertProfile(profile);
	 profileMapper.insertAddress(profile.getAddress());
}
}
