class CS3310Project2 {

    public static int[] dijkstras(int[][]graph,int nodes){

        //Starting node
        int currentNode = 0;

        //Initalizing the solution array that we will return and setting it to zero
        int distance[] = new int[nodes];
        for(int i=0; i < distance.length; i++){
            distance[i] = 0;
        }

        //Initalizing previous array
        int previous[] = new int[nodes];

        //Initalizing the array that checks if a node has been checked
        boolean beenChecked[] = new boolean[nodes];
        beenChecked[0] = true;
        for(int i=1; i < beenChecked.length; i++){
            beenChecked[i] = false;
        }

        //Variable to hold the next node
        int nextNode = 0;

        //Initializing the number to find the smallest number
        int smallestNumero = -2;

        //Flag to check if it went through one time
        while(allTrue(beenChecked) == false){
            for(int i = 0; i < nodes; i++){
                if(graph[currentNode][i] != -1  && beenChecked[i] == false){

                    if ((distance[i] > distance[currentNode] + graph[currentNode][i] || distance[i] == 0)){
                        distance[i] = distance[currentNode] + graph[currentNode][i];
                        previous[i] = currentNode;

                    }

                }

                //Setting the smallest number to find the next node to go to
                if (smallestNumero == -2 && distance[i] != 0 && beenChecked[i] == false){
                    smallestNumero = distance[i];
                    nextNode = i;
                }
                else if (smallestNumero > distance[i] && distance[i] != 0 && beenChecked[i] == false){
                    smallestNumero = distance[i];
                    nextNode = i;
                }  

            }
            //Restting the smallest number, checking the node off as true and setting the current node as the next node
            smallestNumero = -2;
            beenChecked[nextNode] = true;
            currentNode = nextNode;
        }

        return distance;

    }

    public static int[][] floydWarshall(int[][]graph,int nodes){

        //Initializing the solution graph
        int[][] solution = graph;

        //Theres a bug with infinity so we have to add all the numbers together and subtract from infinity to represent infinity
        int highestNumber = 0;


        //Adding all the numbers of the original graph together
        for(int i=0; i < solution.length; i++){

            for(int j=0; j < solution.length; j++){ 

                highestNumber += solution[i][j];
            
            }
    
        }

        //We previously represented -1 as infinity so now we must use infinity
        for(int i=0; i < solution.length; i++){

            for(int j=0; j < solution.length; j++){ 

                if(graph[i][j] == -1){

                    solution[i][j] = Integer.MAX_VALUE-highestNumber;

                }
            }
    
        }

        //Main Algorithm
        for(int k = 0; k < nodes; k++){

            for(int u = 0; u < nodes; u++){

                for(int v = 0; v < nodes; v++){

                        solution[u][v] = Math.min(solution[u][v],solution[u][k] + solution[k][v]);
                    
                }
            
            }

        }

        return solution;
        
    }

    //Helper method to determine if we are finished
    public static boolean allTrue(boolean[] array){
        for(int i = 0; i < array.length; i++){
            if (array[i] == false){
                return false;
            }
        }
        return true;
    }

    //Helper method to print Djisktra's
    public static void printDj(int[] array){

        System.out.print("[ ");

        for(int i = 0; i < array.length; i++){

          System.out.print(array[i] + " ");

        }

        System.out.print("]");
    
    }

    //Helper method to print Floyd-Warshell
    public static void printFw(int[][] array){


        for(int i = 0; i < array.length; i++){
            
            System.out.print("[");

            for(int j = 0; j < array.length; j++){

                System.out.print(array[i][j] + " ");

            }

            System.out.print("]\n");

        }
    
    }

    //Helper method to create large matrices
    public static int[][] matrixMaker(int[][] array){

        int nodes = array[0].length;
        int counter = 0;

        for(int i = 0; i < nodes; i++){

            for(int j = 0; j < nodes; j++){
                
                array[i][j] = counter;
                counter += 1;

            }

        }

        return array;

    }
}