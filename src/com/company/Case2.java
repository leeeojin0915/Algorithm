package com.company;

import java.util.Scanner;
/**
 *
 *
 * 대소문자 변환
 *
 *
 */
//문자열 입력 시, 대문자는 소문자, 소문자는 대문자로 변환
//AppLe -> aPPlE
class Case2 {
    public String solution(String str) {

/*        char[] change = str.toCharArray();
        String ans = "";

        for(int i = 0 ; i< change.length; i++){
            if(Character.isUpperCase(change[i])){
                change[i] = Character.toLowerCase(change[i]);
            } else {
                change[i] = Character.toUpperCase(change[i]);
            }
            ans = String.valueOf(change);
        }

        return ans;*/
        StringBuilder ans = new StringBuilder();
        for (char a : str.toCharArray()) {
            /*if (Character.isUpperCase(a)) {
                ans.append(Character.toLowerCase(a));
            } else ans.append(Character.toUpperCase(a));*/
            if (a >= 65 && a <= 90) {
                ans.append((char)(a+32));
            } else if (a >= 97 && a <= 122) {
                ans.append((char)(a-32));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) throws Exception {
        Case2 M = new Case2();
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(M.solution(str));
    }
}
