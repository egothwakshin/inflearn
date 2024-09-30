package scanner.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요(종료를 입력하면 종료): ");
            String name = intput.nextLine();

            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = intput.nextInt(); // 입력한 "10\n" 에서 "10"만 가져감
            intput.nextLine();  // 남은 "\n" 을 읽어들임

            System.out.println("입력한 이름: " + name + ", 나이: " + age);

        }

    }
}
