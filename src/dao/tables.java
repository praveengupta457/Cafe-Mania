//R
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author WIN 10
 */
public class tables {

    public static void main(String[] args) {
        try {
            String userTable = "Create table user(id int AUTO_INCREMENT primary key,name varchar(50),email varchar(50),mobileNumber varchar(10),address varchar(200),password varchar(16),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','India','admin','what is your favorite color?','black','true')";
            String categoryTable = "Create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String billTable = "Create table bill(id int primary key,name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
            String productTable = "Create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
            
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfully");
            DbOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully");
            DbOperations.setDataOrDelete(productTable, "Product Table Created Successfully");
            DbOperations.setDataOrDelete(billTable, "Bill Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
