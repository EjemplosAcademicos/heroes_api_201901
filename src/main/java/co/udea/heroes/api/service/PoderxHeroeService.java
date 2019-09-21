package co.udea.heroes.api.service;

import co.udea.heroes.api.exception.DataNotFoundException;
import co.udea.heroes.api.model.PoderxHeroe;
import co.udea.heroes.api.repository.PoderxHeroeRepository;
import co.udea.heroes.api.util.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoderxHeroeService {

    private final Logger log = LoggerFactory.getLogger(HeroService.class);

    private Messages messages;
    private PoderxHeroeRepository poderxHeroeRepository;

    public PoderxHeroeService(PoderxHeroeRepository poderxHeroeRepository, Messages messages){
        this.messages = messages;
        this.poderxHeroeRepository = poderxHeroeRepository;
    }

    public List<PoderxHeroe> getPoderesHero(String idHero) {

        //TODO validar primero si el hero existe

        List<PoderxHeroe> poderesHero = poderxHeroeRepository.findByIdHero(idHero);
        if(!poderesHero.isEmpty()){
            return poderesHero;
        }else {
            log.error("No existe tiene poderes");
            throw new DataNotFoundException(messages.get("exception.data_not_found.hero_poderes"));
        }
    }
}
