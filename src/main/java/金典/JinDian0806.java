package 金典;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxg on 2021/1/12.
 */
//面试题 08.06. 汉诺塔问题
public class JinDian0806 {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        listA.add(0);
        listA.add(1);
        listA.add(2);
        listA.add(3);
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();
        JinDian0806 jinDian0806 = new JinDian0806();
        jinDian0806.hanota(listA, listB, listC);
        System.out.println(new Gson().toJson(listC));
    }

    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        //得到盘子总数
        int n = A.size();
        func(n, A, B, C);
    }

    public void func(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (n == 1) {
            C.add(A.remove(A.size() - 1));
            return;
        }

        func(n - 1, A, C, B);
        C.add(A.remove(A.size() - 1));
        func(n - 1, B, A, C);
    }
}
