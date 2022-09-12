import java.security.SecureRandom;

public class GameGrid_Test {
    public static void main(String[] args) {
        GameGrid GameGrid1 = new GameGrid();
        GameGrid1.run();

    }
}




import java.security.SecureRandom;
import java.util.Scanner;

public class GameGrid {
//    public static void main(String[] args) {
//        SecureRandom oRand = new SecureRandom();
//        oRand.setSeed(100);
//        int iRandNum = oRand.nextInt();
//        System.out.println("rand num: " + iRandNum);
//        int iRandNum2 = oRand.nextInt();
//        System.out.println("rand num: " + iRandNum2);
//
//        GameGrid oGameGrid = new GameGrid();
//        // oGameGrid.runGameGrid1();
//
//        oGameGrid.runGameGrid2();
//    }
    public void run() {
        Scanner scnr = new Scanner(System.in);
        int[][] aiGrid = new int[10][10];
        SecureRandom oRand = new SecureRandom();
        int iWallChance = 30;
        int iTempNum;
        //create nested loop to create game grid.

        for (int y = 0; y < aiGrid.length; y++) {
            for (int x = 0; x < aiGrid[y].length; x++) {

                iTempNum = oRand.nextInt(100);

                //use wall chance to decide whether wall or path here.

                if (iTempNum < iWallChance) {
                    aiGrid[y][x] = 1;
                } else {
                    aiGrid[y][x] = 0;
                }
                //aiGrid[y][x] = oRand.nextInt(2);

                System.out.print(aiGrid[y][x] + "  ");
            }
            System.out.println();
        }
        aiGrid[0][0] = 0;
        int iUserRow = 0;
        int iUserCol = 0;
        boolean exit = false;
        String userInput = null;

        while (exit == false) {
            System.out.println("Do you want to move down or right?");
            userInput = scnr.nextLine();

            if (userInput.equals("down")) {
                iUserRow++;
                if (aiGrid[iUserRow][iUserCol] == 1) {
                    System.out.println("You failed");
                    exit = true;
                } else if (iUserRow == 9) {
                    System.out.println("You win!");
                    exit = true;
                }
            }

            if (userInput.equals("right")) {
                iUserCol++;
                if (aiGrid[iUserRow][iUserCol] == 1) {
                    System.out.println("You failed");
                    exit = true;
                } else if (iUserCol == 9) {
                    System.out.println("You win!");
                    exit = true;
                }
            }
        }
        for (int y = 0; y < aiGrid.length; y++) {
            for (int x = 0; x < aiGrid[y].length; x++) {

                iTempNum = oRand.nextInt(100);

                //use wall chance to decide whether wall or path here.

                if (iTempNum < iWallChance) {
                    aiGrid[y][x] = 1;
                } else {
                    aiGrid[y][x] = 0;
                }
                //aiGrid[y][x] = oRand.nextInt(2);

                System.out.print(aiGrid[y][x] + "  ");
            }
            System.out.println();
        }
            }
        }
    }
}
