package com.company;

import java.util.Scanner;

/**문자열압축
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복
 * ->문자바로 오른쪽에 횟수표기
 * ->반복횟수가 1인 경우 생략
 * ex) KKHSSSSSSSE -> K2HS7E
 * */
public class Case11 {
    public String solution(String str) {
        StringBuilder ans = new StringBuilder();
        str = str.toUpperCase() + " ";
        int cnt = 1; // 카운트셀때
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) { // k == k cnt =2
                cnt++;
                //System.out.println("비교문자 : " + str.charAt(i) + " " + str.charAt(i + 1) + " cnt : " + cnt);
            } else { // (1) k != h
                ans.append(str.charAt(i)); // ans = k2
                if (cnt > 1) {
                    ans.append(cnt);
                }
                cnt = 1;
                //System.out.println(ans);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Case11 case11 = new Case11();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(case11.solution(str));
    }
}