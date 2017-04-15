import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            List<String> list = convertStringToList(sc.nextLine());
            System.out.println(list);
            String word = sc.nextLine();
            remove(list,word);
            System.out.println(list);
        }
        sc.close();
    }

    public static List<String>  convertStringToList(String line)
    {
        List<String> str=new ArrayList<String>();
        for(int i=0;i<line.length();i++)
        {
            if(line.charAt(i)==' ')continue;
            else str.add(line.charAt(i)+"");
        }

        return str;
    }

    public static void remove(List<String> list,String str)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).equals(str))
            {
                list.remove(i);
                 i--;
            }

        }
    }
}

