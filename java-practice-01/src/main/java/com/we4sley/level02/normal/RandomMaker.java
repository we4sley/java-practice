package com.we4sley.level02.normal;

import java.util.Random;

public class RandomMaker {

    public static int randomNumber(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public static String randomUpperAlphabet(int length) {
        String text = "";

        for (int i = 0; i < length; i++) {
            int randomNum = randomNumber(65, 90);
            text += (char) randomNum;
        }

        return text;
    }

    public static String rockPaperScissors() {
        String text = "";
        int randomNum = randomNumber(0, 2);

        switch (randomNum) {

            case 0:
                text = "Rock";
                break;
            case 1:
                text = "Scissors";
                break;
            case 2:
                text = "Paper";
                break;
        }

        return text;
    }

    public static String tossCoin() {
        String text = "";
        int randomNum = randomNumber(0, 1);

        switch (randomNum) {

            case 0:
                text = "앞면";
                break;
            case 1:
                text = "뒷면";
                break;
        }

        return text;
    }
}
