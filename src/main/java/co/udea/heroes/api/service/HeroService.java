package co.udea.heroes.api.service;

import co.udea.heroes.api.exception.DataNotFoundException;
import co.udea.heroes.api.model.Hero;
import co.udea.heroes.api.model.PoderxHeroe;
import co.udea.heroes.api.repository.HeroRepository;
import co.udea.heroes.api.util.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HeroService implements HeroServiceInt{

    private final Logger log = LoggerFactory.getLogger(HeroService.class);

    private Messages messages;
    private HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository, Messages messages){
        this.messages = messages;
        this.heroRepository = heroRepository;
    }

    @Override
    public List<Hero> getHeroes(){
        return heroRepository.findAll();
    }

    @Override
    public Hero getHero(String id) {
        Optional<Hero> posibleHero = heroRepository.findById(id);
        if(posibleHero.isPresent()){
            return posibleHero.get();
        }else {
            log.error("No existe un heroe con ese id");
            throw new DataNotFoundException(messages.get("exception.data_not_found.hero"));
        }
    }

    @Override
    public Hero addHero(Hero hero) {
        return heroRepository.save(hero);
    }

    @Override
    public Hero getHeroByName(String name) {
        Optional<Hero> posibleHero = heroRepository.findByName(name);
        if(posibleHero.isPresent()){
            return posibleHero.get();
        }else {
            return null;
        }
    }


}
