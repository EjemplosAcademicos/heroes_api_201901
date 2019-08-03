package co.udea.heroes.api.service;

import co.udea.heroes.api.model.Hero;

import java.util.List;

public interface HeroServiceInt {

    public List<Hero> getHeroes();
    public Hero getHero(String id);
    public Hero addHero(Hero hero);
    public Hero getHeroByName(String name);
}
