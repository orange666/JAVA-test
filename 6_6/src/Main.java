import java.util.*;

/**
 * Created by Administrator on 2017/4/6.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        ArrayList<Integer> arr2=new ArrayList<Integer>();

        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int m=sc.nextInt();

            if(m%2==1)arr1.add(m);
            else arr2.add(m);
        }
        Collections.sort(arr1);
        Collections.sort(arr2);
        //System.out.println(arr1);
       // System.out.println(arr2);
        int index1=0,index2=0;

        while(true)
        {
           // System.out.println("index1="+index1+" index2="+index2);
            if(index1>=arr1.size()&&index2>= arr2.size())break;
            index1=putA(arr1,index1);
            index2=putB(arr2,index2);
        }

       // System.out.println(index1);
        //System.out.println(index2);

    }

    static public int putA(ArrayList arr,int index)
    {
        if(arr.size()>index+1)
        {
            System.out.println(arr.get(index));
            System.out.println(arr.get(index+1));
            return index+2;
        }
        else if(arr.size()==index+1)
        {
            System.out.println(arr.get(index));

            return index+1;
        }
        else return index;

    }

    static public int putB(ArrayList arr,int index)
    {
        if(arr.size()>index)
        {
            System.out.println(arr.get(index));

        }
        return index+1;
    }
}
