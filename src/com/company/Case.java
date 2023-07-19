package com.company;

import java.util.Scanner;
/**
 *
 * 문자찾기
 *
 */
class Case {
    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(char a : str.toCharArray()){
            if(a == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Case M = new Case();
        Scanner in = new Scanner(System.in);

        String str = in.next();
        char t = in.next().charAt(0);
        System.out.println(M.solution(str, t));
    }
}