package cn.yellowgg.processandthread;

/**
 * @Author:黄广
 * @Description: 设计4个线程，其中两个线程每次对j增加1，另外两个线程每次对j减少1。
 * @Date: Created in 19-6-5 下午4:12
 */
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
