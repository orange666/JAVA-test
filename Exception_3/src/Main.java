import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/20.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] arr=new double[n];
        String s1=null;
        String s2=null;
        int begin=0;
        int end=0;

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextDouble();
        }


        while(true)
        {
            s1=sc.next();
            try{
                begin=Integer.valueOf(s1);
            }
            catch(NumberFormatException ex)
            {
                break;
            }
            end=Integer.valueOf(sc.next());

            try{
                System.out.println(ArrayUtils.findMax(arr,begin,end));
            }
            catch(IllegalArgumentException ex)
            {
                System.out.println(ex);
            }



        }

        try {
            System.out.println(ArrayUtils.class.getDeclaredMethod("findMax", double[].class,int.class,int.class));
        } catch (Exception e1) {
        }

        Integer.parseInt()



    }
}


class ArrayUtils
{
    public static double findMax(double[] arr,int begin,int end)throws IllegalArgumentException
    {
        if(begin>=end)throw new IllegalArgumentException("begin:"+begin+" >= "+"end:"+end);
        if(begin<0)throw new IllegalArgumentException("begin:"+begin+" < 0");
        if(end>arr.length)throw new IllegalArgumentException("end:"+end+" > arr.length");
        double max=Double.MIN_VALUE;
        for(int i=begin;i<end;i++)
        {
            if(arr[i]>max)max=arr[i];
        }
        return max;
    }
}


