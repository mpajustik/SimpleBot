import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int classRoom1 = scanner.nextInt();
        int classRoom2 = scanner.nextInt();
        int classRoom3 = scanner.nextInt();

        int desksClassRoom1 = classRoom1/2 +classRoom1%2;
        int desksClassRoom2 = classRoom2/2 +classRoom2%2;
        int desksClassRoom3 = classRoom3/2 +classRoom3%2;

        System.out.println(desksClassRoom1+desksClassRoom2+desksClassRoom3);

    }
}