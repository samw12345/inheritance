package com.qa.aggregates;

public class BBB {
    private IAAA parent;

    public BBB(AAA theParent) {
        parent = theParent;
    }


    public int fooBar() {
        parent.fooBar();
        System.out.println("BBB::fooBar()");
        return 99;
    }

    public void f1() {
        System.out.println("BBB::f1()");
    }
}
