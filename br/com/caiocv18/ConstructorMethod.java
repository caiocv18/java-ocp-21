package br.com.caiocv18;

public class ConstructorMethod {
    public static void ConsctructorMethod(){
        System.out.println("I'm fake constructor");
    }

    public ConstructorMethod(){
        System.out.println("Now is really the constructor");
    }

    public static void main(String[] args) {
        ConstructorMethod test = new ConstructorMethod();
        ConsctructorMethod();
    }
}