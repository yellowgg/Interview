# 进程与线程
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