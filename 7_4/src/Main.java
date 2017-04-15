

import java.util.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/4/15.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,ArrayList<Integer>> word=new TreeMap<String,ArrayList<Integer>>();
        List<String> line=new ArrayList<String>();
        ArrayList<Integer> time=new ArrayList<Integer>();
        String str=null;
        String cache=null;
        while(true)
        {
            str=sc.nextLine();
            if(str.equals("!!!!!"))break;
            line.add(str);
            String[] lineword=str.split(" ");
            for(int i=0;i<lineword.length;i++)
            {
                if(word.containsKey(lineword[i]))
                {
                    if(!word.get(lineword[i]).contains(line.size()))
                    word.get(lineword[i]).add(line.size());
                }
                else
                {
                    word.put(lineword[i],new ArrayList<Integer>());
                    word.get(lineword[i]).add(line.size());
                }

            }

        }


        for(Map.Entry<String,ArrayList<Integer>> entry:word.entrySet())
        {
            System.out.println(entry.getKey()+'='+entry.getValue().toString());
        }


        while(sc.hasNext())
        {
            String[] keyword=sc.nextLine().split(" ");
            if(!word.containsKey(keyword[0]))
            {
                System.out.println("found 0 results");
                continue;
            }
            time=(ArrayList<Integer>) word.get(keyword[0]).clone();
            for(int i=1;i<keyword.length;i++)
            {
                if(!word.containsKey(keyword[i]))
                {
                    time.clear();
                    break;
                }
                for(int j=0;j<time.size();j++)
                {
                    boolean t=false;
                    for(int k=0;k<word.get(keyword[i]).size();k++)
                    {

                        if(word.get(keyword[i]).get(k)==time.get(j))t=true;
                    }
                    if(t==false)
                    {
                        time.remove(j);
                        j--;
                    }

                }
            }
            if(time.size()==0) System.out.println("found 0 results");
            else
            {
                System.out.println(time);
                for(int i=0;i<time.size();i++)
                {
                    System.out.println("line "+time.get(i)+':'+line.get(time.get(i)-1));
                }
            }
            time.clear();
        }

    }

}
