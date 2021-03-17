package LeetCode.数据结构.字符串.high;

import java.util.HashSet;

/**
 * Created by wxg on 2021/2/5.
 */
public class LeetCode459_easy_2 {

    public boolean repeatedSubstringPattern(String s) {
        int middle = s.length() / 2;
        for (int i = middle; i >= 1; i--) {
            if (s.length() % i == 0) {
                int size = 0;
                HashSet<String> set = new HashSet<>();
                while (size < s.length()) {
                    StringBuilder builder = new StringBuilder();
                    for (int j = size; j < size + i; j++) {
                        builder.append(s.charAt(j));
                    }
                    size = size + i;
                    set.add(builder.toString());
                }
                if (set.size() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean repeatedSubstringPattern2(String s) {
        for(int i=1;i<=s.length()/2;i++){
            if(s.length()%i==0){
                boolean result=true;
                for(int j=i;j<s.length();j++){
                    if(s.charAt(j)!=s.charAt(j-i)){
                        result=false;
                        break;
                    }
                }
                if(result){
                    return true;
                }
            }
        }
        return false;
    }
}
