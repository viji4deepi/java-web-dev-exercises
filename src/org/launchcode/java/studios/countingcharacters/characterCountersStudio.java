package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class characterCountersStudio {

        public static void characterCount (String inputString) {
            //create a hash Map
            HashMap<Character,Integer> charCountMap = new HashMap<>();

            // convert the string to character
            char[] charactersInString = inputString.toUpperCase().toCharArray();
            for (var stringChar : charactersInString) {
                //  System.out.println(charString);
                if(Character.isLetter(stringChar) == false) {
                    continue;
                }

                if(charCountMap.containsKey(stringChar)) {
                    // If char is present in charCountMap,
                    // incrementing it's count by 1
                    charCountMap.put(stringChar,charCountMap.get(stringChar)+1);
                } else {
                    // If char is not present in charCountMap,
                    // putting this char to charCountMap with 1 as it's value
                    charCountMap.put(stringChar,1);
                }
            }

            //printing the charCountMap
            for(Map.Entry entry : charCountMap.entrySet()) {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }

        }

        public  String getTextFromFile(String pathToFile) {
            String content = "";
            try{
                content = new String(Files.readAllBytes(Paths.get(pathToFile)));
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            return content;
        }


    }



