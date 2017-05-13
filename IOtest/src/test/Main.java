
package test;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/13.
 */
public class Main {

    public static void main(String[] args)throws IOException {


        Student[] students=new Student[3];
        students[0]=new Student(1,"lin",10,1);
        students[1]=new Student(2,"chen",10,1);
        students[2]=new Student(3,"zhang",10,1);

//        FileOutputStream fos = new FileOutputStream("student.txt");
//        ObjectOutputStream op=new ObjectOutputStream(fos);
//        op.writeObject(students);
//        op.close();
//        fos.close();
//
//        FileInputStream fis = new FileInputStream("student.txt");
//        ObjectInputStream oi=new ObjectInputStream(fis);
//        try {
//            Student[] st = (Student[]) oi.readObject();
//            for(Student s:st)
//            {
//                System.out.println(s);
//            }
//        }catch (ClassNotFoundException ex){
//            ex.printStackTrace();
//        }
//        oi.close();
//        fis.close();


//        OutputStream os=new FileOutputStream("student.txt");
//        PrintWriter pw=new PrintWriter(os);
//
//        pw.close();
//        os.close();
//
//        InputStream is=new FileInputStream("EncodeTest.txt");
//        InputStreamReader isr=new InputStreamReader(is,"utf-8");
//        BufferedReader br=new BufferedReader(isr);
//
//        String info=null;
//        info=br.readLine();
//        while(info!=null){
//            System.out.println(info);
//            info=br.readLine();
//        }
//        br.close();
//        isr.close();
//        is.close();




//        long start=System.currentTimeMillis();
//        dosome1();
//        long end=System.currentTimeMillis();
//        System.out.println("PrintWriter:"+(end-start)+"ms");
//
//
//        start=System.currentTimeMillis();
//        dosome2();
//        end=System.currentTimeMillis();
//        System.out.println("BufferedWriter:"+(end-start)+"ms");
//



        String regEx= "^(-?\\d+)(\\.\\d+)?$";
        String[] str={"-123.02","230","350sa"};
        for(String s:str)
        {
            System.out.println(s.matches(regEx));
        }

    }


//    static public void convertGBK2UTF8(String src, String dst)throws IOException
//    {
//        BufferedReader bf=new BufferedReader(src);
//        OutputStream os=new FileOutputStream(dst);
//        PrintWriter pw=new PrintWriter(os);
//        String gbk=bf.readLine();
//        while(gbk!=null)
//        {
//            String utf=new String(gbk,"UTF-8");
//            pw.println(utf);
//        }
//
//        bf.close();
//        pw.close();
//        os.close();
//    }

//    static public void dosome1() throws IOException
//    {
//        OutputStream os=new FileOutputStream("student.txt");
//        PrintWriter pw=new PrintWriter(os);
//        for(long i=0;i<10000000;i++)
//        {
//            pw.println(1);
//        }
//        pw.close();
//        os.close();
//
//
//    }
//
//
//    static public void dosome2() throws IOException
//    {
//        FileWriter fw = new FileWriter("student.txt");
//        BufferedWriter bw=new BufferedWriter(fw);
//        for(long i=0;i<10000000;i++)
//        {
//            bw.write(1);
//            bw.newLine();
//        }
//        bw.close();
//        fw.close();
//
//    }

//    public static List<Student> readStudents(String fileName)
//    {
//        ArrayList<Student> stu=new ArrayList<Student>();
//        BufferedReader bf=new BufferedReader(fileName);
//        String str=bf.readLine();
//        while(str!=null);
//        {
//            String[] mes=str.split(" ");
//            int id=Integer.parseInt(mes[0]);
//            int name=mes[1];
//            int age=Integer.parseInt(mes[2]);
//            double grade=Double.parseDouble(mes[3]);
//            stu.add(new(id,name,age,grade));
//            str=bf.readLine();
//        }
//        bf.close();
//        return stu;
//    }
//
//    public static void findFile(String path,String filename)
//    {
//        File file=new File(path);
//        File[] files=file.listFiles();
//
//        for(File f:files)
//        {
//            for(int i=0;i<files.length;i++)
//            {
//                if(f.isFile())
//                {
//                    if(f.getName().equals(filename)) System.out.println(f.getAbsolutePath());
//                }
//                else if(f.isDirectory())findFile(f.getAbsolutePath(),filename);
//            }
//        }
//    }
}





