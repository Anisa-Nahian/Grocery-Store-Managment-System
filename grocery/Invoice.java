
package com.mycompany.grocery;

import java.util.ArrayList;
public class Invoice {
    Customer c;
    ArrayList<Purchase> purchase;
    
    public Invoice() {
        this.c = new Customer("","","","");
    }

    public Invoice(Customer c, ArrayList<Purchase> purchase) {
        this.c = c;
        this.purchase = purchase;
    }

    public void setC(Customer c) {
        this.c = c;
    }
    
    public void setPurchase(ArrayList<Purchase> purchase) {    
        this.purchase = purchase;
    }

    public Customer getC() {
        return c;
    }

    public ArrayList<Purchase> getPurchase() {
        return purchase;
    }
    public double totalCost()
    {
        double sum=0;
        for(Purchase i: purchase)
        {
            sum=sum+i.getCost();
        }
        return sum;
    }
    @Override
    public String toString() {
        String str="Code\tProduct\tPrice(per unit)\tunit\tqty\tCost\n";
        String shop="--------------------------------------------------------------"
                + "\nGrocery Store\nBill\n------------------------------------------------------------";
        return shop+c.toString()+str+ purchase.toString().replace("[","").replace("]","").replace(",","").replace(" ","")
                +"\n\t\t\t\t\t------------------"
                +"\n\t\t\t\t\tTotal cost:"+totalCost()+"\n----------------------------------------------------------------------"
                ;
    }
    
    
    
}
