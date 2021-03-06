package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.Hero;

@Mapper
public interface HeroMapper {
	
void insertHero(Hero hero);

public List<Hero> getHeroes();

public Hero getHero(int id);

void deleteHero(int id);

}
