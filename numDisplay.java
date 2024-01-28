public class numDisplay {
    public static void main(String[] args) {
        System.out.println("Even numbers between 50 and 80 are: ");
        for (int i = 50; i <= 80; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
