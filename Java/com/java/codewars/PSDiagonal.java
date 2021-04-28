package com.java.codewars;

public class PSDiagonal {

    public static String diagCompare(int [][] matrix) {
        for (int i = 0, c=1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++,c++) {
                matrix[i][j] += c;
            }
        }
        int s = 0;
        int p = 0;
        for(int i=0;i<matrix.length;i++) {
            p += matrix[i][i];
            s += matrix[i][matrix.length - i - 1];
        }
        return p==s?"Draw!":p>s?"Principal Diagonal win!":"Secondary Diagonal win!";

    }
    public static void main(String[] args) {
        int[][] data = new int[6][6];//{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}, {17,18,19,20}, {21,22,23,24}};
        System.out.println(diagCompare(data));
    }
}
