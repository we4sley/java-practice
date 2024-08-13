package com.we4sley.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String input = sc.nextLine().toLowerCase();

        String[] str = input.split("[^a-zA-Z]");
        String[] uniqueWords = new String[str.length];
        int[] wordCounts = new int[str.length];
        int uniqueIndex = 0;

        for (String s : str) {
            if (!s.isEmpty()) {
                boolean check = false;
                for (int i = 0; i < uniqueIndex; i++) {
                    if (uniqueWords[i].equals(s)) {
                        wordCounts[i]++;
                        check = true;
                        break;
                    }
                }

                if (!check) {
                    uniqueWords[uniqueIndex] = s;
                    wordCounts[uniqueIndex] = 1;
                    uniqueIndex++;
                }
            }
        }

        String mostFrequentWord = null;
        int maxCount = 0;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < uniqueIndex; i++) {
            result.append(uniqueWords[i]).append(": ").append(wordCounts[i]).append("\n");

            if (wordCounts[i] > maxCount) {
                maxCount = wordCounts[i];
                mostFrequentWord = uniqueWords[i];
            }
        }

        System.out.println("===== 단어 빈도 =====");
        System.out.println(result);
        System.out.println("가장 빈도 높은 단어 : " + mostFrequentWord + " (" + maxCount + " 번)");
    }
}
