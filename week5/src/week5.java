import java.util.Scanner;

public class week5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] history = new String[10]; // 입력 내역 저장 (최대 10개)
        int count = 0;                     // 현재 저장된 개수
        String lastSnippet = "";           // 마지막으로 실행한 일반 입력 (/! 용)

        while (true) {
            System.out.print("jshell> ");
            String input = sc.nextLine().trim();

            // 빈 줄은 무시하고 다시 프롬프트 출력
            if (input.length() == 0) {
                continue;
            }

            if (input.equals("/exit")) {
                System.out.println("Goodbye.");
                break;
            } else if (input.equals("/help")) {
                System.out.println("Type a Java language expression, statement, or declaration.");
                System.out.println("Or type one of the following commands:");
                System.out.println("/list: list the source you have typed.");
                System.out.println("/exit: exit the jshell tool");
                System.out.println("/history: history of what you have typed.");
                System.out.println("/!: rerun last snippet.");
            } else if (input.equals("/history")) {
                for (int i = 0; i < count; i++) {
                    System.out.println(history[i]);
                }
            } else if (input.equals("/list")) {
                int num = 1;
                for (int i = 0; i < count; i++) {
                    if (history[i].charAt(0) != '/') {
                        System.out.println(num + " : " + history[i]);
                        num++;
                    }
                }
            } else if (input.equals("/!")) {
                if (lastSnippet.length() == 0) {
                    System.out.println("No snippet to rerun.");
                } else {
                    System.out.println("Re-running '" + lastSnippet + "'.");
                }
            } else if (input.charAt(0) == '/') {
                System.out.println("Invalid command: " + input);
                System.out.println("Type /help for help.");
            } else {
                System.out.println("Running '" + input + "'.");
                lastSnippet = input;
            }

            // 실행 후 history buffer에 저장
            history[count] = input;
            count++;

            // 10개가 차면 버퍼 초기화
            if (count >= 10) {
                System.out.println("The history buffer is cleared.");
                for (int i = 0; i < history.length; i++) {
                    history[i] = null;
                }
                count = 0;
            }
        }

        sc.close();
    }
}
