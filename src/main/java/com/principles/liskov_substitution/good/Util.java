package com.principles.liskov_substitution.good;

public class Util {
    public static void main(String[] args) {
        Adult adult = new Adult("John", "Smith", "123456789", "1020-3040-50");
        Child child = new Child("Johncito", "Smith", adult);
        child.getTutor().pay();
    }
}
