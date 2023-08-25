package com.principles.liskov_substitution.bad;

public class Child extends Person{
    public Child(String name, String lastName){
        super(null, name, lastName, null);
    }

    @Override
    public void pay(){
        throw new RuntimeException("A child can't pay");
    }
}
