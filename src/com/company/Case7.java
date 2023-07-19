package com.company;

import java.util.Scanner;

/**
 *
 * 회문 문자열
 *
 */
public class Case7 {
    public String solution(String str) {
        String ans = "YES";
        str = str.toUpperCase();
        //goOG
        //strts -> st|r|ts
        // for(int i =0;i<str.length()/2 ;i++){
        //     if(str.charAt(i) != str.charAt(str.length()-i-1)) return "NO";
        // }
        // return ans;


        //reverse() -> 문자열 뒤집기
        //strts <-> strts
        //goOg <->gOog
        StringBuilder stringBuilder= new StringBuilder(str);
        if(stringBuilder.reverse().toString().equals(str)){
            return ans;
        }else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Case7 case7 = new Case7();
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(case7.solution(str));
    }
}

