import java.util.*;

/**
 * Created by Administrator on 2017/4/6.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.i n);
        Set<String> arr = new TreeSet<String>();
        String str=null;
        while(true)
        {
            String word=sc.next();
            if(word.equals("!!!!!"))break;
            arr.add(word);

        }

        System.out.println(arr.size());

        int i=0;
        for(String s:arr)
        {
            if(i==10)break;
            else if(i>arr.size())break;
            System.out.println(s);
            i++;
        }
    }
}
