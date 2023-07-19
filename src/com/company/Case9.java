package com.company;

import java.util.Scanner;

/**
 * 숫자만 추출
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 */
public class Case9 {
    public int solution(String str) {
        char[] cha = str.toCharArray(); //문자열 쪼개기
        String ans = "";

        for (char c : cha) {
            if (!Character.isAlphabetic(c)) { //쪼갠 문자가 알파벳이 아닐 경우, ans에 합친다
                ans += c;
            }
        }
        return Integer.parseInt(ans); //자연수를 구해야하므로 parseInt 이용
    }

    public static void main(String[] args) {
        Case9 case9 = new Case9();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(case9.solution(str));
    }

}
