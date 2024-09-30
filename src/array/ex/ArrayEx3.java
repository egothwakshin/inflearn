package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("(내 풀이) 출력");
        //내 풀이
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[(numbers.length-1)-i]);
            if (i < numbers.length -  1){
                System.out.print(", ");
            }
        }
        System.out.println("");

        //김영한 풀이
        System.out.println("(김영한 풀이) 출력");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
