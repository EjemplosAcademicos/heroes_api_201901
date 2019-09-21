package co.udea.heroes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "heroes")
@NamedEntityGraphs({
        @NamedEntityGraph(
                name = "Hero.poderes",
                attributeNodes = @NamedAttributeNode(value = "poderesHeroe")),
        @NamedEntityGraph(
                name = "Hero.completo",
                attributeNodes = @NamedAttributeNode(value = "poderesHeroe", subgraph = "subPoderes"),
                subgraphs = {    @NamedSubgraph(name = "subPoderes", attributeNodes = {@NamedAttributeNode(value = "poder")})})
})
public class Hero {

    @Id
    @Column(name = "id")
    private String id;

    @NotNull
    @Column(name = "nombre")
    private String name;

    @NotNull
    @Column(name = "ciudad_origen")
    private String ciudadOrigen;

    // relationships
    @OneToMany(mappedBy = "poder", fetch = FetchType.LAZY)
    private List<PoderxHeroe> poderesHeroe = new ArrayList<>();

    public Hero(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public List<PoderxHeroe> getPoderesHeroe() {
        return poderesHeroe;
    }

    public void setPoderesHeroe(List<PoderxHeroe> poderesHeroe) {
        this.poderesHeroe = poderesHeroe;
    }
}
