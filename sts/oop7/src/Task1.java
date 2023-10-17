import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] a={2,9,8,31};
        Task1 task1=new Task1();
        task1.sortIntArray(a);

        for (int K : a){
            System.out.print(" "+K);
        }
        //sortString
        System.out.println();
        String[] strArr={"Harry","Hermine","Draco","Ginny","Albus"};
        task1.sortStringArray(strArr);


        for (String p: strArr){
            System.out.print("\t"+p);
        }

        //printGrid
        System.out.println();
        task1.printGrid();

        //isAvailable
        System.out.println();
        Scanner scanner=new Scanner(System.in);
        System.out.print("\nEnter value to search :");
        String value=scanner.next();

        if(task1.isAvailable(strArr,value)){
            System.out.println("value found");
        }else {
            System.out.println("value not found");
        }

        int[][] arr={{20,60,50},{50,90,10}};
        task1.printReverse(arr);
    }

    void printReverse(int[][] arr){
        int[][] ans=new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++){
            for (int j =0; j< arr[0].length; j++){
                ans[j][i]=arr[i][j];
            }
        }
        for (int i = 0; i < ans.length; i++){
            for (int j=0;j< ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    boolean isAvailable(String[] arr,String searchValue){
        for (int i=0;i<arr.length;i++){
             if (arr[i].equals(searchValue)){
                 return true;
             }
        }return false;
    }

    void printGrid(){
        for (int i=0;i<7;i++){
            for (int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void sortStringArray(String[] arr){
        for (int i = 0; i<arr.length-1; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j].compareTo(arr[j+1])>0){
                    String temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    void sortIntArray(int[] arr){
        for (int i = 0; i<arr.length-1; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
