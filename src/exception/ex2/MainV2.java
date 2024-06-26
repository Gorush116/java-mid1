package exception.ex2;

import java.util.Scanner;

public class MainV2 {

    public static void main(String[] args) throws NetworkClientExceptionV2 {
//        NetworkServiceV2_1 networkServiceV2_1 = new NetworkServiceV2_1();
//        NetworkServiceV2_2 networkServiceV2_2 = new NetworkServiceV2_2();
        NetworkServiceV2_3 networkServiceV2_3 = new NetworkServiceV2_3();
        NetworkServiceV2_4 networkServiceV2_4 = new NetworkServiceV2_4();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

//            networkServiceV2_1.sendMessage(input);
//            networkServiceV2_2.sendMessage(input);
//            networkServiceV2_3.sendMessage(input);
            networkServiceV2_4.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
