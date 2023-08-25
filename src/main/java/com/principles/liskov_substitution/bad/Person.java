package com.principles.liskov_substitution.bad;

public class Person {
    private String dni;
    private String name;
    private String lastName;
    private String creditCard;

    public Person(String dni, String name, String lastName, String creditCard) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.creditCard = creditCard;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public void pay(){
        System.out.println("DNI " + getDni() + "Pay with" + getCreditCard());
    }
}
