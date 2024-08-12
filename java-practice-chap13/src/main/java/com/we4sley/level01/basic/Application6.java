package com.we4sley.level01.basic;

import java.util.HashMap;
import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>();

        while (true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String input = sc.nextLine();

            String[] info = input.split(" ");
            if (info[0].equals("exit")) {
                break;
            }

            if (info[0].equals("search")) {
                System.out.print("검색 할 이름 : ");
                String name = sc.nextLine();
                String phone = hashMap.get(name);
                if (phone == null) {
                    System.out.println(name + "씨의 번호는 등록 되어 있지 않습니다.");
                } else {
                    System.out.println(name + "씨의 전화번호 : " + phone);
                }
            } else if (info.length < 2) {
                System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
            } else {
                hashMap.put(info[0], info[1]);
                System.out.println("추가 완료 : " + info[0] + " " + info[1]);
            }
        }
    }
}
