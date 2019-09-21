package co.udea.heroes.api.repository;

import co.udea.heroes.api.model.PoderxHeroe;
import co.udea.heroes.api.model.PoderxHeroePK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PoderxHeroeRepository  extends JpaRepository<PoderxHeroe, PoderxHeroePK> {

    List<PoderxHeroe> findByIdHero(String isHero);
}
