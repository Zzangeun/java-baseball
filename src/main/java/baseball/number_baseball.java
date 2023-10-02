package baseball;

import java.util.Arrays;
import java.util.Scanner;

public class number_baseball {

    public String user_numbers;
    public String com_numbers;

    public void getUser_numbers() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요 : ");

        user_numbers = sc.next();

        if (user_numbers.length()!=3){
            throw new IllegalArgumentException("Invalid argument: " + user_numbers);
        }
    }

}
