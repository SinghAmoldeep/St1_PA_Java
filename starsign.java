//2. write a program enter a string and and an array[] in which the put * in front of the values given in an array.
//for eg : string = "abcdef" and array is {1,2} now the starstring needs to be a*b*cdef
//just do arr[i] +1 to arr[i] for star before the array index or after index
import java.util.Scanner;
public class starsign {
    public static String findinsertstar(String str,int[] array){
        StringBuilder sb = new StringBuilder(str);
        for(int i = array.length-1; i>=0; i--){
            int index= array[i];
            if(index>=0 && index<sb.length()){
                sb.insert(index,"*");
            }
        }
        return sb.toString();
    }








    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in an array where u want to put asterisk");
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        String starstring= findinsertstar(str,array);
        System.out.println("The new string is "+starstring);
    }
}