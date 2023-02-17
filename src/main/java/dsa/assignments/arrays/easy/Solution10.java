package dsa.assignments.arrays.easy;

import java.util.HashSet;
import java.util.Set;

/*      1832. Check if the Sentence Is Pangram
            link:https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
            A pangram is a sentence where every letter of the English alphabet appears at least once.
            Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.*/
public class Solution10 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        char[] cArr=sentence.toCharArray();
        int[] iArr=new int[26];
        if(cArr.length<26){
            return false;
        }
        for(char item: cArr) {
            int index=item-97;
            iArr[index]++;
        }
        for(int item:iArr){
            if(item==0){
                return false;
            }
        }
        return true;
    }
        public static boolean checkIfPangram2(String sentence) {
            Set<Character> characterSet=new HashSet<>();
            for(int i=0;i<sentence.length();i++){
                characterSet.add(sentence.charAt(i));
            }
            return characterSet.size()==26;
        }
}
