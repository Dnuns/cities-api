package com.github.citiesapi.countries;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="pais")
public class Country {

    @Id
    private Long id;

    @Column(name="nome")
    private String name;

    @Column(name="nome_pt")
    private String portugueseName;

    @Column(name="sigla")
    private String code;

    private Integer bacen;
}
