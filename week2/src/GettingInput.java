import java.util.Scanner;

public class GettingInput {
    public static void main(String[] args) {
        var repeatFlag = true;

        while (repeatFlag)
        {
            System.out.println("[1/2] 문자열을 입력하세요.");
            Scanner sc = new Scanner(System.in);

            var s = sc.next();
            var num = sc.nextInt();
            var leftover= sc.nextLine();

            System.out.println("(1) 출력 문자열 : " + s);
            System.out.println("(2) 출력 정수 : " + num);
            System.out.println("(3) 나머지 : " + leftover);

            System.out.println("[2/2] 문자열을 입력하세요.");
            sc = new Scanner(System.in);

            var line = sc.nextLine();

            System.out.println("(1) 출력 문자열 : " + line);

            var validFlag = false;
            System.out.println("다시 하시겠습니까? (y/N)");
            while (!validFlag)
            {
                sc = new Scanner(System.in);
                var input = sc.nextLine();
                if (input.equals("y"))
                {
                    validFlag = true;
                }
                else if (input.equals("N"))
                {
                    validFlag = true;
                    repeatFlag = false;
                    System.out.println("프로그램을 종료합니다.");
                }
                else
                {
                    System.out.println("잘못된 입력입니다. 다시 입력하세요. (y/N)");
                }
            }

        }

    }
}
