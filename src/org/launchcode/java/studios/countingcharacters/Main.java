package org.launchcode.java.studios.countingcharacters;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        characterCountersStudio myCharacter = new characterCountersStudio();

        String userInput = myCharacter.getTextFromFile("/Users/vijayalakshmi/IdeaProjects/java-web-dev-exercises/src/org/launchcode/java/studios/countingcharacters/textFile.txt");
        myCharacter.characterCount(userInput);

    }
}
