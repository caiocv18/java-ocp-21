package br.com.caiocv18;

public class InnerBlock {
    public void myMethod(){
        {System.out.println("An inner block");}
    }
    {System.out.println("An instance initializer block");}

    public final static void main(String... options){
        System.out.println("Starting main...");
        var myVar = new InnerBlock();
        myVar.myMethod();
        System.out.println("Finishing main...");
    }
}
