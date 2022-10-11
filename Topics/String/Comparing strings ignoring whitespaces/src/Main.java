import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String w1 = scanner.nextLine().replace(" ", "");
        String w2 = scanner.nextLine().replace(" ", "");

        System.out.println(w1.equals(w2));

    }
}