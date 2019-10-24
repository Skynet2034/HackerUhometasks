package Rectangles;
public class Rectangles {
    public static int getRecCount(byte[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1)
                {
                    count++;
                    int m = i;
                    while ( m<arr.length && arr[m][j]>0) {
                        int k=j;
                        while (k<arr.length && arr[m][k]>0) {
                            arr[m][k] = 0;
                            k++;
                        }
                        m++;
                    }

                    }

                }

            }
           return count;
    }
    public static void main (String[]args){
        byte[][] a = {
                {1, 1, 0, 1},
                {1, 1, 0, 1},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };
        System.out.println(getRecCount(a));
    }
}
