import java.util.*;

/**
 * Created by Administrator on 2017/3/23.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<PersonSortable2> person=new ArrayList<PersonSortable2>();
        for(int i=0;i<n;i++)
        {
            person.add(new PersonSortable2(sc.next(),sc.nextInt()));
        }

        Comparator<PersonSortable2> NameComparator=(o1,o2)-> o1.getName().compareTo(o2.getName());
        Comparator<PersonSortable2> AgeComparator=(o1,o2)-> o1.getAge()-o2.getAge();


        Collections.sort(person,NameComparator);
        System.out.println("NameComparator:sort");
        for(int i=0;i<person.size();i++)
        {
            System.out.println(person.get(i));
        }


            Collections.sort(person,AgeComparator);
        System.out.println("AgeComparator:sort");
        for(int i=0;i<person.size();i++)
        {
            System.out.println(person.get(i));
        }



    }
}

class PersonSortable2
{
    private String name;
    private int age;

    public PersonSortable2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name+'-'+this.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}



