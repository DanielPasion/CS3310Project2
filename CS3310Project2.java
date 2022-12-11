class CS33310Project2 {
    public static void main(String[] args) {
        int[][] testGraph = {{0,3,-1,2,-1,-1,6},
                             {5,0,6,-1,1,-1,-1},
                             {-1,-1,0,-1,-1,1,-1},
                             {-1,2,-1,0,3,-1,-1},
                             {-1,-1,-1,-1,0,4,-1},
                             {-1,-1,-1,-1,-1,0,-1},
                             {-1,-1,-1,-1,-1,2,0}};

        int[] solution = dijkstras(testGraph, 7);
        for(int i=0; i < solution.length; i++){
            System.out.println(solution[i]);
        } 
    }

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
            smallestNumero = -2;
            beenChecked[nextNode] = true;
            currentNode = nextNode;
        }

        return distance;

    }

    public static boolean allTrue(boolean[] array){
        for(int i = 0; i < array.length; i++){
            if (array[i] == false){
                return false;
            }
        }
        return true;
    }

    //public static int
}