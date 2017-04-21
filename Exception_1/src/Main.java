import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/20.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        String str=null;
        int option=0;

        while(true)
        {
            str=sc.next();
            if(str.equals("arr"))option=1;
            else if(str.equals("null"))option=2;
            else if(str.equals("cast"))option=3;
            else if(str.equals("num"))option=4;
            else option=5;

            switch (option){
                case 1:
                {
                    int index=sc.nextInt();
                    try{
                        arr[index]++;
                    }
                    catch(ArrayIndexOutOfBoundsException ex)
                    {
                        System.out.println(ex);
                    }
                }break;

                case 2:
                {
                    try{
                        String s=null;
                        s.charAt(2);
                    }
                    catch(NullPointerException ex)
                    {
                        System.out.println(ex);
                    }
                }break;

                case 3:
                {
                    try{

                        Object x=new String ("ss");
                        System.out.println((Integer) x);

                    }
                    catch(ClassCastException ex)
                    {
                        System.out.println(ex);
                    }
                }break;

                case 4:
                {
                    try{
                        Integer i=new Integer(sc.next());
                    }
                    catch(NumberFormatException ex)
                    {
                        System.out.println(ex);
                    }
                }break;

                case 5:
                {
                    return;
                }

            }
        }

    }



}
