
package com.mycompany.b;

import java.lang.Math;
public class Circle extends Shape {
    private double radius;
    public Circle() {
        this.radius =0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "radius= " + radius+" area: "+getArea()+" perimeter:"+getPerimeter();
    }
    
    
}
