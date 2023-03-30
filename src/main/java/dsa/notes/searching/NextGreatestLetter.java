package dsa.notes.searching;
    /*
            744. Find Smallest Letter Greater Than Target744. Find Smallest Letter Greater Than Target
            ou are given an array of characters letters that is sorted in non-decreasing order,
            and a character target. There are at least two different characters in letters.
            Return the smallest character in letters that is lexicographically greater than target.
             If such a character does not exist, return the first character in letters.
    */
public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters,char target){
        int startIdx=0;
        int endIdx=letters.length-1;
        while(startIdx<=endIdx){
            int midIdx=startIdx+(endIdx-startIdx)/2;
            if(target<letters[midIdx]){
                endIdx=midIdx-1;
            }else{
                startIdx=midIdx+1;
            }
        }
        return letters[startIdx%letters.length];
    }
}
