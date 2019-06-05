package cn.yellowgg.processandthread;

/**
 * @Author:黄广
 * @Description:
 * @Date: Created in 19-6-5 下午4:24
 */
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
