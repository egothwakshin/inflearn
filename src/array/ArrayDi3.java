 package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        }; //행2, 열3

        System.out.println("행의 개수: " + arr.length);
        System.out.println("열의 개수: " + arr[0].length);

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); //한 행이 끝나면 라인 변경
        }

    }
}

