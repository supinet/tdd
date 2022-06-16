package com.tdd;

import org.junit.Assert;
import org.junit.Test;


public class AppTest {

    @Test
    public void shouldReverseWord() {
        String word = "Fernando Luis Supi";
        String reversedWord = "";
        String[] words = word.split("\\s");
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reversedWord += sb.toString() + " ";
        }
        Assert.assertEquals("odnanreF siuL ipuS ", reversedWord);
    }

    @Test
    public void isAPalindrome() {
        String[] words = {"nitin", "jnitn"};

        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            String reverse = sb.reverse().toString();
            if (reverse.equalsIgnoreCase(w)) {
                Assert.assertTrue(true);
            } else {
                Assert.assertFalse(false);
            }
        }
    }

    @Test
    public void longestCommonPrefix() {
        final String[] letters = {"flower", "flow", "flight"};
        String prefix = letters[0];
        for (int i = 1; i < letters.length; i++) {
            System.out.println("prefix -> " + prefix);
            while (letters[i].indexOf(prefix) != 0) {
                System.out.println("lettters[" + i + "]" + "indexOf(" + prefix + ")");
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println("prefix.substring(" + 0 + ", " + "prefix.length()" + prefix.length() + "-1");
                System.out.println("prefix -> " + prefix);
                if (prefix.isEmpty()) prefix = "";
            }
        }
        Assert.assertEquals("fl", prefix);
    }
}
