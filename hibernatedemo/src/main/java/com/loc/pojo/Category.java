/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loc.pojo;

import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "category")
@Getter
@Setter
public class Category implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    private String name;
    private String description;
}
