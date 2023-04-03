package seung;

import java.util.Scanner;

public class Exam12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.더하기");
            System.out.println("2.빼기");
            System.out.println("3.곱하기");
            System.out.println("4.나누기");
            System.out.println("0.종료");

            int num = sc.nextInt();

            if (num == 0)
            {
                break;
            }
            else
            {
                if (num >4)
                {
                    System.out.println("메뉴를 잘못 선택했습니다.");
                    continue;
                }

                // 사칙연산 기능 수행
                System.out.println("첫번쨰 숫자를 입력하고 엔터를 치세요.");
                int num1 = sc.nextInt();

                System.out.println("두번쨰 숫자를 입력하고 엔터를 치세요.");
                int num2 = sc.nextInt();

                if (num == 1)
                {
                    int result1 = num1 + num2;
                    System.out.println("더하기 : " + result1);
                }

                if (num == 2)
                {
                    int result2 = num1 - num2;
                    System.out.println("빼기 : " + result2);
                }

                if (num == 3)
                {
                    int result3 = num1 * num2;
                    System.out.println("곱하기 : " + result3);
                }

                if (num == 4)
                {
                    int result4 = num1 / num2;
                    System.out.println("나누기의 몫 : " + result4);

                    int result5 = num1 % num2;
                    System.out.println("나누기의 나머지 : " + result5);
                }
            }
        }

    }
}
