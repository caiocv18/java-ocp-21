package br.com.caiocv18;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Learning Switch statement...");
        switchVanilla(1);
        switchBasic(0);
        switchCombiningValues(1);
        switchCombiningValuesWithComma(0);
        switchWithArrow(0);
        switchBasic(10);
        var anyValue = switchAsExpression(10);
        System.out.println(anyValue);
    }

    static void switchVanilla(int variable){
        System.out.println("Switch Vanilla...");
        switch (variable) {
            case 0:
                System.out.println("Value 0");
                break;
            case 1:
                System.out.println("Value 1");
                break;
            default:
                System.out.println("Another value");
        }
    }

    static void switchBasic(int variable){
        System.out.println("Switch Basic...");
        switch(variable){
            case 0:
                System.out.println("Value 0");
            case 1:
                System.out.println("Value 1");
        }
    }

    static void switchCombiningValues(int variable){
        System.out.println("Switch combining values...");
        switch (variable) {
            case 0: case 1:
                System.out.println("Value 0");
                System.out.println("Value 1");
                break;
            default:
                System.out.println("Another value");
        }
    }

    static void switchCombiningValuesWithComma(int variable){
        System.out.println("Switch combining values with comma...");
        switch (variable) {
            case 0, 1:
                System.out.println("Value 0");
                System.out.println("Value 1");
                break;
            default:
                System.out.println("Another value");
        }
    }

    static void switchWithArrow(int variable){
        System.out.println("Switch with arrow...");
        switch(variable){
            case 0 -> System.out.println("Value 0");
            case 1 -> System.out.println("Value 1");
            default -> System.out.println("Another value");
        }
    }

    static Object switchAsExpression(int variable){
        System.out.println("Switch as expression...");
        return switch (variable) {
            case 0 -> "Word";
            case 1 -> 1;
            case 2 -> 3.14;
            default -> false;
        };
    }
}
