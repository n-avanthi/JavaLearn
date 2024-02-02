import java.util.*;

public class perimeter_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        perimeter ob1 = new perimeter();
        double radius = sc.nextDouble();
        double result = ob1.circle(radius);
        System.out.println("Perimeter calculated is : " + result);
        sc.close();
    }
    
}

class perimeter {
    double circle(double radius) {
        double result;
        result = 2 * radius * Math.PI;
        return result;
    }
}