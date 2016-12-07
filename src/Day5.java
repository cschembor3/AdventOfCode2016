/**
 * Created by Connor on 12/5/2016.
 */

import java.io.CharArrayReader;
import java.io.IOException;
import java.security.*;
import org.apache.commons.codec.digest.DigestUtils;

public class Day5 {

    public static void main(String... args) throws IOException, NoSuchAlgorithmException {
        System.out.println(getPassword("abbhdwsy"));
    }

    public static String getPassword(String input) throws IOException, NoSuchAlgorithmException {
        String password = "";
        Character[] pwd = new Character[8];
        String newInput = input;
        int counter = 0;
        int loopCounter = 0;
        while (loopCounter < 8) {
            boolean found = false;
            while (!found) {
                newInput = input + counter;
                String a = DigestUtils.md5Hex(newInput);
                if (a.substring(0,5).equals("00000")) {
                    //password += a.charAt(5);
                    int position = Character.getNumericValue(a.charAt(5));
                    char letter = a.charAt(6);
                    if (position < pwd.length && pwd[position] == null) {
                        System.out.println("position: " + position + " letter: " + letter);
                        pwd[position] = letter;
                        found = true;
                    }
                }
                counter++;
            }
            loopCounter++;
        }
        for (char a : pwd) {
            password += a;
        }
        return password;
    }
}
