package marta;

public class SumNumber {
    public static void main(String[] args) {
        int a;
        int b;

    }

    public int sumPositiveNumbers(int a, int b){
        while(a <0|| b<0){
            throw new IllegalArgumentException("You can write only positive numbers");
        }
        return a+b;
    }
}
