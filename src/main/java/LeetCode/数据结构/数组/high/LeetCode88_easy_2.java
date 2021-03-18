package LeetCode.数据结构.数组.high;

/**
 * Created by wxg on 2021/3/18.
 */
public class LeetCode88_easy_2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1=0;
        int index2=0;
        int index=0;
        int[] array=new int[m+n];
        while(index1<m||index2<n){
            if(index1==m){
                array[index++]=nums2[index2++];
            }else if(index2==n){
                array[index++]=nums1[index1++];
            }else if(nums1[index1]<nums2[index2]){
                array[index++]=nums1[index1++];
            }else{
                array[index++]=nums2[index2++];
            }
        }
        for(int i=0;i<array.length;i++){
            nums1[i]=array[i];
        }
    }
}
