import java.util.*;

public class intInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number is: " + num);
        sc.close();
    }
}
