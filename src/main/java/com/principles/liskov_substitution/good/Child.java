package com.principles.liskov_substitution.good;

public class Child extends Person{
    private Adult tutor;

    public Child(String name, String lastName, Adult tutor) {
        super(name, lastName);
        this.tutor = tutor;
    }

    public Adult getTutor() {
        return tutor;
    }

    public void setTutor(Adult tutor) {
        this.tutor = tutor;
    }
}
