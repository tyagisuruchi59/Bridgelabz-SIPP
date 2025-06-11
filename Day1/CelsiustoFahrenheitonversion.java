package Day1;

import java.util.Scanner;

public class CelsiustoFahrenheitonversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius degree :");
		int a = sc.nextInt();
		int c = (a*(9/5))+32;
		System.out.println("Temperature is "+c+" Fahrenheit degree");
    sc.close();}
}