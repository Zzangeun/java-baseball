package baseball;

import java.util.Arrays;
import java.util.Scanner;

public class number_baseball {

    public String user_numbers;
    public String com_numbers;

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

}
