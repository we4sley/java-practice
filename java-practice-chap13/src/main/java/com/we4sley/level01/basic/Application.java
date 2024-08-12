package com.we4sley.level01.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("학생 성적 : ");

            queue.offer(scanner.nextInt());

            System.out.print("추가 입력하려면 y : ");
            String str = scanner.next();

            if (!(str.equals("y") || str.equals("Y"))) {
                break;
            }
        }

        int count = queue.size();

        System.out.println("학생 인원 : " + count);

        double sum = 0.0, avg = 0.0;
        while (!queue.isEmpty()) {
            sum += queue.poll();
        }

        avg = sum / count;

        System.out.println("평균 점수 : " + avg);
    }
}
