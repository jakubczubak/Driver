package com.czubakjakub.driverapp.category;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(length = 50)
    @Size(min = 2, max = 50)
    private String name;
}
