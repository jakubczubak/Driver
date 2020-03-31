package com.czubakjakub.driverapp.advice;


import com.czubakjakub.driverapp.category.Category;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "advice")
@Data
public class Advice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    @Size(min = 2, max = 50)
    private String title;
    @Column(length = 1000)
    @Size(min = 2, max = 1000)
    private String content;

    @ManyToMany
    @JoinTable(name = "advice_category",
            joinColumns = @JoinColumn(name = "advice_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
//    @NotEmpty   todo jak jest adnotacja to są błędy przy testowaniu jak set jest pusty
    private Set<Category> category = new HashSet<>();
}
