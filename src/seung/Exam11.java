package seung;

import java.util.Scanner;

public class Exam11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하고 엔터를 치세요.");
        int num1 = sc.nextInt();

        System.out.println("두번째 숫자를 입력하고 엔터를 치세요.");
        int num2 = sc.nextInt();

        int result1 = num1 + num2;
        System.out.println("더하기 : " + result1);

        int result2 = num1 - num2;
        System.out.println("빼기 : " + result2);

        int result3 = num1 * num2;
        System.out.println("곱하기 : " + result3);

        int result4 = num1 / num2;
        System.out.println("나누기의 몫 : " + result4);

        int result5 = num1 % num2;
        System.out.println("나누기의 나머지 : " + result5);
    }
}
