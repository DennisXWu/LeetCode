package LeetCode.数据结构.哈希表;

/**
 * Created by wxg on 2021/1/26.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 *
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。杂志字符串中的每个字符只能在赎金信字符串中使用一次。)
 */
public class LeetCode383 {

    public static void main(String[] args) {
        LeetCode383 leetCode383 = new LeetCode383();
        System.out.println(leetCode383.canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }


    //用数组做hash
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] array = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            array[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (array[ransomNote.charAt(i) - 'a'] <= 0) {
                return false;
            }
            array[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }


    //暴力法
    public boolean canConstruct2(String ransomNote, String magazine) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();


        for (int i = 0; i < ransomNote.length(); i++) {
            map1.put(ransomNote.charAt(i), map1.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            map2.put(magazine.charAt(i), map2.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (!map2.containsKey(ransomNote.charAt(i)) || (map1.get(ransomNote.charAt(i)) > map2.get(ransomNote.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
