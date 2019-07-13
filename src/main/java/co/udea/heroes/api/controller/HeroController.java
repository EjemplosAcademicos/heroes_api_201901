package co.udea.heroes.api.controller;

import co.udea.heroes.api.model.Hero;
import co.udea.heroes.api.service.service.HeroServiceInt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tourofheroes")
public class HeroController {

    private HeroServiceInt heroService;

    public HeroController (HeroServiceInt heroService){
        this.heroService = heroService;
    }

    @GetMapping("heroes")
    public List<Hero> getHeroes(){
        return heroService.getHeroes();
    }
}
