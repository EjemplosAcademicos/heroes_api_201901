package co.udea.heroes.api.controller;

import co.udea.heroes.api.model.PoderxHeroe;
import co.udea.heroes.api.service.HeroServiceInt;
import co.udea.heroes.api.service.PoderxHeroeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/poder-hero")
public class PoderXHeroController {

    private PoderxHeroeService poderxHeroeService;

    public PoderXHeroController (PoderxHeroeService poderxHeroeService){
        this.poderxHeroeService = poderxHeroeService;
    }

    @GetMapping("poderes/{id}")
    public ResponseEntity<List<PoderxHeroe>> getPoderesHero(@PathVariable("id") String idHero){
        return ResponseEntity.ok(poderxHeroeService.getPoderesHero(idHero));
    }
}
