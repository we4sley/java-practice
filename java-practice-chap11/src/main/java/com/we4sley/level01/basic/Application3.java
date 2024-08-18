package com.we4sley.level01.basic;

import java.io.*;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * (원본 파일이 존재 하는 경우)
         * 원본 파일의 이름을 입력하세요 : origin.txt
         * 복사 파일의 이름을 입력하세요 : copy.txt
         *
         * ----- 출력 예시 -----
         *
         * 파일 복사가 성공적으로 완료 되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * (원본 파일이 존재하지 않는 경우)
         * 원본 파일의 이름을 입력하세요 : origin2.txt
         * 복사 파일의 이름을 입력하세요 : copy2.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
         *
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("병합할 파일의 개수 입력 : ");
        int numberOfFiles = scanner.nextInt();
        scanner.nextLine();

        String[] fileNames = new String[numberOfFiles];
        for (int i = 0; i < numberOfFiles; i++) {
            System.out.print((i + 1) + " 번째 파일 이름 입력 : ");
            fileNames[i] = scanner.nextLine();
        }

        System.out.print("병합 될 파일명 입력 : ");
        String destinationFile = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            for (String fileName : fileNames) {
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }
            System.out.println("파일 병합이 완료 되었습니다.");
        } catch (IOException e) {
            System.out.println("오류 : " + e.getMessage());
        }
    }
}
