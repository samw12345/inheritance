package com.qa.aggregates;

public class BBB {
    private AAA parent = new AAA();

    public int fooBar() {
        parent.fooBar();
        System.out.println("BBB::fooBar()");
        return 99;
    }

    public void f1() {
        System.out.println("BBB::f1()");
    }
}
