package com.qa.inheritance;

public class BBB extends AAA {
    public int fooBar() {
        System.out.println("BBB::fooBar()");
        return 0;
    }
    @Override
    public void f1() {
        System.out.println("BBB::f1()");
    }
}
