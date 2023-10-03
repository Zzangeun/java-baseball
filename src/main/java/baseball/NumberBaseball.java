package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Scanner;

public class NumberBaseball {

    public String userNumbers ="";
    public String comNumbers ="";
    public int ball;
    public int strike;

    public void randomComNumbers(){
        int[] n = new int[3];
        int r = 0;
        for(int i = 0; i<3;i++) {
            do {
                r = Randoms.pickNumberInRange(1, 9);
            } while (exists(n, r));
            n[i] = r;

            comNumbers += r;
        }

    }

    public boolean exists(int n[], int r) {
        for (int i = 0; i < n.length; i++) {
            if(n[i] == r)
                return true;
        }
        return false;
    }

    public void getUserNumbers() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요 : ");

        userNumbers = sc.next();

        if (userNumbers.length()!=3){
            throw new IllegalArgumentException("Invalid argument: " + userNumbers);
        }
    }

    public boolean checkNumbers(){
        ball=0;
        strike=0;
        for (int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                checkBallOrStrike(a, b);
            }
        }

        if(ball!=0) {
            System.out.print(ball + "볼 ");
        }
        if(strike!=0) {
            System.out.print(strike + "스트라이크");
        }
        if(ball!=0||strike!=0){
            System.out.println("");
        }else{
            System.out.println("낫싱");
        }
        if(strike==3){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return false;
        }

        return true;
    }

    public void checkBallOrStrike(int a, int b){
        if(comNumbers.charAt(a)== userNumbers.charAt(b)&&a==b){
            strike++;
        }else if(comNumbers.charAt(a)== userNumbers.charAt(b)&&a!=b){
            ball++;
        }
    }

}
