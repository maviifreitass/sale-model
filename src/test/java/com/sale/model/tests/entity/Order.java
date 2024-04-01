/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sale.model.tests.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class Order {

    private Long id;

    private String total;

    private List<Product> products;

    private Payment payment;

    private Integer quota;

    private double quotaValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    // Método para adicionar um produto
    public void addProduct(Product product) {
        if (products == null) {
            products = new ArrayList<>();
        }
        products.add(product);
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public double getQuotaValue() {
        return quotaValue;
    }

    public void setQuotaValue(double quotaValue) {
        this.quotaValue = quotaValue;
    }

}
