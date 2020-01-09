package com.qa.aggregates;

public abstract class AAA {
private int x = 7;

public AAA() {

}

public int fooBar(){
    x = 9;
    System.out.println("BBB::fooBar()");
    return 3;
}

public abstract void f1();
}
