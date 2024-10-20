package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        //NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        //NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
/**
 * 연결이 실패하면 데이터를 전송하지 않아야 하는데, 여기서는 데이터를 전송한다.
 * 오류가 발생했을 때 어떤 오류가 발생했는지 자세한 내역을 남기면 이후 디버깅에 도움이 될 것이다.
 * 오류 로그를 남겨야 한다.
 */
