package com.sda.exercitii;

import java.util.*;

public class Scrabble {
    //comment for testing git
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a number of words");
        int nrOfWords = scan.nextInt();
        String word;

        List<String> wordList = new ArrayList<>();
        for (int i = 0; i < nrOfWords; i++) {
            System.out.println("Please insert word nr " + (i + 1));
            word = scan.next().toLowerCase();
            if (word.length() <= 10) {
                wordList.add(word);
            } else {
                System.out.println("Each word should be max 10 letters. This word will not be used");
            }

        }


        int value = 0;
        Map<String, Integer> map = new HashMap<>();

        for (String s : wordList) {
            int totalValue = 0;
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case 'q':
                    case 'z':
                        value = 10;
                        break;
                    case 'j':
                    case 'x':
                        value = 8;
                        break;
                    case 'k':
                        value = 5;
                        break;
                    case 'f':
                    case 'h':
                    case 'v':
                    case 'w':
                    case 'y':
                        value = 4;
                        break;
                    case 'b':
                    case 'c':
                    case 'm':
                    case 'p':
                        value = 3;
                        break;
                    case 'd':
                    case 'g':
                        value = 2;
                        break;
                    case 'e':
                    case 'a':
                    case 'i':
                    case 'o':
                    case 'n':
                    case 'r':
                    case 't':
                    case 'l':
                    case 's':
                    case 'u':
                        value = 1;
                        break;
                    default:
                        value = 0;
                }

                totalValue += value;

            }

            //System.out.println("Total value of word "+s+" is "+totalValue);
            map.put(s, totalValue);


        }

        System.out.println(map);

        String maxValue = Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
        System.out.println(maxValue);

    }
}
