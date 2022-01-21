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
public class Setter {

    private int n;
    // count of non-empty fields
    private int busy = 0;
    private int board[][];
    private int cboard[][];

    // The matrix is the cboard matrix before changing cboard by method dissapear
    private int cboardbefore[][];

    // The matrix od 0, 1, and 2 -s, it describes all possible paths 
    // starting from 1, all this paths are filled with 2-s and 0-s are
    // those cells of percolation which are not achived (coverd)
    private int[][] percolation;

    public int[][] getPercolation() {
        return percolation;
    }

    public void setPercolation(int[][] percolation) {
        this.percolation = percolation;
    }

    public int[][] getCboardbefore() {
        return cboardbefore;
    }

    public void setCboardbefore(int[][] cboardbefore) {
        this.cboardbefore = cboardbefore;
    }
    private boolean way;
    private boolean dissapear = false;

    // Matrix of cells which have to dissapear
    private int diss[][];

    public int[][] getDiss() {
        return diss;
    }

    public void setDiss(int[][] diss) {
        this.diss = diss;
    }

    public boolean isDissapear() {
        return dissapear;
    }

    public void setDissapear(boolean dissapear) {
        this.dissapear = dissapear;
    }

    public boolean isWay() {
        return way;
    }

    public void setWay(boolean way) {
        this.way = way;
    }

    public int getBusy() {
        return busy;
    }

    public void setBusy(int busy) {
        this.busy = busy;
    }

    public int[][] getCboard() {
        return cboard;
    }

    public void setCboard(int[][] cboard) {
        this.cboard = cboard;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int board[][]) {
        this.board = board;
    }

    public Setter() {

    }

    public Setter(int n) {
        this.n = n;
        diss = new int[n][n];
        cboard = new int[n][n];
        cboardbefore = new int[n][n];
    }

