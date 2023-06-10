
package com.mycompany.grocery;


public class Customer extends SignUp {
    
    Customer()
    {
        super();
    }
    Customer(String name, String password, String phone, String address)
    {
        super(name,password,phone,address);
    }
    
    @Override
    public String toString()
    {
        return "\nname:\t"+getName()+"\t\taddress:\t"+getAddress()+"\n"+
                "----------------------------------------------------------\n";
    }
    
    
}
