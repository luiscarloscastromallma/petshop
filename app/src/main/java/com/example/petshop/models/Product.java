package com.example.petshop.models;

import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private String description;
    private int categoryId;
    private Double price;
    private int amount;

    public String toString(){
        return String.format("%s - %s - %s", this.getId(), this.getName(), this.getDescription());
    }

    public Product(int _id, String _name, String _description, int _categoryId, Double _price, int _amount) {
        //Constructor
        this.id=_id;
        this.name= _name;
        this.setDescription(_description);
        this.setCategoryId(_categoryId);
        this.setPrice(_price);
        this.setAmount(_amount);

    }

    public static ArrayList getData() {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1, "Ricocan Adulto", "Alimento balanceado para perro adulto de cordero",
                1, 80.00, 2));
        list.add(new Product(1, "Ricocan Adulto2", "Alimento balanceado para perro adulto de cordero",
                1, 80.00, 2));
        list.add(new Product(1, "Ricocan Adulto3", "Alimento balanceado para perro adulto de cordero",
                1, 80.00, 2));
        list.add(new Product(1, "Ricocan Adulto4", "Alimento balanceado para perro adulto de cordero",
                1, 80.00, 2));
        return list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
