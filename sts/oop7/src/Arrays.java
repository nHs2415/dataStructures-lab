public class Arrays {
    String[] names={"Harry","Hermine","Draco","Ginny","Albus"};
    public static void main(String[] args) {
        Arrays arrays=new Arrays();
        arrays.sortArray(arrays.names);
        for (String name:arrays.names){
            System.out.println(name);
        }
    }
    public void sortArray(String[] names){

        for (int i=0;i<names.length-1;i++){
            for (int j=0;j<names.length-i-1;j++){
                String temp=names[j];
                names[j]=names[j+1];
                names[j+1]=temp;
            }
        }
    }

}
