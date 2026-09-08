import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        while (count < 5)
        {
            System.out.printf("[%d/5] 정수를 입력하세요 : ", (count+1));
            sum += sc.nextInt();
            System.out.printf("[%d/5] 현재까지의 합 : %d\n", (count+1), sum);
            count++;
        }

        System.out.println("[*/*] 연산 완료. 프로그램을 종료합니다.");
    }
}
