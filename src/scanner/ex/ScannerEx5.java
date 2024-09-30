package scanner.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        //num1 이 num1보다 큰 경우, 두 숫자를 교환해야 합니다.
        if(num1 > num2){
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }

        // 나의 풀이
        String str = "";
        for (int i = num1; i <= num2; i++){
            if(i == num2){
                str = str + i;
                break;
            }
            str = str + i + ", ";
        }
        System.out.println("(나의 풀이) 두 숫자 사이의 모든 정수: " + str);


        // 김영한 풀이
        System.out.print("(김영한 풀이) 두 숫자 사이의 모든 정수: ");
        for (int i = num1; i <= num2; i++){
            System.out.print(i);
            if (i != num2){
                System.out.print(", ");
            }
        }
    }
}
