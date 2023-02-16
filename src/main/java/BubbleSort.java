import java.util.Arrays;

public class BubbleSort {
    public void printS(int[] ar){
        int[] x= ar;
        System.out.print("Sorted\t");
        for(int i=0;i<ar.length;i++) {
            System.out.print(x[i]+"\t");
        }
    }
    public int[] bubbleSort(int[] arr){
        int temp=0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] gradeOfStudents={0,10,3,4,6,7,1,5,8,9};
        BubbleSort obj=new BubbleSort();
        int[] sortedArray= obj.bubbleSort(gradeOfStudents);
        //System.out.println("Sorted :");
       // System.out.println(Arrays.toString(sortedArray));
        obj.printS(sortedArray);

    }
}
