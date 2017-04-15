import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/15.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String menu=null;
        int a=0;
        while(true)
        {
            menu=sc.next();
            if(menu.equals("Integer"))a=1;
            else if(menu.equals("Double"))a=2;
            else if(menu.equals("Car"))a=3;
            else if(menu.equals("quit"))return;
            ArrayListGeneralStack stack=new ArrayListGeneralStack();
            switch(a)
            {
                case 1:
                {
                    System.out.println("Integer Test");
                    int push=sc.nextInt();
                    int pop=sc.nextInt();
                    for(int i=0;i<push;i++)
                    {
                        stack.push(sc.nextInt());
                        System.out.println("push:"+stack.peek());
                    }
                    for(int i=0;i<pop;i++)
                    {
                        System.out.println("pop:"+stack.pop());
                    }
                    System.out.println(stack.toString());
                    int add=0;
                    while(!stack.empty())
                    {
                        Integer num=0;
                        num=(Integer) stack.pop();
                        add+=num;
                    }
                    System.out.println("sum="+add);
                    System.out.println(stack.getClass().getInterfaces()[0]);

                }break;

                case 2:
                {
                    System.out.println("Double Test");
                    int push=sc.nextInt();
                    int pop=sc.nextInt();
                    for(int i=0;i<push;i++)
                    {
                        stack.push(sc.nextDouble());
                        System.out.println("push:"+stack.peek());
                    }
                    for(int i=0;i<pop;i++)
                    {
                        System.out.println("pop:"+stack.pop());
                    }
                    System.out.println(stack.toString());
                    double add=0;
                    while(!stack.empty())
                    {
                        Double num=0.0;
                        num=(Double)stack.pop();
                        add+=num;
                    }
                    System.out.println("sum="+add);
                    System.out.println(stack.getClass().getInterfaces()[0]);

                }break;

                case 3:
                {
                    System.out.println("Car Test");
                    int push=sc.nextInt();
                    int pop=sc.nextInt();
                    for(int i=0;i<push;i++)
                    {
                        stack.push(new Car(sc.nextInt(),sc.next()));
                        System.out.println("push:"+stack.peek());
                    }
                    for(int i=0;i<pop;i++)
                    {
                        System.out.println("pop:"+stack.pop());
                    }
                    System.out.println(stack.toString());
                    while(!stack.empty())
                    {
                        System.out.println(((Car)stack.pop()).getName());
                    }
                    System.out.println(stack.getClass().getInterfaces()[0]);
                }break;



            }
        }

    }
}


interface GeneralStack<E>
{
    E push(E item);
    E pop();
    E peek();
    public boolean empty();
    public int size();
}


class ArrayListGeneralStack<T> implements GeneralStack<T>
{
    ArrayList<T> list=new ArrayList<T>();

    public T push(T item)
    {
        if(item==null)return null;
        else
        {
            list.add(item);
            return list.get(size()-1);
        }

    }



    public T pop()
    {
        T t=null;
        if(list.isEmpty())return null;
        else
        {
            t=list.get(list.size()-1);
            list.remove(list.size()-1);
            return t;
        }

    }

    public T peek()
    {
        if(list.size()==0)return null;
        else return list.get(list.size()-1);
    }

    public boolean empty()
    {
        return list.isEmpty();
    }

    public int size()
    {
        return list.size();
    }

    @Override
    public String toString()
    {
        return list.toString();
    }
}

class Car
{
    private int id;
    private String name;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car [" +
                "id=" + id +
                ", name=" + name  +
                ']';
    }
}