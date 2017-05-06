4-4

class Account{
    private int balance;


    public Account(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    synchronized void  deposit(int money){
        this.balance  = this.balance + money;
    }

    synchronized void  withdraw(int money){
        this.balance  = this.balance - money;
    }
}

4-5

synchronized void  deposit(int money){

        this.balance  = this.balance + money;
        if(this.balance > 0) notify();
        }

synchronized void  withdraw(int money) {
        try{

        while(this.balance - money < 0){
        wait ();
        }
        this.balance  = this.balance - money;

        }catch(Exception e){

        }

        4-6

        import java.util.Scanner;
class Repo{
    String[] str;
    static boolean flag1 = true;
    static boolean flag2 = true;

    public Repo(String items) {

        str = items.split(" ");
    }
    int getSize(){
        int size = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i] != null)
                size++;
        }
        return size;
    }

    synchronized String delTask(){
        String temp = str[0];
        for (int i = 0; i < str.length - 1; i++) {
            this.str[i] = this.str[i +1 ];
        }
        this.str[str.length - 1] = null;
        return temp;
    }

}
class Worker1 implements Runnable{
    private Repo repo;
    public Worker1(Repo repo){
        this.repo = repo;
    }
    @Override
    public  void run() {
        while(repo.getSize() != 0){

            if(Repo.flag1 == true){
                System.out.println(Thread.currentThread().getName()+ " finish " + repo.delTask());
                Repo.flag1 = false;
                Repo.flag2 = true;
            }
        }

    }

}
class Worker2  implements Runnable{
    private Repo repo;
    public Worker2(Repo repo){
        this.repo = repo;
    }
    @Override
    public   void run() {

        while(repo.getSize() != 0){
            if(Repo.flag2 == true){
                System.out.println(Thread.currentThread().getName()+ " finish " + repo.delTask());
                Repo.flag2 = false;
                Repo.flag1 = true;
            }
        }
    }
}

4-9

        Collections.synchronizedList(new ArrayList());

        4-7
        Executors.newSingleThreadExecutor();
        for(int i = 0; i < n;i++){

        exec.execute(new Task(i));
        }

        4-8

        CountDownLatch latch = new CountDownLatch(n);
        MyTask task = new MyTask(latch);
        ExecutorService exec = Executors.newFixedThreadPool(poolSize);
        for(int i = 0;i < n;i++){
        exec.execute(task);
        }

        4-10

        for (int i = 1; i <= n; i++) {
        CalculateTask task = new CalculateTask(i);
        taskList.add(task);
        }

        try {
            /*invokeAll批量运行所有任务, submit提交单个任务*/
        results = exec.invokeAll(taskList);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        try {
            /*从future中输出每个任务的返回值*/
        for (Future<Integer> future : results) {
//                System.out.println(future.get());//get方法会阻塞直到结果返回
        sum += future.get();
        }
        } catch (InterruptedException e) {
        e.printStackTrace();
        } catch (ExecutionException e) {
        e.printStackTrace();
        }
        exec.shutdown();
        System.out.println("sum="+sum);

        }
        }
class CalculateTask implements Callable<Integer>{
    private int n;

    public CalculateTask(int n){
        this.n = n;
    }
    @Override
    public Integer call() throws Exception {
        return fib(n);
    }
    public Integer fib(int m ){
        if(m == 0)
            return 0;
        if(m == 1)
            return 1;
        return fib(m-1) + fib(m - 2);
    }

}
