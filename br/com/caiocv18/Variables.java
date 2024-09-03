package br.com.caiocv18;

public class Variables{
    public static void main(String[] args) {
        final int[] numbers = new int[5];

        numbers[2] = 10;
        //numbers = null;
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}