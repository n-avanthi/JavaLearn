import java.util.*;

public class largestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int [size];
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int largest = array[0];
        for(int i = 0; i< size; i++) {
            if(array[0] < array[i]) {
                largest = array[i];
            }
        }
        System.out.println("Largest ele is : "+largest);
        sc.close();
    }
}
