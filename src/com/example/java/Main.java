package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Colour colour = new Colour("red", "green", " violet", "indigo", "","", "","","","");

        String[] inputs = new String[4];
        for(int i = 0;i < 4;i++) {


            Scanner scanner = new Scanner(System.in);

            inputs[i] = scanner.nextLine();
        }


        ConcreteCodeMaker concreteCodeMaker = new ConcreteCodeMaker("red", "green", "violet", "indigo");
        ConcreteCodeBreaker concreteCodeBreaker = new ConcreteCodeBreaker(concreteCodeMaker);
        concreteCodeBreaker.OneChance(inputs[0],inputs[1],inputs[2],inputs[3], concreteCodeMaker);
    }
}
