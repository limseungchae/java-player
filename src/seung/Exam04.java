package seung;

public class Exam04 {
    public static void main(String[] args) {
        System.out.println(2 + 3);
        System.out.println(2 < 3);
        System.out.println(2 > 3);

        boolean bMyCheck = (2 > 3);
        System.out.println(bMyCheck);

        // 조건문
        if ( 1 < 2 )
        {
            System.out.println("Hello");
        }

        int num = 3;
        if ( num < 2 )
        {
            System.out.println("Hi~");
        }

        int num2 = 4;
        if ( (num2 % 2) == 1 )
        {
            System.out.println("나머지가 1이면 출려된다.");
        }

        if ( (num2 % 2) == 1 )
        {
            System.out.println("나머지가 1 : 홀수");
        }
        else
        {
            System.out.println("나머지가 0 : 짝수");
        }
    }
}
