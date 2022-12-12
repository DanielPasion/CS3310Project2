public class CS3310Project2TestCases extends CS3310Project2 {

    public static void main(String[] args){

        //Test Cases to go over
        //0.
        //1. Graphs of Size 10 -> However my computer can handle (dense)
        //2. Graphs of Size 10 -> However my computer can handle (sparse)


        //Sanity Check - Using Homework 3's Graph for djikstra and https://www.youtube.com/watch?v=oNI0rf2P9gE&t=608s example graph for Floyd-Warashall

        //Djikstra (Its a little different because S is in the first column and row instead of the last)
        int dijkstrasTest[][] = {{0,3,-1,2,-1,-1,6},
                                {5,0,6,-1,1,-1,-1},
                                {-1,-1,0,-1,-1,1,-1},
                                {-1,2,-1,0,3,-1,-1},
                                {-1,-1,-1,-1,0,4,-1},
                                {-1,-1,-1,-1,-1,0,-1},
                                {-1,-1,-1,-1,-1,2,0}};
        int dijkstrasSolution[] = {0,3,9,2,4,8,6};

        System.out.println("Sanity Check Graph for Djikstra: Original Graph");
        print2dArray(dijkstrasTest);
        System.out.println("\nExpected graph:");
        printArray(dijkstrasSolution);
        System.out.println("\nOur Algorithm's result: ");
        printArray(dijkstras(dijkstrasTest));
        System.out.println("\n\n");

        //Floyd-Warshall
        int floydWarshallTest[][] = {{0,3,-1,7},
                                     {8,0,2,-1},
                                     {5,-1,0,1},
                                     {2,-1,-1,0}};
        int floydWarshallSolution[][] = {{0,3,5,6},
                                        {5,0,2,3},
                                        {3,6,0,1},
                                        {2,5,7,0}};
;
        System.out.println("Sanity Check Graph for floydWarshall: Original Graph");
        print2dArray(floydWarshallTest);
        System.out.println("\nExpected graph:");
        print2dArray(floydWarshallSolution);
        System.out.println("\nOur Algorithm's result: ");
        print2dArray(floydWarshall(floydWarshallTest));
        System.out.println("\n\n");
    
        //1.Testing Dense
        System.out.println("Testing Dense Graphs:\n\n\n");

        //n=10
        System.out.println("Test cases for graph size n = 10");
        int[][] graphSize10 = new int[10][10];
        matrixMaker(graphSize10);
        long startTime = System.nanoTime();
        dijkstras(graphSize10);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Graph Size 10 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize10);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 10 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=50
        System.out.println("Test cases for graph size n = 50");
        int[][] graphSize50 = new int[50][50];
        matrixMaker(graphSize50);
        startTime = System.nanoTime();
        dijkstras(graphSize50);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 50 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize50);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 50 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=100
        System.out.println("Test cases for graph size n = 100");
        int[][] graphSize100 = new int[100][100];
        matrixMaker(graphSize100);
        startTime = System.nanoTime();
        dijkstras(graphSize100);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 100 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize100);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 100 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=200
        System.out.println("Test cases for graph size n = 200");
        int[][] graphSize200 = new int[200][200];
        matrixMaker(graphSize200);
        startTime = System.nanoTime();
        dijkstras(graphSize200);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 200 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize200);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 200 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=400
        System.out.println("Test cases for graph size n = 400");
        int[][] graphSize400 = new int[400][400];
        matrixMaker(graphSize400);
        startTime = System.nanoTime();
        dijkstras(graphSize400);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 400 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize400);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 400 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=800
        System.out.println("Test cases for graph size n = 800");
        int[][] graphSize800 = new int[800][800];
        matrixMaker(graphSize800);
        startTime = System.nanoTime();
        dijkstras(graphSize800);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 800 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize800);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 800 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=1600
        System.out.println("Test cases for graph size n = 1600");
        int[][] graphSize1600 = new int[1600][1600];
        matrixMaker(graphSize1600);
        startTime = System.nanoTime();
        dijkstras(graphSize1600);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 1600 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize1600);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 1600 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=3200
        System.out.println("Test cases for graph size n = 3200");
        int[][] graphSize3200 = new int[3200][3200];
        matrixMaker(graphSize3200);
        startTime = System.nanoTime();
        dijkstras(graphSize3200);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 3200 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize3200);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 3200 took " + duration + " nanoseconds for Floyd-Warshall\n\n\n\n");

        //Testing Sparse
        System.out.println("Will now test sparse Graphs");

        //n=10
        System.out.println("Test cases for graph size n = 10");
        int[][] graphSize10Sparse = new int[10][10];
        matrixMakerSparse(graphSize10Sparse);
        startTime = System.nanoTime();
        dijkstras(graphSize10Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 10 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize10Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 10 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=50
        System.out.println("Test cases for graph size n = 50");
        int[][] graphSize50Sparse = new int[50][50];
        matrixMakerSparse(graphSize50Sparse);
        startTime = System.nanoTime();
        dijkstras(graphSize50Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 50 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize50Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 50 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=100
        System.out.println("Test cases for graph size n = 100");
        int[][] graphSize100Sparse = new int[100][100];
        matrixMakerSparse(graphSize100Sparse);
        startTime = System.nanoTime();
        dijkstras(graphSize100Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 100 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize100Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 100 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=200
        System.out.println("Test cases for graph size n = 200");
        int[][] graphSize200Sparse = new int[200][200];
        matrixMakerSparse(graphSize200Sparse);
        startTime = System.nanoTime();
        dijkstras(graphSize200Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 200 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize200Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 200 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=400
        System.out.println("Test cases for graph size n = 400");
        int[][] graphSize400Sparse = new int[400][400];
        matrixMakerSparse(graphSize400Sparse);
        startTime = System.nanoTime();
        dijkstras(graphSize400Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 400 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize400Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 400 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=800
        System.out.println("Test cases for graph size n = 800");
        int[][] graphSize800Sparse = new int[800][800];
        matrixMakerSparse(graphSize800Sparse);
        startTime = System.nanoTime();
        dijkstras(graphSize800Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 800 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize800Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 800 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=1600
        System.out.println("Test cases for graph size n = 1600");
        int[][] graphSize1600Sparse = new int[1600][1600];
        matrixMakerSparse(graphSize1600Sparse);
        startTime = System.nanoTime();
        dijkstras(graphSize1600Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 1600 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize1600Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 1600 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //n=3200
        System.out.println("Test cases for graph size n = 3200");
        int[][] graphSize3200Sparse = new int[3200][3200];
        matrixMakerSparse(graphSize3200Sparse);
        startTime = System.nanoTime();
        dijkstras(graphSize3200Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 3200 took " + duration + " nanoseconds for Djisktra");

        startTime = System.nanoTime();
        floydWarshall(graphSize3200Sparse);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Graph Size 3200 took " + duration + " nanoseconds for Floyd-Warshall\n\n");

        //Completed
        System.out.println("Test Completed");



    }

}