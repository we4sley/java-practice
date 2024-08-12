package com.we4sley.level01.basic;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            set.add(input);
        }

        System.out.println("정렬 된 단어 : " + set);
    }
}
