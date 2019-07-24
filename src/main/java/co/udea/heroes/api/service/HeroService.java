package co.udea.heroes.api.service;

import co.udea.heroes.api.model.Hero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HeroService implements HeroServiceInt{

    @Override
    public List<Hero> getHeroes(){
        List<Hero> heroes = new ArrayList<Hero>();
        heroes.add(new Hero("1","Wolverine"));
        heroes.add(new Hero("2","Tormenta"));
        heroes.add(new Hero("2","Ciplope"));
        return heroes;
    }

    @Override
    public Hero getHero(int id) {
        return new Hero("1","Super Man");
    }
}
