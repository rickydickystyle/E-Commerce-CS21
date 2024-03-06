/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.loc.hibernatedemo;

import com.loc.pojo.Category;
import com.loc.pojo.Product;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class Hibernatedemo {

    public static void main(String[] args) {
        try ( Session s = HibernateUtils.getFactory().openSession()) {
            Query q = s.createQuery("FROM Category");
            List<Category> results = q.getResultList();
            results.forEach(r -> System.out.printf("%s", r.getName()));
//            Query q = s.createQuery("FROM Product");
//            List<Product> results = q.getResultList();
//            results.forEach(r -> System.out.printf("%s - %s - %.1f\n", r.getName(), r.getDescription(), r.getPrice()));
        }
    }
}
