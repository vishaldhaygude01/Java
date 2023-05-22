package com;
import java.util.Arrays;
/*class Students{
    public int roll_no;
    public String name;
    Students(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}*/
public class Array {
    public static void main(String[] args) {
       /* Students[] arr;
        arr = new Students[5];
        arr[0] = new Students(1,"Vishal");
        arr[1] = new Students(2,"Omkar");
        arr[2] = new Students(3,"Utkarsh");
        arr[3] = new Students(4,"Pratik");
        arr[4] = new Students(5,"Rohit");
        for(int i=0;i<arr.length;i++){
            System.out.println("Element at " + i + " : " + arr[i].roll_no + " "+ arr[i].name);
*/
       /*int arr[][] = {{2,3,4},{5,6,7},{8,9,1}};
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++)
               System.out.print(arr[i][j] + " ");
           System.out.println();
           }

*/
   /* int intArr[] = {10,20,30,40,50};
    Arrays.sort(intArr);
    int intKey = 30;
        System.out.println(intKey+"present at index = " + Arrays.binarySearch(intArr,intKey));
        */
    int intArr[][] = {{1,2,3,4,5}};
        System.out.println("Integer Arrays: "+ Arrays.deepHashCode(intArr));
    }
}
