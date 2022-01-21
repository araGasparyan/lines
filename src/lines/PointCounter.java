/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lines;

/**
 *
 * @author Ara Gasparyan
 */
public class PointCounter {

    /** 
    * if we need to have objects of pointCounter
    *
  
    The sum of points og gamer
    private int sumpoint;
    
    n is the dim of matrix and m is the number of point types (number of colors in Lines)
    private int n,m;
    
    Which positions method pointCounter have to look
    private int [][] look;
    
    How should the method pointCounter calculate the points
    private int [][] points;
     */
    public static int pointCounter(int[][] look, int[][] points, int m) {
        int sumpoint = 0;
        for (int k = 1; k <= m; k++) {
            for (int i = 0; i < look.length; i++) {
                for (int j = 0; j < look.length; j++) {
                    if ((look[i][j] == -1) && (points[i][j] == k)) {
                        sumpoint += (k * 10);
                    }
                }
            }
        }
        return sumpoint;

    }

}
