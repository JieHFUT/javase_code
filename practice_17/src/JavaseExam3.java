/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-29
 * Time: 7:26
 */

/**
 * 合并两个整数数组并且数值升序
 * 【1，4，5，3】 【4，6，3】 ---> 【1、2、3、4、4、5、6】
 */


public class JavaseExam3 {

    public static void merge(int A[], int m, int B[], int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        //先保证两个数组当中都有数据,才能让i下标和j下标进行比较
        while(i >= 0 && j >= 0) {
            if(A[i] >= B[j]) {
                A[k] = A[i];
                k--;
                i--;
            }else {
                A[k] = B[j];
                j--;
                k--;
            }
        }
        //B数组走完了，但是A数组还有数据
        while (i >= 0) {
            A[k] = A[i];
            k--;
            i--;
        }
        //A数组走完了，但是B数组还有数据
        while (j >= 0) {
            A[k] = B[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {

    }

}
