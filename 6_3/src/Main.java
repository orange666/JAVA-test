import java.util.*;

/**
 * Created by Administrator on 2017/4/6.
 */
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> dic=new HashMap<String,Integer>();
        String str=null;
        while(true)
        {
            str=sc.next();
            if(str.equals("!!!!!"))break;

            if(dic.containsKey(str))
            {
                Integer i=dic.get(str);
                i++;
                dic.put(str,i);
            }
            else
            {
                dic.put(str,1);
            }
        }



        Map<String, Integer> sortdic = sortMapByValue(dic);
        System.out.println(sortdic.size());

        int i=0;
        for (Map.Entry<String, Integer> entry : sortdic.entrySet()) {
            if(i==10||i>=sortdic.size())break;
            System.out.println(entry.getKey() + '=' + entry.getValue());
            i++;
        }
    }



    public static Map<String, Integer> sortMapByValue(Map<String, Integer> oriMap) {
        if (oriMap == null || oriMap.isEmpty()) {
            return null;
        }
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(
                oriMap.entrySet());
        Collections.sort(entryList, new MapComparatorByValue());

        Iterator<Map.Entry<String, Integer>> iter = entryList.iterator();
        Map.Entry<String, Integer> tmpEntry = null;
        while (iter.hasNext()) {
            tmpEntry = iter.next();
            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
        }
        return sortedMap;
    }
}

class MapComparatorByValue implements Comparator
{
    @Override
    public int compare(Object o1,Object o2)
    {
        Map.Entry<String,Integer> m1=(Map.Entry<String,Integer>)o1;
        Map.Entry<String,Integer> m2=(Map.Entry<String,Integer>)o2;
        if(m2.getValue()==m1.getValue())
        {
            return m1.getKey().compareTo(m2.getKey());
        }
        else return m2.getValue()-m1.getValue();

    }
}

