package com.qa.aggregates;

public class MainUnit {
    public static void main(String[] args) {
        IAAA root = new AAAStub();

        BBB parent = new BBB((AAA) root);

        parent.fooBar();
    }
}
