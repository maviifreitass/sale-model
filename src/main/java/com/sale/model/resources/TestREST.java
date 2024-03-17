/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sale.model.resources;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.json.JSONObject;

/**
 *
 * @author maria
 */
public class TestREST extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        JSONObject json = new JSONObject();
        json.put("SUCCESS", "true");
        String res = json.toString();

        response.setHeader("Content-Type", "application/json; charset=utf-8");

        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().write(res);
        response.getWriter().flush();
        response.getWriter().close();
    }

}
