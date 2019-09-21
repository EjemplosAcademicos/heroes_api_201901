package co.udea.heroes.api.model;

import java.io.Serializable;

public class PoderxHeroePK implements Serializable {

    private static final long serialVersionUID = 1L;

    private String idPoder;
    private String idHero;

    public PoderxHeroePK() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
}
