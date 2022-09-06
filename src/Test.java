import java.security.SecureRandom;

public class Test {
    public static void main(String[] args) {

        SecureRandom oRand = new SecureRandom();
        oRand.setSeed(100);
        int iRandNum = oRand.nextInt();
        System.out.println("rand num: " + iRandNum);
        int iRandNum2 = oRand.nextInt();
        System.out.println("rand num: " + iRandNum2);

        Test oTest = new Test();
        //oTest.runTest1();

        oTest.runTest2();

    }

    public void runTest1(){

        int[][] aiGrid = new int[10][8];
        SecureRandom oRand = new SecureRandom();

        //create nested loop to create game grid.

        for(int y=0; y< aiGrid.length; y++){
            for(int x=0; x < aiGrid[y].length; x++){
                aiGrid[y][x] = oRand.nextInt(2);
                System.out.print(aiGrid[y][x] + "  ");
            }
            System.out.println();
        }
    }
    public void runTest2(){
        int[][] aiGrid = new int[10][8];
        SecureRandom oRand = new SecureRandom();
        int iWallChance = 10;
        int iTempNum;

        //create nested loop to create game grid.

        for(int y=0; y< aiGrid.length; y++){
            for(int x=0; x < aiGrid[y].length; x++){

                iTempNum = oRand.nextInt(100);

                //use wall chance to decide whether wall or path here.

                if(iTempNum < iWallChance) {
                    aiGrid[y][x] = 1;
                }
                else {
                    aiGrid[y][x] = 0;
                }

                //aiGrid[y][x] = oRand.nextInt(2);
                System.out.print(aiGrid[y][x] + "  ");
            }
            System.out.println();
        }

    }
}
