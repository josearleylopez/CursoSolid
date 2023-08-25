package com.principles.liskov_substitution.good;

public class Adult extends Person{
    private String dni;
    private String creditCard;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Adult(String name, String lastName, String dni, String creditCard) {
        super(name, lastName);
        this.dni = dni;
        this.creditCard = creditCard;
    }

    public void pay(){
        System.out.println("DNI " + getDni() + "Pay with" + getCreditCard());
    }
}
