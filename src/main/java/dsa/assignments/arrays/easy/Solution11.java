package dsa.assignments.arrays.easy;

import java.util.ArrayList;
import java.util.List;
    /*      1773. Count Items Matching a Rule
            link:https://leetcode.com/problems/count-items-matching-a-rule/description/
            You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item.
            You are also given a rule represented by two strings, ruleKey and ruleValue.
            The ith item is said to match the rule if one of the following is true:
            ruleKey == "type" and ruleValue == typei.
            ruleKey == "color" and ruleValue == colori.
            ruleKey == "name" and ruleValue == namei.
            Return the number of items that match the given rule.
     */
public class Solution11 {
    public static void main(String[] args) {
       List<List<String>> items = new ArrayList<>();
               List<String> item=new ArrayList<>();
               item.add("phone");
               item.add("blue");
               item.add("pixel");
       items.add(item);
                item.clear();
                item.add("computer");
                item.add("silver");
                item.add("lenovo");
       items.add(item);
                item.clear();
                item.add("phone");
                item.add("gold");
                item.add("iphone");
       items.add(item);
       String ruleKey = "color", ruleValue = "silver";
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx= (ruleKey.equals("type"))?0:((ruleKey.equals("color"))?1:2);
        int count=0;
        for(List<String> item:items){
            if(item.get(idx).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
