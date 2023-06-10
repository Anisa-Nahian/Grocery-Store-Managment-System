
package com.mycompany.grocery;

public class Product {
    private int code;
    private String productName;
    private double pricePerUnit;
    private String unit;
    
    
    public Product() {
        this.code=0;
        this.productName = "";
        this.pricePerUnit = 0;
        this.unit = "";
    }
    
    public Product(int code,String productName, double pricePerUnit, String unit) {
        this.code=code;
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.unit = unit;
        
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getProductName() {
        return productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        //return "code=" + code + ", productName=" + productName + ", pricePerUnit=" + pricePerUnit + ", unit=" + unit;
        return "\n"+code+"\t"+productName+"\t"+pricePerUnit+"\t\t"+unit+"\t";
    }
    
    
    
    
}
