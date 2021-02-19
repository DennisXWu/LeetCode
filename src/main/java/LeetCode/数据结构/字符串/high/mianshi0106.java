package LeetCode.数据结构.字符串.high;

/**
 * Created by wxg on 2021/2/3.
 */
public class mianshi0106 {
    public String compressString(String S) {
        int l=0;
        int r=0;
        int count=1;
        StringBuilder builder=new StringBuilder();
        while(l<=r&&r<S.length()){
            r++;
            if(r<S.length()&&S.charAt(r)==S.charAt(l)){
                count++;
            }else{
                builder.append(S.charAt(l));
                builder.append(count);
                count=1;
                l=r;
            }
        }
        if(builder.toString().length()>=S.length()){
            return S;
        }else{
            return builder.toString();
        }
    }
}
