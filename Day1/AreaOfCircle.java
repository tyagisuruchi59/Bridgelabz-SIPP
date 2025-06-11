package Day1;

import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double r = sc.nextDouble();

        double a = Math.PI * r * r;
        System.out.println("Area of the circle is: " + a);
        sc.close();
    }

}
