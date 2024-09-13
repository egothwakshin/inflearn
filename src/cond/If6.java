package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if(price >= 10000){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매시 1000원 할인");
        } else if(age <= 10){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인금액: " + discount + "원");

        if (false)
            System.out.println("if문 코드블럭에 걸리는 출력");
            System.out.println("if문 코드블럭에 걸리지 않는 출력");
    }
}
