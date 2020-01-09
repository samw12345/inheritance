package com.qa.aggregates;

import com.qa.inheritance.AAA;

public class BBB {
    private AAA parent;

    public int fooBar() {
        System.out.println("BBB::fooBar()");
        return 0;
    }
     
    public void f1() {
        System.out.println("BBB::f1()");
    }
}