    // The method makes to dissapear balls with the same color, which are located to each
    // other by horizontal or vertical way. m is a count of the mentioned ball
    public void disappear(int m) {
        int tmp[][] = new int[n][n];

        //Disappear horizontal lines
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - m + 1; j++) {
                boolean btmp = true;

                for (int k = 1; k < m; k++) {

                    if ((cboard[i][j] > 0) && (cboard[i][j] == cboard[i][j + k])) {
                        btmp &= true;
                    } else {
                        btmp &= false;
                    }
                    if (!btmp) {
                        break;
                    }

                }

                if (btmp) {
                    for (int k = 0; k < m; k++) {
                        if (tmp[i][j + k] != -1) {
                            tmp[i][j + k] = -1;
                        }
                    }
                }

            }

        }

        // Disappear vertical lines
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - m + 1; j++) {
                boolean btmp = true;

                for (int k = 1; k < m; k++) {

                    if ((cboard[j][i] > 0) && (cboard[j][i] == cboard[j + k][i])) {
                        btmp &= true;
                    } else {
                        btmp &= false;
                    }
                    if (!btmp) {
                        break;
                    }

                }

                if (btmp) {
                    for (int k = 0; k < m; k++) {
                        if (tmp[j + k][i] != -1) {
                            tmp[j + k][i] = -1;
                        }
                    }
                }

            }

        }

        for (int i = 0; i < n - m + 1; i++) {

            for (int j = 0; j < n - m + 1; j++) {
                boolean btmp = true;

                for (int k = 1; k < m; k++) {

                    if ((cboard[i][j] > 0) && (cboard[i][j] == cboard[i + k][j + k])) {
                        btmp &= true;
                    } else {
                        btmp &= false;
                    }
                    if (!btmp) {
                        break;
                    }

                }

                if (btmp) {
                    for (int k = 0; k < m; k++) {
                        if (tmp[i + k][j + k] != -1) {
                            tmp[i + k][j + k] = -1;
                        }
                    }
                }

            }

        }

        for (int i = n - 1; i > m - 2; i--) {

            for (int j = 0; j < n - m + 1; j++) {
                boolean btmp = true;

                for (int k = 1; k < m; k++) {

                    if ((cboard[i][j] > 0) && (cboard[i][j] == cboard[i - k][j + k])) {
                        btmp &= true;
                    } else {
                        btmp &= false;
                    }
                    if (!btmp) {
                        break;
                    }

                }

                if (btmp) {
                    for (int k = 0; k < m; k++) {
                        if (tmp[i - k][j + k] != -1) {
                            tmp[i - k][j + k] = -1;
                        }
                    }
                }

            }

        }

        // Change the value of dissapear
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp += tmp[i][j];
            }
        }

        if (temp < 0) {
            setDissapear(true);
        } else {
            setDissapear(false);
        }

        // Give values to the matrix cboardbefore
        if (temp < 0) {
            cboardbefore = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (tmp[i][j] == -1) {

                        cboardbefore[i][j] = cboard[i][j];

                    } else {
                        cboardbefore[i][j] = 0;
                    }

                }
            }

        }

        // Change board and cboard
        int count = 0;

        if (temp < 0) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (tmp[i][j] == -1) {
                        board[i][j] = 0;
                        cboard[i][j] = 0;
                        count++;
                    }

                }
            }

        }

        /*
      for(int i=0; i<n; i++){
                      for(int j=0; j<n; j++){
                        System.out.print(board[i][j]);
                if ( j== n-1 ) System.out.println();}}
         */
        setDiss(tmp);
        setBusy(getBusy() - count);
    }

    // method fills those fields of board which are non-empty and do not have colors
    // method changes cboard. m - how many colors it is necessary to fill 
    public void randfixcolor(int m) {
        // int board[][]=new int[n][n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if ((this.board[i][j] == 1) && (cboard[i][j] == 0)) {
                    cboard[i][j] = (int) (1 + Math.random() * m);
                }

            }
        }
    }

    // method makes non-empty random m empty fields of board. 
    //(Count of non-empty fields) Busy are also changed
    public void randfix(int m) {

        int i, j;
        int count = 0;
        for (int k = 0;;) {
            i = (int) (Math.random() * n);
            j = (int) (Math.random() * n);
            if (board[i][j] == 0) {
                board[i][j] = 1;
                count++;
            }
            if ((count == m) || (count == n * n) || (getBusy() + count == n * n)) {
                break;
            }
        }

        setBusy(count + getBusy());

    }

    // method fills those fields of board which are non-empty and do not have colors
    // method changes cboard. m - how many colors it is necessary to fill 
    // DURING START
    public void randfixcolorstart(int m) {
        int board[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (this.board[i][j] == 1) {
                    board[i][j] = (int) (1 + Math.random() * m);
                }
            }
        }
        setCboard(board);
    }

    // The method creates 1-s with fixed count m and with random positions and 0-s with fixed count n^2-m
    // DURING START
    public void randfixstart(int m) {
        int board[][] = new int[n][n];
        int i, j;
        int count = 0;
        for (int k = 0;;) {
            i = (int) (Math.random() * n);
            j = (int) (Math.random() * n);
            if (board[i][j] == 0) {
                board[i][j] = 1;
                count++;
            }
            if ((count == m) || (count == n * n)) {
                break;
            }
        }
        setBoard(board);
        setBusy(count);
    }

    // Find way
    public void findway(int sh, int sv, int eh, int ev) {
        // A temporary matrix of possible ways
        int tmp[][] = new int[n][n];
        tmp[sh][sv] = 1;

        // Checks if board[sh][sv] is non-empty and does it have non-empty neighbours
        boolean btmp = true;
        boolean btmp1 = false;
        if (board[sh][sv] == 1) {
            btmp &= true;
        } else {
            btmp &= false;
        }
        if (btmp && (sh > 0) && ((board[sh - 1][sv] == 0))) {
            tmp[sh - 1][sv] = 2;
            btmp1 |= true;
        }
        if (btmp && (sh < n - 1) && (board[sh + 1][sv] == 0)) {
            tmp[sh + 1][sv] = 2;
            btmp1 |= true;
        }
        if (btmp && (sv > 0) && (board[sh][sv - 1] == 0)) {
            tmp[sh][sv - 1] = 2;
            btmp1 |= true;
        }
        if (btmp && (sv < n - 1) && (board[sh][sv + 1] == 0)) {
            tmp[sh][sv + 1] = 2;
            btmp1 |= true;
        }

        /*
       for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){ 
          System.out.print(tmp[i][j]);
                if ( j== n-1 ) System.out.println();
         }}
         */
        //fill the matrix tmp
        if (btmp && btmp1) {
            int count;

            do {
                count = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        if ((i > 0) && (board[i - 1][j] == 0) && (tmp[i][j] == 2)) {
                            if (tmp[i - 1][j] != 2) {
                                tmp[i - 1][j] = 2;
                                count++;
                            }
                        } //System.out.println("1st " +  i+ " " + " " + j +" " +count);}

                        if ((i < n - 1) && (board[i + 1][j] == 0) && (tmp[i][j] == 2)) {
                            if (tmp[i + 1][j] != 2) {
                                tmp[i + 1][j] = 2;
                                count++;
                            }
                        } //System.out.println("2st "+  i+ " " + " " + j +" " +count);}

                        if ((j > 0) && (board[i][j - 1] == 0) && (tmp[i][j] == 2)) {
                            if (tmp[i][j - 1] != 2) {
                                tmp[i][j - 1] = 2;
                                count++;
                            }
                        } //System.out.println("3st "+  i+ " " + " " + j +" " +count);}

                        if ((j < n - 1) && (board[i][j + 1] == 0) && (tmp[i][j] == 2)) {
                            if (tmp[i][j + 1] != 2) {
                                tmp[i][j + 1] = 2;
                                count++;
                            }
                        } //System.out.println("4st "+  i+ " " + " " + j +" " +count);}

                        //System.out.print(tmp[0][0]);
                    }
                }

            } while (count > 0);

        }

        /*      
  for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
        System.out.print(tmp[i][j]);
                if ( j== n-1 ) System.out.println();
         }}
         */
        //Checks if there is a way of board[sh][sv] to board[eh][ev]
        if (tmp[eh][ev] == 2) {
            setWay(true);
            percolation = tmp;
        } else {
            setWay(false);
        }

    }

    //method created 01 matrix   
    public void rand01() {
        int board[][] = new int[n][n];
        int k = 3, m;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m = (int) (Math.random() * k);
                if (m == 0) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }
            }
        }
        setBoard(board);

    }

    //method creates chess
    public void chess(int n) {
        int board[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }

                // System.out.print(board[i][j]);
                //if ( j== n-1 ) System.out.println();
            }
        }
        setBoard(board);
    }

}
