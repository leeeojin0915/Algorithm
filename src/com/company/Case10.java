package com.company;

import java.util.Scanner;

/**
 * 가장 짧은 문자거리
 * teachermode e -> 10121012210
 * 문자열의 길이는 100을 넘지 않는다.
 */
public class Case10 {
    public int[] solution(String str, char cha) {
        int[] ans = new int[str.length()];
        int p = 101;

        // 왼쪽에서 오른쪽방향으로 갈때
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == cha) { // (0)t == e => 같지않음
                // (1)e == e => 같음
                // (2)a == e => 같지않음
                // (3)c == e => 같지않음
                //
                p = i;
                // 101 = 0
                ans[i] = 0;
            } else { // (0) t != e => 같지않음
                // (1)
                // (2) a != e => 0-2 => -1 -> 1 p-->1
                // (3) c != e => 1-3 => -2 -> 2 p-->2
                ans[i] = Math.abs(p - i);
                // 101-0 -> 101

                // p++;
                // ans[i]=p;
                // System.out.print(str.charAt(i));
            }
        }
        // 101 0 1 2 3 0 1 2 3 4 0
        // teachermode
        // 오른쪽에서 왼쪽방향으로 갈 경우, 문자열길이부터 출발
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == cha) {// (10) e == e
                // (9) d != e
                // (8) o != e
                // (5) e = e
                // (4) h != e
                // (1) e = e
                p = i; // (10) 101 = 10
                // (5)  10 = 5
                // (1) 5 = 1
                ans[i] = 0; // (10) ans[10] =0
                // (5)  ans[5] = 0
                // (1) ans[1] = 0
            } else { //(9) d != e
                //(8) o != e
                //(4) h != e
                //(3) C != e
                //(2) a != e

                if (ans[i] > Math.abs(p - i)) {
                    ans[i] = Math.abs(p - i);
                    //ans[9] > 10-9 => 4 > 1 (o) => ans[9] = 1
                    //ans[8] > 10-8 => 3 > 2 (o) => ans[8] = 2
                    //ans[4] > 5-4 => 3 > 1 (o) => ans[4] = 1
                    //ans[3] > 5-3 => 2 > 2 (x) => false ans[3] = 2
                    //ans[2] > 5-2 => 1 > 3 (x) => false ans [2] = 1
                    //ans[0] > 1-0 => 101 > 1 (o) => ans[0] = 1
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Case10 case10 = new Case10();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char target = in.next().charAt(0);

        for(int x:case10.solution(str, target)){
            System.out.print(x+" ");
        }
    }
}