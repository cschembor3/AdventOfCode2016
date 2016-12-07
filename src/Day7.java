import sun.misc.IOUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Connor on 12/7/2016.
 */
public class Day7 {

    public static void main(String... args) throws FileNotFoundException, IOException{
        File file = new File("C:\\Users\\Andy\\IdeaProjects\\AdventOfCode\\src\\Day7input.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            count += day7B(line);
        }
        System.out.println(count);
        reader.close();

        //System.out.println(day7B("aba[bab]xyz"));
    }


    private static int day7A(String input) {
        String[] sections = input.split("\\W");
        boolean inBrackets = false;
        int innerCount = 0;
        boolean isValid = true;
        for (String section : sections) {
            if (!inBrackets) {
                if (hasABBA(section)) {
                    innerCount++;
                }
            } else {
                if (hasABBA(section)) {
                    isValid = false;
                }
            }
            inBrackets = !inBrackets;
        }
        if (isValid && innerCount > 0)
            return 1;
        return 0;
    }

    private static int day7B(String line) {
        String[] sections = line.split("\\W");
        boolean inBrackets = false;
        int count = 0;
        ArrayList<String> babs = new ArrayList<>();
        ArrayList<String> abas = new ArrayList<>();
        for (String section : sections) {
            if (!inBrackets) {
                ArrayList<String> temp = getBABs(section, false);
                for (String s : temp) {
                    if (!babs.contains(s))
                        babs.add(s);
                }
            } else {
                ArrayList<String> temp2 = getBABs(section, true);
                for (String s : temp2) {
                    if (!abas.contains(s))
                        abas.add(s);
                }
            }
            inBrackets = !inBrackets;
        }
        for (String a : babs) {
            for (String b : abas) {
                if (a.equals(b)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    private static ArrayList<String> getBABs(String section, boolean inBrackets) {
        int front = 0;
        int back = 2;
        ArrayList<String> abas = new ArrayList<>();
        while (back <= section.length()-1) {
            if (section.charAt(front) == section.charAt(back)) {
                if (section.charAt(front+1) != section.charAt(front)) {
                    String bab = "";
                    if (!inBrackets) {
                        bab = "" + section.charAt(front + 1) + section.charAt(front) + section.charAt(front + 1);
                    } else {
                        bab = section.substring(front, back+1);
                    }
                    abas.add(bab);
                }
            }
            front++;
            back++;
        }
        return abas;
    }

    private static boolean hasABBA(String section) {
        int front = 0;
        int back = 3;
        while (back <= section.length()-1) {
            boolean foundMismatch = false;
            int front1 = front;
            int back1 = back;
            String temp = "";
            while (front1 < back1 && !foundMismatch) {
                if (section.charAt(front1) != section.charAt(back1)) {
                    foundMismatch = true;
                }
                if (temp.equals("" + section.charAt(front1))) {
                    foundMismatch = true;
                }
                temp += section.charAt(front1);
                front1++;
                back1--;
            }
            if (!foundMismatch)
                return true;
            front++;
            back++;
        }
        return false;
    }
}