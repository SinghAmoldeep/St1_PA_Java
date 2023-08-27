import java.util.Scanner;
public class largestintegerpossible {
    public static void findlargestinteger(int[] array,int n){
        int t=0;
        //array values = 10,20,30,40,50
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                String ij= String.valueOf(array[i])+String.valueOf(array[j]);
                String ji= String.valueOf(array[j])+String.valueOf(array[i]);

                if(Integer.parseInt(ji)>Integer.parseInt(ij)){

                    t=array[i];
                    array[i]=array[j];
                    array[j]=t;

                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]);
        }
    }








    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        findlargestinteger(array,n);
    }
}
