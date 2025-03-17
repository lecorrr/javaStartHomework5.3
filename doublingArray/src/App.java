
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        int[] arr = new int[15];
        Random rand = new Random();

        int coppySize = arr.length * 2;
        int[] arrCoppy = new int[coppySize];

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = rand.nextInt(1000);
        }
       
        int check = 0;

        for(int j = 0; j < coppySize; j++)
        {           

            if (j < arr.length) 
            {
                arrCoppy[j] = arr[j];
            }
            else
            {
                arrCoppy[j] = arr[check] * 2;
                check++;
            }
        }
        
        System.out.println(Arrays.toString(arr)+"\n\n");
        System.out.println(Arrays.toString(arrCoppy));

    }
}
