import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long sum = a;

        for(int i = a+1; i<b; i++ ){
            sum *=i;
        }
        System.out.println(sum);
    }
}