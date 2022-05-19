import java.util.Scanner;

public class bubble_sort_integers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter size of the array: ");

        //asking user to enter size of array
        int size = sc.nextInt();
        int myArray[] = new int[size];

        //filling array with user input
        for(int i =0;i< size;i++)
            myArray[i] = sc.nextInt();

        //first loop is to go through the numbers in the array
        for(int i =0;i<size;i++){
            //second loop is used as the comparison loop to compare the previous value to the next one
            for(int j =i;j<size;j++){
                //comparing to see if the size of the integer value is less than the comparison integer or the comparison integer is the same as the next integer and that the previous value is bigger than the next value
                if(Integer.toString(myArray[i]).length() < Integer.toString(myArray[j]).length() || (Integer.toString(myArray[i]).length() == Integer.toString(myArray[j]).length() && myArray[i] > myArray[j])){
                    //if the first value is smaller than the second value then swap
                    //main bubble sort method
                    myArray[i] += myArray[j];
                    myArray[j] = myArray[i] -myArray[j];
                    myArray[i] = myArray[i] - myArray[j];
                }
            }
            //printing out the new array of organised numbers
            System.out.print(myArray[i] + " ");
        }
    }
}