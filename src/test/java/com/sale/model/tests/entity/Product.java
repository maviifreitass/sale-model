/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sale.model.tests.entity;

/**
 *
 * @author maria
 */
public class Product {

    private Long id;
    private String name;
    private Double value;

    public Product(Long id, String name, Double value) {
        this.id = id;
        this.name = name;
        this.value = value;

    }

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", value=" + value + '}';
    }

}
