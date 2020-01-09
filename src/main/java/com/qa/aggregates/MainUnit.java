package com.qa.aggregates;

import com.qa.inheritance.AAA;
import com.qa.inheritance.BBB;

public class MainUnit {
    public static void main(String[] args) {

        AAA parent = new BBB();

        parent.fooBar();
    }
}
