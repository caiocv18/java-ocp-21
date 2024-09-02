package br.com.caiocv18;

public class InitializerBlock {
    private String name;

    public InitializerBlock(){
        System.out.println("Constructor...");
    }

    {System.out.println("Initilizer block...");}

    public static void main(String[] args) {
        InitializerBlock initializerBlock = new InitializerBlock();
        initializerBlock.setName("Caio Vinícius");
        System.out.println(initializerBlock.getName());
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
