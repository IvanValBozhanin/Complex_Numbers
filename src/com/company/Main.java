package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TestBaseFunctions();
//        TestClone();
//        TestComparable();
    }
    public static void TestBaseFunctions(){
        ComplexNumber a = new ComplexNumber(3.5, 5.5);
        ComplexNumber b = new ComplexNumber(-3.5, 1);
        System.out.printf("%s + %s = %s\n", a.toString(), b.toString(), a.add(b).toString());
        System.out.printf("%s - %s = %s\n", a.toString(), b.toString(), a.subtract(b).toString());
        System.out.printf("%s * %s = %s\n", a.toString(), b.toString(), a.multiply(b).toString());
        System.out.printf("%s / %s = %s\n", a.toString(), b.toString(), a.divide(b).toString());
        System.out.printf("|%s| = %f\n", a.toString(), a.abs());
    }

    public static void TestClone(){
        ComplexNumber cn = new ComplexNumber(5, -6);
        ComplexNumber cc = (ComplexNumber) cn.clone();
        cc.setA(-11);
        System.out.println(cn.toString() + " " + cc.toString());
    }

    public static void TestComparable(){
        ComplexNumber [] c = new ComplexNumber[5];
        c[0] = new ComplexNumber(5.4, 6);
        c[1] = new ComplexNumber(1.415, -200);
        c[2] = new ComplexNumber(-2, 23);
        c[3] = new ComplexNumber(-1, -1);
        c[4] = new ComplexNumber(1000, 2);
        Arrays.sort(c);
        for (ComplexNumber cn :
                c) {
            System.out.println(cn.toString());
        }
    }
}
