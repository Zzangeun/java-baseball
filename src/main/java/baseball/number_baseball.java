package baseball;

import java.util.Arrays;
import java.util.Scanner;

public class number_baseball {

    public String user_numbers="";
    public String com_numbers="";
    public int ball;
    public int strike;

    public void randomCom_numbers(){
        int n[] = new int[3];
        int r = 0;
        for(int i = 0; i<3;i++) {
            do {
                r = (int)(Math.random()*9)+1;
            }while(exists(n,r));
            n[i] = r;
            com_numbers += r;
        }

    }

    public boolean exists(int n[], int r) {
        for (int i = 0; i < n.length; i++) {
            if(n[i] == r)
                return true;
        }
        return false;
    }

    public void getUser_numbers() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요 : ");

        user_numbers = sc.next();

        if (user_numbers.length()!=3){
            throw new IllegalArgumentException("Invalid argument: " + user_numbers);
        }
    }

    public void check_numbers(){
        ball=0;
        strike=0;
        for (int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                check_ball_or_strike(a, b);
            }
        }

        if(ball!=0) {
            System.out.print(ball + " 볼");
        }
        if(strike!=0) {
            System.out.println(" " + strike + "스트라이크");
            if(strike==3){
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            }
        }
    }

    public void check_ball_or_strike(int a, int b){
        if(com_numbers.charAt(a)==user_numbers.charAt(b)&&a==b){
            strike++;
        }else if(com_numbers.charAt(a)==user_numbers.charAt(b)&&a!=b){
            ball++;
        }
    }

}
