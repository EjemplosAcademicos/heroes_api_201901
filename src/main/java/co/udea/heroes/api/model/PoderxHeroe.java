package co.udea.heroes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "poderesxheroe")
@IdClass(PoderxHeroePK.class)
public class PoderxHeroe {

    @Id
    @Column(name = "fk_poder")
    private String idPoder;

    @Id
    @Column(name = "fk_hero")
    private String idHero;

    @Column(name = "nivel_ataque")
    private Integer nivelAtaque;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_poder", referencedColumnName = "id", insertable = false, updatable = false)
    private Poder poder;

    public PoderxHeroe() {
    }


    public String getIdPoder() {
        return idPoder;
    }

    public void setIdPoder(String idPoder) {
        this.idPoder = idPoder;
    }

    public String getIdHero() {
        return idHero;
    }

    public void setIdHero(String idHero) {
        this.idHero = idHero;
    }

    public Integer getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(Integer nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder poder) {
        poder = poder;
    }
}
