package com.company;

public class ComplexNumber implements Cloneable, Comparable<ComplexNumber>{
    private double a, b;

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNumber add(ComplexNumber c){
        return new ComplexNumber(a+c.a, b+c.b);
    }

    public ComplexNumber subtract(ComplexNumber c){
        return new ComplexNumber(a-c.a, b-c.b);
    }

    public ComplexNumber multiply(ComplexNumber c){
        return new ComplexNumber(a*c.a - b*c.b, b*c.a - a*c.b);
    }

    public ComplexNumber divide(ComplexNumber c){
        return new ComplexNumber((a*c.a + b*c.b)/(c.a*c.a + c.b*c.b),
                (b*c.a + a*c.b)/(c.a*c.a + c.b*c.b));
    }

    public double abs(){
        return Math.sqrt(a*a + b*b);
    }

    public static ComplexNumber add(ComplexNumber p, ComplexNumber q){
        return p.add(q);
    }

    public static ComplexNumber subtract(ComplexNumber p, ComplexNumber q){
        return p.subtract(q);
    }

    public static ComplexNumber multiply(ComplexNumber p, ComplexNumber q){
        return p.multiply(q);
    }

    public static ComplexNumber divide(ComplexNumber p, ComplexNumber q){
        return p.divide(q);
    }

    public static double abs(ComplexNumber p){
        return p.abs();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "(" +
                a + (b == 0.0? "" : (b>0.0? " + " + b: " - " + (-b)) + "i") +
                ')';
    }

    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    @Override
    public int compareTo(ComplexNumber o) {
        return Double.compare(this.abs(), o.abs());
    }
}
