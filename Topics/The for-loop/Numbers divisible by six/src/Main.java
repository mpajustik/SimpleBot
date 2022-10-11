import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sumOfNumbers = scanner.nextInt();
        int sum = 0;
        int inputNumber;
        for(int i = 0; i<sumOfNumbers; i++ ){
            inputNumber = scanner.nextInt();
            if(inputNumber%6 == 0){
                sum+=inputNumber;
            }
        }
        System.out.println(sum);
    }
}