package co.udea.heroes.api.model;


import javax.persistence.*;

@Entity
@Table(name = "poderes")
public class Poder {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "nombre_poder")
    private String namePoder;


    public Poder(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamePoder() {
        return namePoder;
    }

    public void setNamePoder(String namePoder) {
        this.namePoder = namePoder;
    }

}
