package com.ejemplo.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Ability {

    @Id
    private Long id;
    private String name;

}
