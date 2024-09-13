package cond;

public class CondOp2 {

    public static void main(String[] args) {

        int age1 = 17;
        int age2 = 18;
        String status1 = (age1 >= 18) ? "성인" : "미성년자";
        String status2 = (age2 >= 18) ? "성인" : "미성년자";
        System.out.println("age1 = " + age1 + ", status1 = " + status1);
        System.out.println("age2 = " + age2 + ", status2 = " + status2);
    }

}
