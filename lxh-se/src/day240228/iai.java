package day240228;

public class iai {
    public static void main(String[] args) {
        int[][] ia = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        for (int i = 0; i < ia.length; i++) {
            for (int j = 0; j < ia.length; j++) {
                System.out.print(ia[i][i]);
            }
        }
    }
}
/*i为外层循环 j为内层循环 打印i时，运行i外层循环，j作为循环数，i的每一次运算j都要重复三次，列如i=0，j重复循环三次，i=1，j重复循环三次，i=2,j重复循环三次
i=0时 运行{1, 2, 3}，j0 = 1，j为循环值内层循环1三次，结果为111,运行结束{1, 2, 3}数组，跳转到下一个{4, 5, 6}数组
i=1时 运行{4, 5, 6}，j1 = 5，j为循环值内层循环5三次，结果为555,运行结束{4, 5, 6}数组，跳转到下一个{7, 8, 9}数组
i=2时 运行{7, 8, 9}，j2 = 9, j为循环值内层循环9三次，结果为999,运行结束{7, 8, 9}数组，运行结束
最后结果为111555999
 */
