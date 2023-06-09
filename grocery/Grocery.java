
package com.mycompany.grocery;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.util.ArrayList;
public class Grocery extends JFrame{
    
    static JFrame f;
    static JLabel l;
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Product> products=new ArrayList<Product>();
        int menu=0;
          System.out.println("Welcome to our store");
        while(menu!=3)
        {
            System.out.println("1.Sign Up");
            System.out.println("2.Manage Product");
            System.out.println("3.Exit");
            menu=sc.nextInt();
           
            if(menu==1)
            {
                String name;
                String pass;
                String phone;
                String address;
                sc.nextLine();
                System.out.println("Enter name:");
                name=sc.nextLine();
                System.out.println("Enter password");
                pass=sc.nextLine();
                System.out.println("Enter phone:");
                phone=sc.nextLine();
                System.out.println("Enter Address");
                address=sc.nextLine();
                Customer customer=new Customer(name,pass,phone,address);
               int smenu;
               System.out.println("1.shop");
                System.out.println("2.Logout");
               smenu=sc.nextInt();
               
                
                if(smenu==1)
                {
                    ArrayList<Purchase> purchase=new ArrayList<Purchase>();
                    System.out.println("product list:");
                    System.out.println("Code\tProduct\tPrice(per unit)\tunit");
                for(Product p: products)
                {
                    System.out.print(p+"");
                }
                    System.out.println("");
                int n=0;
                double sum=0;
                while(n!=2)
                {
                     System.out.println("1.Add to cart");
                     System.out.println("2.Place order");
                    n=sc.nextInt();
                    if(n==1)
                    {
                    int add;
                    System.out.println("enter product code");
                    add=sc.nextInt();
                    for(Product p:products)
                    {
                        if(p.getCode()==add)
                        {
                            int qty;
                            System.out.println("quantity?");
                            qty=sc.nextInt();
                            double cost=qty*p.getPricePerUnit();
                            sum=sum+cost;
                            Purchase pur=new Purchase(p,qty,cost);
                            purchase.add(pur);
                            System.out.println("----------------------------------------------------");
                        System.out.println("\t\tcart");
                        System.out.println("----------------------------------------------------");
                        System.out.print("Code\tProduct\tPrice(per unit)\tunit\tqty\tCost\n");
                        for(Purchase i: purchase)
                        {
                            System.out.print(i+"");
                        }
                        System.out.println("\n-------------------------------------------------------");
                        }
                    }
                        
                    }
                    if(n==2)
                {
                    
                    Invoice bill=new Invoice(customer,purchase);
                    
                    System.out.println(bill+"");
                    
                    try{
                        
                        Writer w;
                        w = new BufferedWriter(new FileWriter("Purchase History.txt",true));
                        w.append(bill.toString());
                        w.close();
                        
                    }
                    catch(IOException e)
                    {
                        System.out.println(e);
                    }
        f = new JFrame("Bill");
        
        l = new JLabel("<html>" + bill.toString().replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>").replaceAll("\t", "- - - - - - -") + "</html>");
        JPanel p = new JPanel();
        p.add(l);
        f.add(p);
        f.setSize(300, 300);
        f.show();
                }
                    
                }
                
                }
                
                 
            }
            if(menu==2)
            {
                int n;
                System.out.println("1.Add Product");
                System.out.println("2.Delete product");
                System.out.println("3.View Product List");
                n=sc.nextInt();
                if(n==1)
                {
                    int code;
                    String name;
                    double price;
                    String unit;
                    System.out.println("Code:");
                    code=sc.nextInt();
                    boolean doesExist=false;
                    for(Product i: products)
                    {
                        if(i.getCode()==code)
                        {
                            doesExist=true;
                        }
                    }
                    if(doesExist==true)
                    {
                        System.out.println("This barcode is already taken");
                    }
                    else
                    {
                    System.out.println("Product name");
                    sc.nextLine();
                    name=sc.nextLine();
                    System.out.println("price per unit:");
                    price=sc.nextDouble();
                    System.out.println("unit:");
                    sc.nextLine();
                    unit=sc.nextLine();
                    Product p=new Product(code,name,price,unit);
                    products.add(p);
                    System.out.println("Product List:");
                    System.out.println("Code\tProduct\tPrice(per unit)\tunit");
                    
                    for(Product i: products)
                    {
                        System.out.print(i+"");
                    }
                    System.out.println("");
                    }
                        
                    
                }
                if(n==2)
                {
                    int code;
                    
                    System.out.println("Code\tProduct\tPrice(per unit)\tunit");
                    
                    for(Product i: products)
                    {
                        System.out.print(i+"");
                    }
                    System.out.println("");
                    
                    System.out.println("Enter code to delete product");
                    code=sc.nextInt();
                    for(int i=0;i<products.size();i++)
                    {
                        if(products.get(i).getCode()==code)
                        {
                            products.remove(i);
                            System.out.println("Updated product list:");
                            System.out.println("Code\tProduct\tPrice(per unit)\tunit");
                            for(Product p: products)
                            {
                                System.out.print(p+"");
                            }
                                System.out.println("");
                        }
                    }
                }
                if(n==3)
                {
                    System.out.println("Product list:");
                    System.out.println("Code\tProduct\tPrice(per unit)\tunit");
                for(Product p: products)
                {
                    System.out.print(p+"");
                }
                    System.out.println("");
                }
                
            }
        }
    }
}

