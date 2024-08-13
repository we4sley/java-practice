package com.we4sley.level01.basic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String inputString = sc.nextLine();

        StringTokenizer st = new StringTokenizer(inputString, " ");
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            String temp = token.substring(0, 1).toUpperCase();
            sb.append(temp).append(token.substring(1)).append(" ");
            count++;
        }

        System.out.println(sb.toString() + "\n" + "총 단어 개수 : " + count + "개");
    }
}
