package com.rtr.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * how to hibernate
 * 1. use @entity to make it persistence, when jpa scan @entity annotation,
 * it will create stracutre info in the DB.
 * 2. define and generate primary key?
 * use @id
 * @generatevalue code to make generate strthgy. mysql auto increase
 * Created by lenovo on 23/11/2019.
 */
@Entity
public class Cat {
    /***
     * use @Id to refer to primary key
     */
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String catName;
    private int catAge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }
}
