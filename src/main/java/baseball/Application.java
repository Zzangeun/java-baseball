package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("숫자 야구 게임을 시작합니다.");

        do{
            NumberBaseball nb = new NumberBaseball();

            nb.randomComNumbers();

            do{
                nb.getUserNumbers();
            }while (nb.checkNumbers());
        }while (regame());

    }

    private static boolean regame(){
        Scanner sc = new Scanner(System.in);

        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        if(1==sc.nextInt()){
            return true;
        }else{
            return false;
        }
    }

}

