package dataStructure.array;

public class ArrayTest {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int total = 0;
        for (int i=0, num = 1; i<10 ; i++){
            arr[i] = num++;
        }
        //향상된 for문
        for (int num : arr){
            total += num;
        }
        System.out.println(total);
    }
}
