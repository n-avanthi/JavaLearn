import java.util.*;

public class numberDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("First 10 numbers are: ");
        for(int i = num; i < num + 10; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
