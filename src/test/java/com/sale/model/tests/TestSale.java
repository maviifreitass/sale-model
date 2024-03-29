package com.sale.model.tests;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.sale.model.entity.Order;
import com.sale.model.entity.Payment;
import com.sale.model.entity.Product;
import com.sale.model.repository.ProductDB;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author maria
 */
public class TestSale {
    
    private Order order;
    private List<Product> listaTeste;
    
    public TestSale() {
        
        this.listaTeste = new ArrayList<Product>();
        // Criando produtos
        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Produto 1");
        product1.setValue(10.0);

        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("Produto 2");
        product2.setValue(20.0);

        Product product3 = new Product();
        product3.setId(3L);
        product3.setName("Produto 3");
        product3.setValue(30.0);

        // Adicionando produtos ao pedido
        this.listaTeste.add(product1);
        this.listaTeste.add(product2);
        this.listaTeste.add(product3);
        
    }
    
    @BeforeEach
    public void setUp() {
       this.order = new Order();
    }
    
    @Test
    public void testNaoPermiteRegistrarPagamentoCarrinhoVazio(){
        //adding products
        this.order.addProduct(this.listaTeste.get(0));
        //seting payment
        this.order.setPayment(Payment.CREDIT);
        //checking condicions
            assertNotNull(this.order.getProducts(), "failure - Order's products can not be null");
            boolean test = (this.order.getProducts().isEmpty()?false:true);
            assertTrue(test, "failure - Order's products can not be null");
    }
    
    @Test
    public void testNaoPermiteParcelasIgualOuInferiorA20(){
        //adding order's products
        this.order.addProduct(this.listaTeste.get(0));
        this.order.addProduct(this.listaTeste.get(1));
        this.order.addProduct(this.listaTeste.get(2));
        //seting payments 
        this.order.setPayment(Payment.CREDIT);
        this.order.setQuota(2);
        this.order.setQuotaValue(30);
        //checking condicions
         assertEquals(30 , this.order.getQuotaValue(), "failure - Order's quota can't coust less or R$:20.00");   
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}   
}
