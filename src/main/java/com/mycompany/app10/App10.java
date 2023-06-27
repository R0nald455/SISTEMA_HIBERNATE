/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.app10;

import clases.clientes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App10 {



    public static void main(String[] args) {
        SessionFactory myfactory=new  Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(clientes.class).buildSessionFactory();
        
        Session misesion =myfactory.openSession();
        
        try{
        clientes cli1=new clientes("coca","coca",".21564");
        misesion.beginTransaction();
        misesion.save(cli1); 
        misesion.getTransaction().commit();
        System.out.println("registro guaradado0");
        
        misesion.clear();
        }catch(Exception e){
        misesion.clear();
        }
        
        
        
        
        
        
    }
    
}

