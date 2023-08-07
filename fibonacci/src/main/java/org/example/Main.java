package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sum=0, count, deger=0, var=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        count = input.nextInt();
        System.out.print(deger + " " + var);

        for(int i=1; i<count; i++){
            sum = deger + var;

            System.out.print(" " + sum);
            deger = var;
            var = sum;
        }
    }
}