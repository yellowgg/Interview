# JAVA基础

## 选择题(默认单选，多选会有标记)  
1. 下面哪一种修饰词能使一个类中的成员变量仅仅具有包可见性  
A、protected　　B、public　　C、private　　D、以上皆不对  
答案选D  
解析：按照题意很明显是无(默认)  
![VUZL1P.png](https://s2.ax1x.com/2019/06/05/VUZL1P.png)

2. 符合对象(object)和类(class)关系的是  
A、人和老虎　　B、书和汽车　　C、楼和凉亭　　D、汽车和交通工具  
答案选D

3. 关于选择结构下列那个说法正确  
A、if语句和else语句必须成对出现  
B、if语句可以没有else语句对应  
C、switch结构中每个case语句中必须用break语句  
D、switch结构中必须有default语句
答案选B

4. return语句  
A、可以让方法返回数值　　　　B、方法都必须含有  
C、方法中可以有多句return　　D、不能用来返回对象C  
答案选A  
解析：C选项中应该加个条件，在不同的情况下，或者说这题有点歧义

5. 下列哪个说法正确  
A、不需要定义类，就能创建对象　　B、对象中必须有属性和方法定义  
C、属性必须是简单对象　　　　　　D、属性可以是简单变量，也可以是一个对象  
答案选D

6. 关于方法的说法哪个正确  
A、方法中的形参BCD可以和方法所属类定义的属性（变量）同名  
B、方法必须有形参  
C、同类不同的方法中不能有同名的自变量，否则会有不可预测的结果  
D、没有返回值的方法可以用void来表示，也可以不加  
答案选A

7. 下列哪个是正确  
A、一个程序可以包含多个源文件　　　B、一个源文件中只能有一个类  
C、一个源文件中可以有多个公共类　　D、一个源文件只能供一个程序使用  
答案选A

8. 下列哪个是正确  
A、Java允许一个子类有多个父类  
B、某个类是一个类的子类，它仍有可能成为另一个类的父类  
C、一个父类只能有一个子类  
D、继承关系最多不能超过四层  
答案选B  

9. 关于构造方法的说法哪个正确  
A、一个类只能有一个构造方法　　B、一个类可以有多个不同名的构造方法  
C、构造方法与类同名 　　　　　　D、构造方法必须自己定义，不能使用父类的构造方法  
答案选C

10. 下列哪个是正确  
A、子类只能覆盖父类的方法，而不能重载  
B、子类只能重载父类的方法，而不能覆盖  
C、子类不能定义和父类同名同形参的方法，否则，系统将不知道调用哪个方法  
D、重载就是一个类中有多个同名但有不同形参和方法体的方法  
答案选D  
解析：选项C中，若父类引用指向子类实例，调用的同名方法是子类的方法，若想调用父类的同名方法可以使用super
关键字。父类引用只能调用子类重写的方法，不能访问子类自己自定义的方法。  

11. 关于抽象类下列哪个说法正确  
A、抽象类中不可以有非抽象方法  
B、某个非抽象类的父类是抽象类，则这个子类必须重载父类的所有抽象方法  
C、抽象类无法创建对象  
D、接口和抽象类是同一回事  
答案选C  
解析：选项A中抽象类有抽象方法同时也允许有非抽象方法。只能单继承。接口中必须都是抽象方法。  

12. 哪个（些）是java关键字(复选题)  
A、run　　B、default　　C、implements　　D、import  
答案选BCD  
解析：选项A中run是方法名，default是程序控制，implements是类，方法和变量修饰符，import是包相关  

13. 被声明为private、protected及public的类成员，在类外部  
A、只能访问声明为public的成员　　B、只可能访问到声明为protected和public的成员  
C、都可以访问　　　　　　　　　　D、都不能访问  
答案选B  

14. 关于抽象方法，下列描述正确的是  
A、可以有方法体　　　　　B、可以出现在非抽象类中  
C、是没有方法体的方法　　D、抽象类中的方法都是抽象方法  
答案选C  

15. 关于main()方法的说法哪个正确  
A、main()方法只能放在公共类中  
B、main()方法的头定义可以根据情况任意更改  
C、一个类中可以没有main()方法  
D、所有对象的创建都必须放在main()方法中  
答案选C  

16. 下列哪个声明是正确的  
A、 abstract final class Hh {}  
B、 abstract private move(){}  
C、 protected private number;  
D、 public abstract class Car{}  
答案选D  
解析：abstract不能与private、static、final、native并列修饰同一个类或方法。

17. 关于对象成员占用内存的说法哪个正确  
A、同一个类的对象共用同一段内存  
B、同一个类的对象是用不同的内存段，但静态成员共享相同的内存空间  
C、对象的方法不占用内存  
D、以上都不对  
答案选B

18. 关于this和super，下列说法正确的是  
A、都可以在main()方法中使用　　　B、都是指一个内存地址  
C、不能用在main()方法中　　　　　D、意义相同  
答案选C  
解析：this代表对本类对象的引用，super
代表对父类对象的引用，由静态优于对象可知，当静态的出现时，对象的还没出现。
所以在静态方法中调用这两个跟对象有关的当然会出错，  

19. 关于接口下列哪个说法正确  
A、实现一个接口必须实现接口的所有方法  
B、一个类只能实现一个接口  
C、接口间不能有继承关系  
D、接口和抽象类是一回事  
答案选A

20. 关于接口下列哪个说法正确  
A、一个类不能同时实现多个接口  
B、接口中只能有方法声明，不能有数据成员  
C、接口间不能有继承关系  
D、接口中的数据成员都是静态常量  
答案选D  
解析：选项D中，interface里面的变量都是public static final的，
接口中的属性要么没有，要么必定是常量，而且是只读的，这样才能为接口提供一个统一的属性。

21. 关于方法的形参，下列说法正确的是  
A、必须定义多个形参　　　B、至少有一个  
C、可以没有　　　　　　　D、只能是简单变量  
答案选C 

22. 有整型数组：int[] x={12，35，8，7，2};则调用方法Arrays.sort(x)后，
数组x中的元素值依次是  
A、 2 7 8 12 35　　　　　B、 12 35 8 7 2  
C、 35 12 8 7 2　　　　　D、 8 7 12 35 2  
答案选A

23. 下列哪个说法是正确的(复选题)  
A、程序执行到break语句时一定会结束所有的循环  
B、程序执行到continue语句时会结束当前循环  
C、break语句和continue语句都可以和标签协同使用  
D、continue语句和break语句的作用相同  
答案选BC

24. while循环和do-while循环的区别是  
A、没有区别，这两个结构在任何情况下效果一样  
B、while循环比do-while循环执行效率高  
C、while循环是先循环后判断，所以循环体至少被执行一次  
D、do-while循环是先循环后判断，所以循环体至少被执行一次  
答案选D

25. 关于类和对象的描述正确的是(复选题)  
A、类是对一组对象的抽象  
B、对象是现实世界的一个实体  
C、父类的属性包含子类的属性  
D、封装是把过程和数据包围起来，外部对数据的访问只能通过已定义的界面  
答案选ABD

26. 在Java中，基本的数据类型是  
A、String　　　B、Byte　　　C、Integer　　　D、boolean  
答案选D  
解析：byte（字节型）、short（短整型）、int（整型）、long（长整型）、
float（单精度浮点型）、double（双精度浮点型）、boolean（布尔型）、char（字符型）

27. 下面说法正确的是  
A、当运行Javac命令对一个Java源程序（.java）进行编译时，必须写出该源文件的完整的文件名，包括扩展名.java  
B、当运行Javac命令对一个Java源程序（.java）进行编译时，不必写出该源文件的扩展名.java  
C、当用Java命令解析运行一个class文件时，必须写出该class文件的扩展名.class  
D、无论运行Javac还是Java命令，后面的源文件都必须给出文件扩展名  
答案选A  
解析：使用javac对源文件进行编译时，则要写完整文件名，包括后缀.java，它编译的就是整个源文件。
由于字节码文件在执行时，解释执行的是类，并不是.class文件（实际上一个class文件中也就只有一个类），所以在用java解释命令执行字节码文件时，不需要加上.class后缀，只需写上类名  

28. 下面的标识符错误的是  
A.、$us　　　B、 _b　　　C、const　　　D、jack  
答案选C  
解析：Java标识符由数字，字母和下划线（\_），美元符号（$）组成。
在Java中是区分大小写的，而且还要求首位不能是数字。最重要的是，Java关键字不能当作Java标识符。

29. 下面哪个变量声明不正确的  
A、IloveJava　　B、$2　　C、piggy@msl　　D、Hello_world  
答案选C  
解析：同28题

30. 下面关于JAVA的优点说法错误的是  
A、JAVA是纯面向对象的语句，还有众多的API支持，所以JAVA开发各种各样的应用程序变的非常容易且易于维护。  
B、JAVA使用的是Unicode作为标准字符，这使得JAVA程序在不同的语言平台上都能被编译和运行。  
C、JAVA引进来的EXCEPTION处理机制，使得JAVA程序更安全、更稳定、更随机应变  
D、垃圾回收机制是JAVA的内在特性，垃圾回收机制的调度是有程序员负责的  
答案选D

31. 往OuterClass类的代码段中插入内部类声明, 哪一个是错误的(复选题)  
    A 
    ```
    class InnerClass{
    public static float func(){return f;}
    }
    ```
    B
    ```
    abstract class InnerClass{
    public abstract float func(){}
    }
    ```
    C
    ```
    static class InnerClass{
    protected static float func(){return f;}
    }
    ```
    D
    ```
    public class InnerClass{
    static float func(){return f;}
    ```
    答案选ABCD  
    解析：
    https://www.nowcoder.com/questionTerminal/48524c47dd924887be6684b17175fa40
    
    静态方法不能访问非静态变量，A和C错；抽象类中的抽象方法不能有方法体，B错；  
    一个类中有多个类声明时，只能有一个public类，D错

32. 以下描述错误的一项是  
A、程序计数器是一个比较小的内存区域，用于指示当前线程所执行的字节码执行
到了第几行，是线程隔离的  
B、原则上讲，所有的对象都是在堆区上分配内存，是线程之间共享的  
C、方法区用于存储JVM加载的类信息、常量、静态变量，
即使编译器编译后的代码等数据，是线程隔离的  
D、Java方法执行内存模型，用于存储局部变量，操作数栈，动态链接，方法出口等信息，
是线程隔离的  
答案选C  
解析：
https://www.nowcoder.com/questionTerminal/e591636209aa483fbb2d9d1a3fc9fa98 

33. 导出类调用基类的构造器必须用到的关键字  
A、this　　　　B、final  
C、super　　　D、static  
答案选C

34. 在使用 interface 声明一个外部接口时，只可以使用()修饰符修饰该接口  
A、private　　B、protected　　C、private protected　　D、public  
答案选D  
解析：接口的方法都是 public abstract 变量都是public static final的 

35. 下面程序段执行后b的值是    
    ```
    Integer integer =new Integer(9);
    boolean b = integer  instanceof  Object;
    ```
    A、9　　　　　B、true　　　　　C、false　　　　　D、1  
    答案选B  
    解析：　instanceof通过返回一个布尔值来指出，
    这个对象是否是这个特定类或者是它的子类的一个实例。

36. javac的作用是  
A、将源程序编译成字节码　B、将字节码编译成源程序 C、解释执行Java字节码　D、调试Java代码  
答案选A  
解析：javac将源程序编译成.class文件，字节码；java将字节码转为机器码，.exe程序

37. 以下代码的输出结果是
    ```
    public class B
    {
        public static B t1 = new B();
        public static B t2 = new B();
        {
            System.out.println("构造块");
        }
        static
        {
            System.out.println("静态块");
        }
        public static void main(String[] args)
        {
            B t = new B();
        }
    }
    ```
    A、静态块 构造块 构造块 构造块  
    B、构造块 静态块 构造块 构造块  
    C、构造块 构造块 静态块 构造块  
    D、构造块 构造块 构造块 静态块  
    答案选C  
    解析：
    https://www.nowcoder.com/questionTerminal/ab6eb06face84c4e81ab5bc6f0f7f258
    
38. 一般情况下，以下哪个选项不是关系数据模型与对象模型之间匹配关系  
A、表对应类　　　　　　　B、记录对应对象  
C、表的字段对应类的属性　D、表之间的参考关系对应类之间的依赖关系  
答案选D

39. 要使对象具有序列化能力，则其类应该实现如下哪个接口  
A、java.io.Serializable  
B、java.lang.Cloneable  
C、java.lang.CharSequence  
D、java.lang.Comparable  
答案选A

40. 编译 java 源程序文件将产生响应的字节码文件，这些字节码文件的扩展名为  
A、.class　　　B、.java  
C、.html　　　D、.exe  
答案选A

41. Java 语言中创建一个对象使用的关键字是  
A、class　　　B、interface  
C、new　 　　D、create  
答案选C

42. 在结构化的程序设计中，模块划分的原则是  
A、各模块应包括尽量多的功能  
B、各模块的规划应尽量大  
C、各模块之间的联系尽量紧密  
D、模块内具有高内聚度，模块间具有低耦合度  
答案选D  
解析：
高内聚就是类的内部操作细节自己完成，不允许外部干涉 低耦合是仅暴露少量的方法给外部使用

43. 关于抽象类和接口叙述正确的是  
A、抽象类和接口都能实例化的  
B、抽象类不能实现接口  
C、抽象类方法的访问权限默认都是public  
D、接口方法的访问权限默认都是public  
答案选D  
解析：
https://www.nowcoder.com/questionTerminal/9eec69a20cd0467c9204dd6e86213ee1

44. 下面的程序在编译运行后，在屏幕上显示的结果是  
    ```
    public class test {
        public static void main(String args[]) {
            int x,y;
            x=5>>2;
            y=x>>>2;
            System.out.println(y);
        }
    }
    ```
    A、0　　　B、2  
    C、5　　　D、80  
    答案选A  
    解析：5 >> 2为右移2位，为0001，然后>>>是无符号右移，所以将0001右移2位再高位补0,所以为0000。
    
45. 在jdk1.5的环境下，有如下4条语句，输出结果是
    ```
    Integer i01 = 59;
    int i02 = 59;
    Integer i03 =Integer.valueOf(59);
    Integer i04 = new Integer(59);
    ```
    A、System.out.println(i01 == i02);  
    B、System.out.println(i01 == i03);  
    C、System.out.println(i03 == i04);  
    D、System.out.println(i02 == i04);  
    答案选C  
    解析：
    https://www.nowcoder.com/questionTerminal/bc5da9d0b8444006a776b7cbfba5d250
    
46. 在JAVA中， 下列标识符合法的是  
A、3kyou　　　　B、@163  
C、name　　　　D、while  
答案选C  

47. 关于下面程序 ThisTest .java 运行结果 说法正确的是
    ```
    public class ThisTest {
        public static void main(String args[]) {
            String x="7";       
            int y = 2;
            int z=2;              
            System.out.println(x+y+z);
        }  
    }
    ```
    A、11　　　　B、722  
    C、22　　　　D、程序有编译错误  
    答案选B  
    解析：如果有操作数是字符串类型，java会自动将另外一个操作数也转换成字符串
    
48. 下列代码中的错误是  
    ```
    public class Test{
        public static void main(String [] args){
            int i;
            i += 1;
        }
    }
    ```
    A、非法的表达式 i+=1  
    B、找不到符号i  
    C、类不应为public  
    D、尚未初始化变量i  
    答案选D  
    解析：无论是类变量还是实例变量，在使用前都是非空的，而局部变量没有初始化过程，在使用前必须赋值。
    
49. Math.round(11.5) 等于多少 (). Math.round(-11.5) 等于多少()  
A、11 ,-11　　　　B、11 ,-12  
C、12 ,-11　　　　D、12 ,-12  
答案选C  
解析：round函数是取最接近整数，如果遇到一样近，则取最大值

50. 对接口的描述正确的是  
A、一个类可以实现多个接口   
B、接口可以有非静态的成员变量  
C、在jdk8之前，接口可以实现方法  
D、实现接口的任何类，都需要实现接口的方法  
答案选A  
解析：
https://www.nowcoder.com/questionTerminal/5161fdd4dd4f4ad699f37e3b0b7d0ba1

51. 有这么一段程序
    ```
    public class Test{ 
        public String name="abc"; 
        public static void main(String[] args){ 
            Test test=new Test(); 
            Test testB=new Test(); 
            System.out.println(test.equals(testB)+","+test.name.equals(testB.name)); 
        } 
    }
    ```
    请问以上程序执行的结果是  
    A、true,true　　　 　B、true,false  
    C、false,true　　　　D、false,false  
    答案选C  
    解析：euqals和==都比较的是对象的地址。但是基本类型和包装类型可以比较值，参考75题  
    只有String的equals重写了，比较内容

52. java 接口的修饰符可以为  
A、private　　 B、protected  
C、final　　　 D、abstract  
答案选D  
解析：接口只能用public 和 abstract 修饰

53. Java 语言中，负责并发管理的机制是  
A、垃圾回收　　 　B、虚拟机  
C、代码安全　　　 D、多线程  
答案选D

54. HashSet子类依靠()方法区分重复元素  
A、toString(),equals()   
B、clone(),equals()  
C、hashCode(),equals()  
D、getClass(),clone()  
答案选C  
解析：如果子类的hashCode()值相等,equals()也相等，就确定为相等，即重复元素

55. 运行下面代码，输出的结果是
    ```
    class A {
        public A() {
            System.out.println("class A");
        }
        { System.out.println("I'm A class"); }
        static { System.out.println("class A static"); }
    }
    public class B extends A {
        public B() {
            System.out.println("class B");
        }
        { System.out.println("I'm B class"); }
        static { System.out.println("class B static"); }
         
        public static void main(String[] args) {
     new B();
     }
    }
    ```
    A、
    ```
    class A static 
    class B static 
    I'm A class 
    class A
    I'm B class 
    class B
    ```   
     B、
    ```
    class A static
    I'm A class
    class A
    class B static
    I'm B class
    class B
    ```  
     C、
    ```
    class A static
    class B static
    class A
    I'm A class 
    class B
    I'm B class
    ```  
     D、
    ```
    class A static
    class A
    I'm A class
    class B static
    class B
    I'm B class
    ```
    答案选A  
    解析：执行顺序优先级：静态块>main()>构造块>构造方法
    
56. 事务隔离级别是由谁实现的  
A、Java应用程序  
B、Hibernate  
C、数据库系统  
D、JDBC驱动程序  
答案选C  
解析：
https://www.nowcoder.com/questionTerminal/ce23bb5a36b54849a05f11187eacb23c

57. 以下选项中，合法的赋值语句是  
A、a>1;  
B、i++;  
C、a= a+1=5;  
D、y = int ( i );  
答案选B

58. 关于继承的说法正确的是  
A、子类将继承父类所有的数据域和方法。  
B、子类将继承父类的其可见的数据域和方法。  
C、子类只继承父类public方法和数据域。  
D、子类只继承父类的方法，而不继承数据域。  
答案选A  
解析：继承是可以继承，但能不能用是另外一回事了。

59. 为Test类的一个无形式参数无返回值的方法method书写方法头，
使得使用类名Test作为前缀就可以调用它，该方法头的形式为()  
A、static  void  method()  
B、public void  method()  
C、protected  void  method()  
D、abstract  void method()  
答案选A  

60. 执行如下程序，输出结果是  
    ```
    class Test
    {
         private int data;
         int result = 0;
         public void m()
         {
             result += 2;
             data += 2;
             System.out.print(result + "  " + data);
         }
     }
     class ThreadExample extends Thread
     {
         private Test mv;
         public ThreadExample(Test mv)
         {
             this.mv = mv;
         }
         public void run()
         {
             synchronized(mv)
             {
                 mv.m();
             }
         }
     }
     class ThreadTest
     {
         public static void main(String args[])
         {
             Test mv = new Test();
             Thread t1 = new ThreadExample(mv);
             Thread t2 = new ThreadExample(mv);
             Thread t3 = new ThreadExample(mv);
             t1.start();
             t2.start();
             t3.start();
         }
     }
    ```
    A、0 22 44 6  
    B、2 42 42 4  
    C、2 24 46 6  
    D、4 44 46 6  
    答案选C  
    解析：已经加锁，正常执行，但是重点是print不换行，所以注意点就知道答案
    
61. 执行如下程序，输出结果是  
    ```
    public class Test{
    static{
       int x=5;
    }
    static int x,y;
    public static void main(String args[]){
       x--;
       myMethod( );
       System.out.println(x+y+ ++x);
    }
    public static void myMethod( ){
      y=x++ + ++x;
     }
    }
    ```
     A、compiletime error   
     B、prints:1  
     C、prints:3  
     D、prints:8  
     答案选C  
     解析：
     https://www.nowcoder.com/questionTerminal/9dfb7470f3014166947cba07a69133c3
     
62. 下列选项中是正确的方法声明的是(复选题)  
A、protected abstract void f1();   
B、public final void f1() {}  
C、static final void fq(){}  
D、private void f1() {}  
答案选ABCD  
解析：A：抽象方法只可以被public 和 protected修饰；  
   B：final可以修饰类、方法、变量，分别表示：该类不可继承、该方法不能重写、该变量是常量  
   C：static final 可以表达在一起来修饰方法，表示是该方法是静态的不可重写的方法  
   D：private 修饰方法（这太常见的）表示私有方法，本类可以访问，外界不能访问
   
63. 与InputStream流相对应的Java系统的“标准输入对象”是  
A、System.in 　　　 　B、System.out  
C、System.err　　　　D、System.exit()  
答案选A  
解析：A.标准输入 B.标准输出 C.错误输出 D.结束程序  

64. 有以下一段代码，请选择其运行结果  
    ```
    public class Spike
    {
        public static void main(String[] args)
        {
            Counter a = new Counter();
            System.out.println(a.increment());
            System.out.println(a.anotherIncrement());
            Counter b = new Counter();
            System.out.println(b.increment());
        }
    }
    class Counter
    {
        private static int count = 0;
        public int increment()
        {
            return count++;
        }
        public int anotherIncrement()
        {
            return ++count;
        }
    }
    ```
    A、1 1 1 　　　 　B、1 2 3  
    C、0 2 2 　 　　　D、0 2 0  
    答案选C

65. transient变量和下面哪一项有关  
A、Serializable 　　　 B、Cloneable  
C、Runnable 　 　　 　D、Throwable  
答案选A  
解析：序列化相关

66. 在JAVA中，假设A有构造方法A(int a)，
则在类A的其他构造方法中调用该构造方法和语句格式应该为  
A、this.A(x) 　　　 B、this(x)  
C、super(x) 　 　　D、A(x)  
答案选B  
解析：  
A.这是调用普通方法的写法  
C.这时显示调用父类构造方法  
D.调用静态方法  

67. jdk1.8中，下面有关java 抽象类和接口的区别，说法错误的是(复选题)  
A、抽象类可以有构造方法，接口中不能有构造方法  
B、抽象类中可以包含非抽象的普通方法，接口中的方法必须是抽象的，不能有非抽象的普通方法  
C、一个类可以实现多个接口，但只能继承一个抽象类  
D、接口中可以有普通成员变量，抽象类中没有普通成员变量  
答案选BD  
解析：
https://www.nowcoder.com/questionTerminal/a8f22c58957d4ade8b73468a7c153ce6

68. 下面的程序输出的结果是  
    ```
    public class A implements B {
            public static void main(String args[]) {
                int i;
                A a1 = new A();
                i = a1.k;
                System.out.println("i=" + i);
            }
        }
    
        interface B {
            int k = 10；
    
        }
    ```
    A、i=0 　　　　　 B、i=10  
    C、i=true 　 　　 D、程序有编译错误  
    答案选B  
    解析：在接口里面的变量默认都是public static final 的，它们是公共的,静态的,最终的常量.
    相当于全局常量，可以直接省略修饰符。实现类可以直接访问接口中的变量
    
69. 对于子类的构造函数说明，下列叙述中错误的是  
A、子类不能继承父类的无参构造函数。  
B、子类可以在自己的构造函数中使用super关键字来调用父类的含参数构造函数，但这个调用语句必须是子类构造函数的第一个可执行语句。  
C、在创建子类的对象时，若不含带参构造函数，将先执行父类的无参构造函数，然后再执行自己的无参构造函数。  
D、子类不但可以继承父类的无参构造函数，也可以继承父类的有参构造函数。  
答案选D  
解析：构造函数不能被继承，构造方法只能被显式或隐式的调用。

70. 有一个源代码，只包含import java.util.* ; 这一个import语句，下面叙述正确的是  
A、只能写在源代码的第一句  
B、可以访问java/util目录下及其子目录下的所有类  
C、能访问java/util目录下的所有类，不能访问java/util子目录下的所有类  
D、编译错误  
答案选C  
解析：导入java.util.*不能读取其子目录的类，因为如果java.util里面有个a类，java.util.regex里面也有个a类，
我们若是要调用a类的方法或属性时，应该使用哪个a类呢。所以应该选C

71. 下列哪个选项是正确计算42度（角度）的余弦值  
A、double d=Math.cos（42）  
B、double d=Math.cosine（42）  
C、double d=Math.cos（Math.toRadians（42））  
D、double d=Math.cos（Math.toDegrees（42））  
答案选C  
解析：计算余弦值使用Math类的cos()方法，toRadians()是将角度转换为弧度，
toDegrees()是将弧度转换为角度

72. 下面哪种情况会导致持久区jvm堆内存溢出  
A、循环上万次的字符串处理  
B、在一段代码内申请上百M甚至上G的内存  
C、使用CGLib技术直接操作字节码运行，生成大量的动态类  
D、不断创建对象  
答案选C  
解析：
https://www.nowcoder.com/questionTerminal/1999635c228d49be84eb7623108be35e

73. 哪些不是 Java 的数据类型(复选题)  
A、int 　　　　　B、String  
C、*point　 　　D、union  
答案选CD  
解析：题目是说数据类型，并没有说基本数据类型，
所有包括了引用数据类型，String为字符串类，属于引用数据类型

74. 下面哪些接口直接继承自Collection接口(复选题)  
A、List 　　　　　B、Map  
C、Set　　　　　D、Iterator  
答案选AC  
解析：Collection是继承Iterator接口  
![Z99ZsP.png](https://s2.ax1x.com/2019/06/22/Z99ZsP.png)

75. 在jdk1.5之后，下列 java 程序输出结果为  
    ```
    int i=0;
    Integer j = new Integer(0);
    System.out.println(i==j);
    System.out.println(j.equals(i));
    ```
    A、true,true　　　 　B、true,false  
    C、false,true　　　　D、false,false  
    答案选A  
    解析：自动拆装箱JDK需在1.5上，  
    i==j ，这个是基本类型与 Integer 的比较， j 会自动拆箱成 int 类型，然后比较的是值。因此返回真。  
    j.equals(i) ，调用 equals 方法后，这个 i 会自动装箱成 Integer 类型，然后再比较值，所以也返回真。
    
76. given the following code,what will be the output
    ```
    class Value{
        public int i=15;
    }
    public class Test{
        public static void main(String argv[]){
            Test t=new Test( );
            t.first( );
        }
     
    public void first( ){
        int i=5;
        Value v=new Value( );
        v.i=25;
        second(v,i);
        System.out.println(v.i);
    }
     
    public void second(Value v,int i){
        i = 0;
        v.i = 20;
        Value val = new Value( );
        v = val;
        System.out.println(v.i+" "+i);
       }
    }

    ```
    A、15 0 20　　　　B、15 0 15  
    C、20 0 20　　　　D、0 15 20  
    答案选A  
    解析：给我绕蒙了。亏我一直对c语言的指针学得很好，到了java这边就麻木不再考虑地址的问题了。
    认真考虑值传递和地址传递就能做出来了。second的v.i=20修改的是first里的v，然后后面的v=val
    这里之后，就跟first.v没什么关系了，所以first.v的值最终是20
    
77. 输入流将数据从文件，标准输入或其他外部输入设备中加载道内存，
在 java 中其对应于抽象类（）及其子类  
A、java.io.InputStream  
B、java.io.OutputStream  
C、java.os.InputStream  
D、java.os.OutputStream  
答案选A  

78. 下面有关java final的基本规则，描述错误的是  
A、final修饰的类不能被继承  
B、final修饰的成员变量只允许赋值一次，且只能在类方法赋值  
C、final修饰的局部变量即为常量，只能赋值一次。  
D、final修饰的方法不允许被子类覆盖  
答案选B  
解析：final修饰的成员变量为基本数据类型是，在赋值之后无法改变。当final
修饰的成员变量为引用数据类型时，在赋值后其指向地址无法改变，但是对象内容还是可以改变的。  
final修饰的成员变量在赋值时可以有三种方式。
1、在声明时直接赋值。2、在构造器中赋值。3、在初始代码块中进行赋值。

79. list是一个ArrayList的对象，哪个选项的代码填到//todo 
delete处，可以在Iterator遍历的过程中正确并安全的删除一个list中保存的对象？  
    ```
    Iterator it = list.iterator();
    int index = 0;
    while (it.hasNext())
    {
        Object obj = it.next();
        if (needDelete(obj))  //needDelete返回boolean，决定是否要删除
        {
            //todo delete
        }
        index ++;
    }
    ```
    A、it.remove();  
    B、list.remove(obj);  
    C、list.remove(index);  
    D、list.remove(obj,index);  
    答案选A  
    解析：
    https://www.nowcoder.com/questionTerminal/b41c88359c8a4d69a35c2f37400e49f0
    
80. 在JAVA中，下列哪些是Object类的方法(复选题)  
A、synchronized()  
B、wait()  
C、notify()  
D、notifyAll()  
E、sleep()  
答案选BCD  
解析：synchronized是java关键字，sleep是Thread类的方法
   
81. A 派生出子类 B ， B 派生出子类 C ，并且在 Java 源代码中有如下声明  
    ```
    A  a0=new  A();
    
    A  a1 =new  B();
    
    A  a2=new  C();
    
    哪个说法是正确的
    ```
    A、只有第1行能通过编译  
    B、第1、2行能通过编译，但第3行编译出错  
    C、第1、2、3行能通过编译，但第2、3行运行时出错  
    D、第1行、第2行和第3行的声明都是正确的  
    答案选C

82. 定义有StringBuffer s1=new StringBuffer(10);s1.append(“1234”)
则s1.length()和s1.capacity()分别是多少  
A、4   10 　　 　　B、4   4  
C、10  10　 　  　D、10  4  
答案选A  
解析：length 返回当前长度，如果字符串长度没有初始化长度大，capacity返回初始化的长度。  
如果append后的字符串长度在初始化长度和初始化长度的两倍+2之间，capacity返回初始化长度的两倍+2
如果append后的字符串长度超过初始化长度的两倍+2后，capacity返回增长后的长度

83. 以下方法，哪个不是对add方法的重载  
    ```
    public class Test
    {
        public void add( int x,int y,int z){}
    }
    ```
    A、public int add(int x,int y,float z){return 0;}  
    B、public int add(int x,int y,int z){return 0;}  
    C、public void add(int x,int y){}  
    D、以上都不是  
    答案选B  
    解析：方法重载是指在一个类中定义多个同名的方法，
    但要求每个方法具有不同的参数的类型或参数的个数。

84. 假定AB为一个类，则执行 “AB ab = new AB(a,5);”语句时将自动调用该类的  
A、带参构造函数　　　　B、无参构造函数  
C、拷贝构造函数　　　　D、重载赋值运算  
答案选A

85. 如果一个接口Glass有个方法setColor()，
有个类BlueGlass实现接口Glass，则在类BlueGlass中正确的是  
A、protected void setColor() { …}  
B、void setColor() { …}  
C、public void setColor() { …}  
D、以上语句都可以用在类BlueGlass中  
答案选C  
解析：子类的权限不能比父类更低  

86. JVM内存不包含如下哪个部分  
A、Stacks　　　　B、PC寄存器  
C、Heap　　　　　D、Heap Frame  
答案选D  
解析：
https://www.nowcoder.com/questionTerminal/34a92a7e42a84f048491e9339631891a

87. 有以下一个对象
    ```
    public class DataObject implements Serializable{
    private static int i=0;
    private String word=" ";
    public void setWord(String word){
        this.word=word;
    }
    public void setI(int i){
        Data0bject. i=I;
     }
    }
    ```
    创建一个如下方式的DataObject
    ```
    DataObject object=new Data0bject ( );
    object. setWord("123");
    object. setI(2);
    ```
    将此对象序列化为文件，并在另外一个JVM中读取文件，进行反序列化，
    请问此时读出的Data0bject对象中的word和i的值分别为  
    A、"", 0　　　　 B、"", 2  
    C、"123", 2　　　　　D、"123", 0  
    答案选D  
    解析：序列化保存的是对象的状态，静态变量属于类的状态，
    因此，序列化并不保存静态变量。所以i是没有改变的
    

## 判断题
1. abstract和final可以同时作为一个类的修饰符  
答案：错误  
解析：abstract修饰一个类，这个类肯定可以被继承，
但是final类是不能继承的，所以有矛盾，肯定不能同时用 

2. 如果一个文件中声明了一个public类，那么该文件名必须和外部类名保持一致。(包括大小写)  
答案：正确  
解析： 公共外部类必须与源文件名一致，且一个源文件只能有一个公共外部类。

3. 可以把任何一种数据类型的变量赋给Object类型的变量  
答案：正确  
解析：
对象类型的不必多说可以赋值；而八大基础数据类型会自动装箱后赋值给Object，
所以编译运行都不会报错

4. 构造方法用于创建类的实例对象，构造方法名应与类名相同，返回类型为void  
答案：错误  
解析：
构造方法和普通方法的区别，只有权限修饰和方法名（和类名相同），
没有返回值，它不能返回类型，包括void!!

5. 一个类的构造器不能调用这个类中的其他构造器  
答案：错误  
解析：this(x)，这种形式的调用就ok  

6. 接口不能扩展（继承）多个接口  
答案：错误  
解析：类是单继承，但接口可以多继承  

7. 不考虑反射机制，一个子类显式调用父类的构造器必须用super关键字  
答案：正确  

8. 类方法中可以直接调用对象变量  
答案：错误  
解析：静态方法中不能直接调用对象的变量，但可以通过创建对象来调用，
因为静态方法在类加载时就初始化，对象变量需要在新建对象后才能使用

9. Java的跨平台特性是指它的源代码可以在多个平台运行  
答案：错误  
解析：语言跨平台是编译后的文件跨平台，而不是源程序跨平台。Java源代码首先经过编译器生成字节码，
即class文件，该class文件与平台无关，而class文件经过解释执行之后翻译成最终的机器码，这是平台相关的。

10. 内部类（也叫成员内部类）可以有4种访问权限  
答案：正确  
解析：
https://www.nowcoder.com/questionTerminal/fdaecbf8358e41db9d087be7a2babce1
## 填空题  
1. 如果定义一种表达式结构：(+ 6 3)的值为9，(- 6 3)的值为3，(* 6 3)的值为18，(/ 6 3)的值为2；那么对于表达式(* (- 
16 (* 3 2 2 )) (+ 5 (/ 6 (- 5 3))))输出的结果为____。  
答案：32
