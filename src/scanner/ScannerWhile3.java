package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("입력한 숫자가 0이면 프로그램을 종료합니다.");
        while (true){
            System.out.print("숫자를 입력하세요: ");
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }
            sum += num;
        }
        System.out.println("입력한 숫자의 총 합은 " + sum + "입니다");

    }
}
