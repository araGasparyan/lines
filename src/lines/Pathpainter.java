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
public class Pathpainter {

    /**
     * The matrix of shortest way beetwen two points The way is given as a
     * sequance of natural numbers 1,2,3, ... which are increas The matrix also
     * has -1 cells, which are busy initialy, -2 cells - the cells which are not
     * busy innitialy, they are percollated, but they are not a part of the
     * shortest way 0 cell - the cell from where the path is started
     */
    private static int shortestway[][];

    // the length of a shortest way
    private static int waylength;

    public static int getWaylength() {
        return waylength;
    }

    static int[][] finalshortestway(int[][] percolation, int hor, int ver) {
        shortestway = shortestway(percolation, hor, ver);
        int x = waylength;
        int tmphor = hor;
        int tmpver = ver;
        do {
            for (int i = 0; i < percolation.length; i++) {
                for (int j = 0; j < percolation.length; j++) {
                    if ((shortestway[i][j] == x) && !((i == tmphor) && (j == tmpver))) {
                        shortestway[i][j] = -3;
                    }
                }
            }

            if ((tmphor > 0) && (shortestway[tmphor - 1][tmpver] == x - 1)) {
                tmphor--;
            } else if ((tmphor < percolation.length - 1) && (shortestway[tmphor + 1][tmpver] == x - 1)) {
                tmphor++;
            } else if ((tmpver > 0) && (shortestway[tmphor][tmpver - 1] == x - 1)) {
                tmpver--;
            } else if ((tmpver < percolation.length - 1) && (shortestway[tmphor][tmpver + 1] == x - 1)) {
                tmpver++;
            }

            x--;

        } while (x >= 0);

        return shortestway;
    }

    static int[][] shortestway(int[][] percolation, int hor, int ver) {
        int starthor = 0, startver = 0;
        int shortestway[][];
        shortestway = new int[percolation.length][percolation.length];

        for (int i = 0; i < percolation.length; i++) {
            for (int j = 0; j < percolation.length; j++) {
                if (percolation[i][j] == 0) {
                    shortestway[i][j] = -1;
                } else if (percolation[i][j] == 1) {
                    starthor = i;
                    startver = j;
                    shortestway[i][j] = 0;
                } else if (percolation[i][j] == 2) {
                    shortestway[i][j] = -2;
                }
            }
        }

        if (shortestway[hor][ver] == -1) {
            System.out.println("It is not possible to go there");
            return null;
        }

        if (shortestway[hor][ver] == 0) {
            System.out.println("You can not go from your place to your place!!!");
            return null;
        }

        if (shortestway[hor][ver] == -2) {

            if ((starthor > 0) && ((shortestway[starthor - 1][startver] == -2))) {
                shortestway[starthor - 1][startver] = 1;
            }
            if ((starthor < percolation.length - 1) && (shortestway[starthor + 1][startver] == -2)) {
                shortestway[starthor + 1][startver] = 1;
            }
            if ((startver > 0) && (shortestway[starthor][startver - 1] == -2)) {
                shortestway[starthor][startver - 1] = 1;
            }
            if ((startver < percolation.length - 1) && (shortestway[starthor][startver + 1] == -2)) {
                shortestway[starthor][startver + 1] = 1;
            }

            int k;

            for (k = 1;; k++) {
                if (shortestway[hor][ver] > 0) {
                    waylength = k;
                    return shortestway;
                }
                for (int i = 0; i < percolation.length; i++) {
                    for (int j = 0; j < percolation.length; j++) {
                        if (shortestway[i][j] == k) {
                            if ((i > 0) && (shortestway[i - 1][j] == -2)) {
                                shortestway[i - 1][j] = k + 1;
                            }

                            if ((i < percolation.length - 1) && (shortestway[i + 1][j] == -2)) {
                                shortestway[i + 1][j] = k + 1;
                            }

                            if ((j > 0) && (shortestway[i][j - 1] == -2)) {
                                shortestway[i][j - 1] = k + 1;
                            }

                            if ((j < percolation.length - 1) && (shortestway[i][j + 1] == -2)) {
                                shortestway[i][j + 1] = k + 1;
                            }
                        }
                    }
                }
            }
        }

        return null;
    }

}
