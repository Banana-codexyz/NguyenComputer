package com.nguyenz.nguyencomputer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Float price;

    @Column(name = "category_id")
    private int categoryId;
}
