package com.company;

import java.util.Scanner;

public class Case8 {
    public String solution(String str){
        String answer = "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]",""); // 대소문자 구분X
        //예시 - found7, time: study; Yduts; emit, 7Dnuof
        System.out.println(str); // FOUNDTIMESTUDYYDUTSEMITDNUOF
        String tmp = new StringBuilder(str).reverse().toString(); // 문자열 뒤집기
        System.out.println(tmp); // FOUNDTIMESTUDYYDUTSEMITDNUOF
        if(str.equals(tmp)) answer="YES";

        return answer;
    }
    public static void main(String[] args) {
        Case8 case8 = new Case8();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(case8.solution(str));
    }
}