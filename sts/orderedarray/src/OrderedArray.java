public class OrderedArray {
    private long[] a; // ref to array a
    private int nElements; //number of data items
    public OrderedArray(int max) {
        this.a=new long[max];
        this.nElements=0;
    }
    public int size() { // return max size of the array
        return this.a.length;
    }
    public int find(long searchKey) {
        for (int i=0; i<this.nElements; i++){
            if (this.a[i]==searchKey){
                   return i;
            }
        }
        return -1;
    }
    public void insert(long value) { // put element into arrray

        if (this.nElements==size()){
            System.out.println("Array is full. Insertion terminated.");
            return;
            /*we not need this return if we write the else
            part of this if condition*/
        }

        for (int i=0; i<nElements; i++){
              if (this.a[i]>value){
                  for (int j=nElements; j>i ; j--){
                      this.a[j]=this.a[j-1];
                  }
                  this.a[i]=value;
                  this.nElements++;
                  return;
              }
          }
        this.a[this.nElements] = value;
        this.nElements++;
    }
    public boolean delete(long value) {

        if (this.nElements==0){
            System.out.println("Array is empty.deletion terminated.");
            return false;
        }
        boolean status = false;
        for (int i =0; i < this.nElements; i++){
            if (a[i] == value){
                for (int j = i; j < this.nElements-1; j++){
                    this.a[j] = this.a[j+1];
                }
                this.nElements--;
                i--;
                status=true;
                System.out.println("value deleted.");
                return true;
            }
        }
        System.out.println("value not found for deletion.");
        return status;
    }
    void display() { // display array contents

        if (this.nElements==0){
            System.out.println("Invalid entrance.");
            return;
        }

        for (int i = 0; i<this.nElements; i++ ){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

class Main{
    public static void main(String[] args) {
        OrderedArray x=new OrderedArray(10);
        x.insert(7);
        x.insert(4);
        x.insert(3);
        x.insert(6);
        x.insert(23);
        x.insert(14);
        x.insert(34);
        x.insert(31);
        x.insert(7);
        x.insert(67);
        x.insert(23);
        x.delete(7);
        x.delete(23);

        int index = x.find(31);
        if (index==-1){
            System.out.println("value not found");
        }else {
            System.out.println("31 can found in location number :"+index);
        }

        x.display();
    }
}





























































