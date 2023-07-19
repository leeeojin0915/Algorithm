package com.company;

import java.util.Scanner;

/**
 *
 * 중복문자제거
 *
 */
public class Case6 {
    public String solution(String str){
        String ans = "";
        //ksekkset
        //StringBuilder stringBuilder = new StringBuilder();
        char[] ch = str.toCharArray();//[k,s,e,k,k,s,e,t],[a,p,p,l,e]
        //int a = 1;

        for(char i : ch){
            if(!ans.contains(String.valueOf(i))) ans += i;
        }

//        for(char i : ch){
//            if(!stringBuilder.toString().contains(String.valueOf(i))) stringBuilder.append(i);
//        }

//         for(int i =0;i<str.length();i++){
//             if(str.indexOf(str.charAt(i)) == i){
//                 ans += str.charAt(i);
//             }
//         }

        return ans;

    }
    public static void main(String[] args) {
        Case6 case6 = new Case6();
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(case6.solution(str));
    }

}
