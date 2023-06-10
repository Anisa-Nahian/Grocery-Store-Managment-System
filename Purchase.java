
package com.mycompany.grocery;

public class Purchase{
    Product p;
    int quantity;
    double cost;
    
    public Purchase() {
        this.p=new Product(0,"",0,"");
        this.quantity = 0;
        this.cost = 0;
    }
    
    public Purchase(Product p,int quantity, double cost) {
        this.p=p;
        this.quantity = quantity;
        this.cost = cost;
    }
    public void setP(Product p) {
        this.p = p;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Product getP() {
        return p;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return p.toString()+""+quantity+"\t"+cost;
                }
                
    }
    

    
    
    
