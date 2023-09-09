package com.shafiq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        public static void main (String[]args) throws IOException
        {
            File f1 = new File("input.txt"); //Creation of File Descriptor for input file
            String[] words = null;    //Intialize the word Array
            FileReader fr = new FileReader(f1);    //Creation of File Reader object
            BufferedReader br = new BufferedReader(fr);   //Creation of BufferedReader object
            String s;
            int flag = 0;  //Intialize the flag variable
            while ((s = br.readLine()) != null) {
                words = s.split(" ");   //Split the word using space
                for (int i = 0; i < words.length; i++) {
                    for (int j = 0; j < words[i].length(); j++) {
                        char ch = words[i].charAt(j);   //Read the word char by char
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')   //Checking for vowels
                        {
                            flag = 1; //If vowels persent set flag as one
                        }
                        break;
                    }

                    if (flag == 1) {
                        System.out.println(words[i]);  //Print the vowels word

                        try {
                            FileWriter fw = new FileWriter("out.txt");
                            fw.write(words[i]);
                            fw.close();
                        } catch (Exception e) {
                            System.out.print("Error : " + e);
                        }
                    }
                    flag = 0;
                }
            }
        }
    }
}
