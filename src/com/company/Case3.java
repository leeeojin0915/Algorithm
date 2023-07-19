package com.company;

import java.util.Scanner;

/**
 *
 * 문장 속 단어
 *
 */
class Case3 {
    public String solution(String str) {
//        String[] a = str.split(" ");sub_welcome1
//        int min = 0;
//        String ans = "";
//        for (int i = 0; i < a.length; i++) {
//            if (a[i].length() > min) {
//                min = a[i].length();
//                ans = a[i];
//                System.out.println(a[i]);
//            }
//        }

//        for(String res : a){
//            if(res.length() > min){
//                min = res.length();
//                ans = res;
//            }
//        }

        String ans = "";
        int empty; //공백 인덱스
        int min = Integer.MIN_VALUE; //최소 길이

        while((empty = str.indexOf(' ')) != -1){
            System.out.println("str0 : "+str);
            String tmp = str.substring(0, empty);
            int len = tmp.length();
            System.out.println("tmp : "+tmp +", len: "+len);

            if(len > min){
                min = len;
                ans = tmp;
            }
            str = str.substring(empty+1); //공백+1 부터 조건문 시작하도록 자른다.
            System.out.println("str2 : "+str+", length : "+str.length());
        }
        if(str.length() > min) ans = str;
        System.out.println("min : "+min+", ans:"+ans);

        return ans;
    }

    public static void main(String[] args) {
        Case3 case3 = new Case3();
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(case3.solution(str));

    }

}
