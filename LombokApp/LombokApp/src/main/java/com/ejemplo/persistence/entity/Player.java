package com.ejemplo.persistence.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

//@Data  // problemas con fetch lazy
@Getter
@Setter
@EqualsAndHashCode(exclude = {"abilities"}) // excluimos el campo que necesitamos
@ToString(exclude = {"abilities"}) // excluimos el campo que necesitamos
@Entity
public class Player {

    @Id
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "player_id")
    private List<Ability> abilities;   //getAbilities

}
