import java.util.Scanner;
public class MyArray
{
    public static void main(String[] args)
    {
        int array_size;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a size for the array:");
        array_size = scan.nextInt();
	scan.close();

        int[] my_array = new int[array_size];

        for(int i = 0; i < array_size; i++)
        {
            my_array[i] = i+1;
            System.out.println("Array index:" + i + " contains the number: " + my_array[i]);
        }
    }
}
