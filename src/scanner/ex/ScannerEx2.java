package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("하나의 정수를 입력하세요: ");
        int number = scanner.nextInt();


        //조건문 풀이법
        if (number % 2 == 0){
            System.out.println("(조건문 풀이법) 입력한 숫자 " + number + " 은(는) 짝수입니다.");
        } else {
            System.out.println("(조건문 풀이법) 입력한 숫자 " + number + " 은(는) 홀수입니다.");
        }


        //삼항연산자 풀이법
        String str = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println("(삼항연산자 풀이) 입력한 숫자 " + number + " 은(는) " + str + " 입니다.");




    }
}
