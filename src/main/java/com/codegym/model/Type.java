package com.codegym.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="types")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idType;

    private String name;

    @OneToMany(targetEntity = Product.class)
    private List<Product> products;

    public Type() {
    }

    public Type(String name) {
        this.name = name;
    }

    public Long getIdType() {
        return idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return String.format("Type[idType=%d, name='%s']", idType, name);
    }
}
