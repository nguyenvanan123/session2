package com.example.products_managerthymeleaf.model;

public class Product {
    private String name;
    private String detail;
    private int price;

    public Product () {
    }

    public Product ( String name, String detail, int price ) {
        this.name = name;
        this.detail = detail;
        this.price = price;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getDetail () {
        return detail;
    }

    public void setDetail ( String detail ) {
        this.detail = detail;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice ( int price ) {
        this.price = price;
    }


}
