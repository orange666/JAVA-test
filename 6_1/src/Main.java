import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/5.
 */
public class Main
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayListIntegerStack stack=new ArrayListIntegerStack(n);
        for(int i=0;i<n;i++)
        {
            stack.push(sc.nextInt());
            System.out.println(stack.peek());
        }
        System.out.println(stack.peek()+","+stack.empty()+","+stack.size());
        System.out.println(stack.arr);

        int x=sc.nextInt();

        for(int i=0;i<x;i++)
        {
            System.out.println(stack.pop());
        }

        System.out.println(stack.peek()+","+stack.empty()+","+stack.size());
        System.out.println(stack.arr);





    }

}


class ArrayListIntegerStack implements IntegerStack
{
    ArrayList<Integer> arr=new ArrayList<Integer>();
    int length;
    ArrayListIntegerStack(int length)
    {
        this.length=length;
    }

    @Override
    public Integer push(Integer item)
    {
        if(item==null)return null;
        else if(arr.size()==length)return null;
        this.arr.add(item);
        return item;
    }

    @Override
    public Integer pop()
    {

        if(arr.size()==0)return null;
        Integer i=arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return i;

    }

    @Override
    public Integer peek()
    {
        if(arr.size()==0)return null;
        else return arr.get(arr.size()-1);
    }

    @Override
    public boolean empty()
    {
        if(arr.size()==0)return true;
        else return false;
    }

    @Override
    public int size()
    {
        return arr.size();
    }


}


interface IntegerStack{

    public Integer push(Integer item);
    public Integer pop();
    public Integer peek();
    public boolean empty();
    public int size();
}
