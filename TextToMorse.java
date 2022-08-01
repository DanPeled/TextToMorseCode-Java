package com.company;
import java.util.Scanner;
public class TextToMorse{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String text = scan.next();//Grabs the text var from player input in console and creates the text var.
        System.out.println(toMorse(text));
    }
    public enum MorseChar{ //enum to hold characters and morse code.
        A(".- ", 'a'),
        B("-... ", 'b'),
        C("-.-. ", 'c'),
        D("-.. ", 'd'),
        E(". ", 'e'),
        F("..-. ", 'f'),
        G("--. ", 'g'),
        H(".... ", 'h'),
        I(".. ", 'i'),
        J(".--- ", 'j'),
        K("-.- ", 'k'),
        L(".-.. ", 'l'),
        M("-- ", 'm'),
        N("-. ", 'n'),
        O("--- ", 'o'),
        P(".--. ", 'p'),
        Q("--.- ", 'q'),
        R(".-. ", 'r'),
        S("... ", 's'),
        T("- ", 't'),
        U("..- ", 'u'),
        V("...- ", 'v'),
        W(".-- ", 'w'),
        X("-..- ", 'x'),
        Y("-.-- ", 'y'),
        Z("--.. ", 'z');
        private final String morseCode;//morse code translation var.
        private final char character;//english char var.
        private static final MorseChar[] allValues = values();
        MorseChar(String morseCode, char character){
            this.morseCode = morseCode;
            this.character = character;
        }
        public String getMorseCode(){
            return morseCode;
        }
        public char getCharacter(){
            return character;
        }
        public static MorseChar valueOf(char character) {
            for (MorseChar morseChar : allValues) {
                if (morseChar.getCharacter() == character) {
                    return morseChar;
                }
            }
            throw new RuntimeException("Morse character not found: " + character);
        }
    }
    public static String toMorse(String text) {
        String morseText = "";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            morseText += MorseChar.valueOf(text.charAt(i)).getMorseCode();
        }
        return morseText;
    }
}