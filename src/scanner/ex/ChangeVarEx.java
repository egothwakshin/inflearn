package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;


        //①temp에 a값을 임시로 넣는 방법
        /*
        temp = a;
        a = b;
        b = temp;
        */

        //②temp에 b값을 임시로 넣는 방법
        temp = b;
        b = a;
        a = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
