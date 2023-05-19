package com.company;

import java.util.Scanner;

public class Case5 {
    public String solution(String str) {
        char[] ch = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(ch[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(ch[rt])) {
                rt--;
            } else {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
        }
        String result = String.valueOf(ch);

        return result;
    }

    public static void main(String[] args) {
        Case5 case5 = new Case5();
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(case5.solution(str));
    }


}
