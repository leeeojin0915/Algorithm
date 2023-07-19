package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 단어 뒤집기
 *
 */
public class Case4 {
    public ArrayList<String> solution(String[] str){
        ArrayList<String> ans = new ArrayList<>();

        for (String a : str){ //apple
            char[] ch = a.toCharArray(); //char배열로 바꾸기 [a,p,p,l,e]
            char[] re = new char[ch.length];

            for(int i =0;i<ch.length;i++){
                re[i] = ch[ch.length-1-i];
                System.out.println("원래 문자 : "+ch[i]+" ,바뀐 문자 : " +ch[ch.length-1-i]);
            }
            String tmp = String.valueOf(re);
            ans.add(tmp);
        }

//         for(String a:str){
//             String st = new StringBuilder(a).reverse().toString();
//             ans.add(st);
//         }

        return ans;
    }
    public static void main(String[] args) {
        Case4 case4 = new Case4();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] str = new String[num];
        for(int i = 0 ;i<num;i++){
            str[i] = sc.next();
        }
        for(String a : case4.solution(str)){
            System.out.println(a);
        }
    }
}
