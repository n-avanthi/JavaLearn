import java.util.*;

public class integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        if(num >= 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
        sc.close();
    }
}
