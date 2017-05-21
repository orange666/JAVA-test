import jdk.net.Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuServer {

    public static void main(String[] args) throws IOException{
        MenuServer socketService = new MenuServer();

        socketService.oneServer();
    }
    public  void oneServer(){
        try{
            ServerSocket server=null;
            try{
                server=new ServerSocket(8190);

                System.out.println("服务器启动成功");

            }catch(Exception e) {
                System.out.println("没有启动监听："+e);

            }
            Socket socket=null;
            try{
                socket=server.accept();

            }catch(Exception e) {
                System.out.println("Error."+e);

            }

            String line;
            BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter writer=new PrintWriter(socket.getOutputStream());

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Client:"+in.readLine());





            writer.close();
            in.close();
            socket.close();
            server.close();
        }catch(Exception e) {
            System.out.println("Error."+e);
        }
    }

    //201521123055
    public void menu(Socket socket,String order,PrintWriter writer)
    {

        writer.println("1.显示服务器当前时间 ");
        writer.println("2.您的IP ");
        writer.println("3.文件搜索 ");
        writer.println("4.退出菜单");

        BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line=null;
        while(!(line=in.readLine()).equals("quit"))
        {
            if(line.equals("1"))
            {
                Date date=new Date();
                DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String time=format.format(date);
                writer.println(time);
            }
            else if(line.equals("2"))
            {
                String ip = InetAddress.getLocalHost().getHostAddress();
                writer.println(ip);
            }
            else if(line.equals("4"))
            {
                return;
            }



    }


}


