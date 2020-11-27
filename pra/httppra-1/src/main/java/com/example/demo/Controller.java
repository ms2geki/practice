package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.HeroMapper;
import com.example.demo.mapper.ProfileMapper;
import com.example.model.Hero;
import com.example.model.Profile;


@RestController
@RequestMapping("/api")
public class Controller {

@Autowired
private   ProfileMapper profileMapper;	

@Autowired
private HeroMapper heroMapper;

private List<Hero> heroes;


@CrossOrigin
@PostMapping("/api")
void save(@RequestBody Profile profile){
	
     profileMapper.insertProfile(profile);
     profileMapper.insertAddress(profile.getAddress());
}

@CrossOrigin
@PostMapping("/saveHero")
Hero insertHero(@RequestBody Hero hero){
	 System.out.println(hero);
     heroMapper.insertHero(hero);
     return hero;
}

@CrossOrigin
@GetMapping("/getHeroes")
 public List<Hero> getHeros(){
	
  this.heroes=heroMapper.getHeroes();
  System.out.println(this.heroes.get(1).getName());
  return  heroMapper.getHeroes();
}


@CrossOrigin
@GetMapping("/getHero/{id}")
 public Hero getHero(@PathVariable int id){
	
	return  heroMapper.getHero(id);
}


@CrossOrigin
@DeleteMapping(path="{id}")
  void deleteHero(@PathVariable int id ){
  heroMapper.deleteHero(id);
}


}
