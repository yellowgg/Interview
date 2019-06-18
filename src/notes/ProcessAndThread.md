# 进程与线程

## 选择题(默认单选，多选会有标记) 
1. 可以获得对任何对象的互斥锁定  
A、if语句和else语句必须成对出现  
B、通过继承Thread类或实现Runnable接口，可以获得对类中方法的互斥锁定  
C、线程通过使用synchronized关键字可获得对象的互斥锁定  
D、线程的创建只能通过继承Thread类来实现  
答案选C  

2. 下列关于管道（Pipe）通信的叙述中，正确的是  
A、进程对管道进行读操作和写操作都可能被阻塞  
B、一个管道只能有一个进程或一个写进程对其操作
C、一个管道可实现双向数据传输  
D、管道的容量仅受磁盘容量大小限制  
答案选A  
解析：  
A.正确，因为管道为空，读操作会被阻塞；管道满了，写操作会被阻塞  
B.可以有多个进程对其读；也可以有多个进程写，只不过不能同时写。并且题目没有说“同时”  
C.匿名管道只能单向；命名管道可以双向；所以C过于绝对  
D.管道是内存中的，所以D不对  
## 编程题
- 设计4个线程，其中两个线程每次对j增加1，另外两个线程每次对j减少1。
```
//第一个类
public class FourThread {
    private int j = 0;

    /**
     * 加1
     */
    public synchronized void add() {
        j++;
        System.out.println(Thread.currentThread().getName() +
                "-->加1，此时j为-->" + j);
    }

    /**
     * 减1
     */
    public synchronized void sub() {
        j--;
        System.out.println(Thread.currentThread().getName() +
                "-->减1，此时j为-->" + j);
    }

}
//第二个类
public class FourThreadMain {

    public static void main(String[] args) {
        FourThread fourThread = new FourThread();
        for (int i = 0; i < 2; i++) {
            //两个线程加1
            new Thread(new Runnable() {
                @Override
                public void run() {
                        fourThread.add();
                }
            }).start();

            //两个线程减1
            new Thread(new Runnable() {
                @Override
                public void run() {
                        fourThread.sub();
                }
            }).start();
        }
    }
}
```