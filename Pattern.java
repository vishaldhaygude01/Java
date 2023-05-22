package com;
public class Pattern {
    //PATTERN1
    static void Pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //PATTERN2
    static void Pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col = 1; col<= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    //PATTERN3
    static void Pattern3(int n){
        for(int row = 0; row < 2 * n; row++){
            int totalcolInrow = row > n ? 2 * n - row : row;
            for(int col = 0; col < totalcolInrow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //PATTERN4
    static void Pattern4(int n){
        for(int row = 0; row < 2 * n; row++){
            int totalcolInrow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalcolInrow;
            for(int s = 0; s < noOfSpaces; s++){
                System.out.print(" ");
            }
            for(int col = 0; col < totalcolInrow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //PATTERN5
    static void Pattern5(int n){
        for(int row = 1; row <= n; row++){
            for (int space = 0; space < n-row; space++){
                System.out.print(" ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern1(5);
        Pattern2(5);
        Pattern3(4);
        Pattern4(5);
        Pattern5(5);
    }
}
