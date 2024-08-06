package com.we4sley.level01.basic.student.run;

import com.we4sley.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        // 한 명씩 추가 될 때마다 카운트함
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)

        StudentDTO[] students = new StudentDTO[10];
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (count < 11) {
            System.out.print("학년 : ");
            int grade = scanner.nextInt();

            System.out.print("반 : ");
            int classroom = scanner.nextInt();

            System.out.print("이름 : ");
            String name = scanner.next();

            System.out.print("국어 : ");
            int kor = scanner.nextInt();

            System.out.print("영어 : ");
            int eng = scanner.nextInt();

            System.out.print("수학 : ");
            int math = scanner.nextInt();

            students[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;

            System.out.print("계속 추가할 겁니까? (y/n) : ");
            String input = scanner.next();
            if (input.equals("y") || input.equals("Y")) {
                continue;
            } else if (input.equals("n") || input.equals("N")) {
                break;
            } else {
                break;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getInformation());
        }
    }
}
