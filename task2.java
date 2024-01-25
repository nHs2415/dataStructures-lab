class MultyplyMatrix{
  public static void main(String[] args){
    int[][] matrixA = { {2,5,8},{4,8,3},{9,1,6} };
    int[][] matrixB = { {1,7,8},{6,4,5},{2,8,3} };
    int [][] result =new int[3][3];
   
    for (int i=0;i<3;i++){
      for (int j=0;j<3;j++){
        for(int k=0; k<3; k++){
          result[i][j]+=matrixA[i][k] * matrixB[k][j];
         
        }
     
         
      }
     
    }
   
   
      for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
          System.out.print(result[i][j]+" ");
        }
        System.out.println();
      }
    }

 
 

}
