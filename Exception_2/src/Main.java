import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/20.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            try{
                arr[i]=Integer.valueOf(sc.next());
            }
            catch(NumberFormatException ex)
            {
                System.out.println(ex);
                i--;
            }
        }


        Integer.parseInt()
        System.out.println(Arrays.toString(arr));
    }
}
