
package com.mycompany.grocery;


public abstract class SignUp {
    private String name;
    private String password;
    private String phone;
    private String address;
    
     public SignUp() {
        this.name = "";
        this.password = "";
        this.phone = "";
        this.address = "";
    }
     
    public SignUp(String name, String password, String phone, String address) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
    
    
}
