package com.usa.misiontic.MasterClass3.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "partyroom")
public class Partyroom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String target;
    private String description;

    /*
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("libs")
    private Category category;

     */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
