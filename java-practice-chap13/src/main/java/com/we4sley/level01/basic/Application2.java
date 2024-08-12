package com.we4sley.level01.basic;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> urlList = new ArrayList<>();

        while (true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");

            String url = sc.nextLine();

            Collections.reverse(urlList);

            if (url.equals("exit")) {
                break;
            }

            if (urlList.size() == 5) {
                urlList.remove(0);
                urlList.add(url);
            } else {
                urlList.add(url);
            }

            Collections.reverse(urlList);

            System.out.println(urlList);
        }
    }
}
