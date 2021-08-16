package com.codegym.model;

import javax.persistence.*;


@Entity // đánh dấu đây là Entity => hibernate sẽ tạo bảng trong CSDL
@Table(name = "products")
// tên mặc định là customer => @table để cài đặt lại thuộc tính của 1 bảng vd: đổi tên thành customers
public class Product {
    @Id // đánh dấu đây là thuộc tính id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // đánh dấu thuộc tính này tự tăng
    private Long idProduct;

    private String name;

    private int price;

    @ManyToOne
    private Type type;

    public Product() {
    }


    public Product(Long id, String name, int price, Type type) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.type = type;
    }

//    @Override
//    public String toString() {
//        return String.format("Product[idProduct=%d, name='%s',price='%s',]", idProduct, name, price);
//    }

    public Long getId() {
        return idProduct;
    }

    public void setId(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}