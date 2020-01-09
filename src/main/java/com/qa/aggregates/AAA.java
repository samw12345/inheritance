package com.qa.aggregates;

public class AAA implements IAAA {
private int x = 7;

public int fooBar(){
    x = 9;
    System.out.println("BBB::fooBar()");
    return 3;
}

public void f1() {
    System.out.println("shouldn't be here");
}
private void f2(){
    System.out.println("AAA::f2()");
}
}
