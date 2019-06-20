# Spring全家桶

## 选择题(默认单选，多选会有标记)
1. 关于Spring MVC的核心控制器DispatcherServlet的作用，以下说法错误的是  
A、它负责处理HTTP请求   
B、加载配置文件  
C、实现业务操作  
D、初始化上下应用对象ApplicationContext  
答案选C  
解析：
https://www.nowcoder.com/questionTerminal/15a92560e4634f73a33933f2128c0743

2. 下面有关SPRING的事务传播特性，说法错误的是  
A、PROPAGATION_SUPPORTS：支持当前事务，如果当前没有事务，就以非事务方式执行   
B、PROPAGATION_REQUIRED：支持当前事务，如果当前没有事务，就抛出异常  
C、PROPAGATION_REQUIRES_NEW：新建事务，如果当前存在事务，把当前事务挂起  
D、PROPAGATION_NESTED：支持当前事务，新增Savepoint点，与当前事务同步提交或回滚  
答案选B  
解析：
https://www.nowcoder.com/questionTerminal/1c65d30e47fb4f59a5e5af728218cac4

3. 下面对spring对bean的生命周期的描述，描述错误的是  
A、如果Bean类有实现org.springframework.beans.factory.BeanFactoryAware接口，
工厂调用setBeanFactory()方法传入工厂自身   
B、在spring中，singleton属性默认是false，每次指定别名取得的Bean时都会产生一个新的实例  
C、可以在Bean定义文件中使用"init-method"属性，执行到这个阶段时，就会执行initBean()方法  
D、如果Bean类有实现org.springframework.beans.factory.DisposableBean接口，则执行他的destroy()
方法  
答案选B  
解析：
https://www.nowcoder.com/questionTerminal/368e4ea434824a24900320ce5ad17cdc

4. 下面有关spring事务，描述错误的是  
A、spring事务可以分为编程式事务和声明式事务     
B、spring提供了一个事务的接口 PlatformTransactionManager接口，针对不同的事务，
spring进行了不同的实现  
C、声明式事务最大的优点就是不需要通过编程的方式管理事务，这样就不需要在业务逻辑代码中掺杂事务管理的代码  
D、如果你的应用中存在大量事务操作，那么编程式事务管理通常是值得的  
答案选D  
解析：
https://www.nowcoder.com/questionTerminal/62f05cdaf74a4b35b32032d52fc100fa

5. 下面有关spring依赖注入说法错误的是  
A、IOC就是由spring来负责控制对象的生命周期和对象间的关系   
B、BeanFactory是最简单的容器，提供了基础的依赖注入支持  
C、ApplicationContext建立在BeanFactory之上，提供了系统构架服务  
D、如果Bean的某一个属性没有注入，ApplicationContext加载后，
直至第一次使用调用getBean方法才会抛出异常；而BeanFactory则在初始化自身时检验，
这样有利于检查所依赖属性是否注入  
答案选D  
解析：
https://www.nowcoder.com/questionTerminal/8d5313cc176545b99ccc5fcaf512abc2

6. 下面有关spring框架模块的描述，说法错误的是  
A、Spring Core：Core封装包是框架的最基础部分，提供IOC和依赖注入特性     
B、AOP模块提供了AOP（拦截器）机制，并提供常用的拦截器，供用户自定义和配置  
C、ORM模块提供了spring自己的实现，而且支持常用的Hibernate，ibtas，jdao等框架  
D、DAO模块Spring 提供对JDBC的支持，对JDBC进行封装，允许JDBC使用Spring资源，
并能统一管理JDBC事物，并不对JDBC进行实现  
答案选C  
解析：
https://www.nowcoder.com/questionTerminal/47eab405848d4de2b8ac4e5f26823028

7. Spring框架中的核心思想包括什么(复选题)  
A、依赖注入   
B、控制反转  
C、面向对象  
D、面向切面    
答案选ABD

8. 以下关于Spring的说法是正确(复选题)  
A、Spring 不能和Hibernate一样设置bean是否为延迟加载   
B、在Spring配置文件中，就可以设置Bean初始化函数和消亡函数  
C、属性注入只能是简单数据，构造方法注入可以是对象  
D、对象的设计应使类和构件之间的耦合最小  
答案选BD  
解析：
https://www.nowcoder.com/questionTerminal/eecc80438fab4c3ca41b48bdf3e5af76

9. 在Spring框架中获取连接池可以有哪些方式(复选题)  
A、DBCP数据源   
B、C3P0数据源  
C、Spring的数据源实现类(DriverManagerDataSource)  
D、获取JNDI数据源  
答案选ABCD  
解析：
https://www.nowcoder.com/questionTerminal/36c33ffaf862481491e825465b05952a  

10. 关于AOP错误的是  
A、AOP将散落在系统中的“方面”代码集中实现  
B、AOP有助于提高系统可维护性  
C、AOP已经表现出将要替代面向对象的趋势  
D、AOP是一种设计模式，Spring提供了一种实现  
答案选C  
解析：  
https://www.nowcoder.com/questionTerminal/653b88622c9f45f28a7fad711e8cdb6a

11. 下面有关spring的依赖注入，说法错误的是  
A、依赖注入通常有如下两种：设置注入和构造注入  
B、构造注入可以在构造器中决定依赖关系的注入顺序，优先依赖的优先注入  
C、当设值注入与构造注入同时存在时，先执行设值注入，再执行构造注入  
D、设值注入是指IoC容器使用属性的setter方法来注入被依赖的实例。这种注入方式比较简单、直观  
答案选C  
解析：
https://www.nowcoder.com/questionTerminal/a1644e2668f94ab78bfefa38808fb006

12. 下面哪一项对Servlet描述错误  
A、Servlet是一个特殊的Java类，它必须直接或间接实现Servlet接口  
B、Servlet接口定义了Servelt的生命周期方法  
C、当多个客户请求一个Servlet时，服务器为每一个客户启动一个进程  
D、Servlet客户线程调用service方法响应客户的请求  
答案选C  
解析：
https://www.nowcoder.com/questionTerminal/1cf64be2bacd4d09930c43faa12a3337

13. 下面关于Spring的说法中错误的是  
A、Spring是一系列轻量级Java EE框架的集合  
B、Spring中包含一个“依赖注入”模式的实现  
C、使用Spring可以实现声明式事务  
D、Spring提供了AOP方式的日志系统  
答案选D  
解析：
https://www.nowcoder.com/questionTerminal/9da4f69abb464d3fb7ea1083064c6774

14. spring的PROPAGATION_REQUIRES_NEW事务，下面哪些说法是正确的  
A、内部事务回滚会导致外部事务回滚  
B、内部事务回滚了，外部事务仍然可以提交  
C、外部事务回滚了，内部事务也跟着回滚  
D、外部事务回滚了，内部事务仍然可以提交  
答案选B  
解析：
https://www.nowcoder.com/questionTerminal/d3bf03d17e144988a1a0ba7ab67ea5fb

15. 下面关于spring mvc 和struts2的描述，错误的是  
A、spring mvc的入口是filter，而struts2是servlet  
B、spring mvc是基于方法的设计，而struts2是基于类的设计  
C、struts2有以自己的interceptor机制，spring mvc用的是独立的AOP方式  
D、spring mvc的方法之间基本上独立的，独享request response数据，struts2所有Action变量是共享的  
答案选A  
解析：
https://www.nowcoder.com/questionTerminal/cf803beb7e3346caa636e4eaa3a8c2e9

16. 下列关于Spring特性中IoC描述错误的是  
A、IoC就是指程序之间的关系由程序代码直接操控  
B、所谓“控制反转”是指控制权由应用代码转到外部容器，即控制权的转移  
C、IoC将控制创建的职责搬进了框架中，从应用代码脱离开来  
D、使用Spring的IoC容器时只需指出组件需要的对象，在运行时Spring的IoC容器会根据XML配置数据提供给它  
答案选A  
解析：
https://www.nowcoder.com/questionTerminal/d02f8b4995de4314b29756898d62377b

17. 下面有关spring DAO，描述错误的是  
A、Spring提供的DAO(数据访问对象)支持主要的目的是便于以标准的方式使用不同的数据访问技术。  
B、方便的事务管理: Spring的声明式事务管理力度是类级别  
C、异常包装:Spring能够包装Hibernate异常，把它们从CheckedException变为RuntimeException; 开发者可选择在恰当的层处理数据中不可恢复的异常，从而避免烦琐的 catch/throw 及异常声明  
D、Spring提供的DAO支持了JDBC、JDO和Hibernate  
答案选B  
解析：
https://www.nowcoder.com/questionTerminal/982a92bd679048a0bddc5a1f542fbe25

18. 对下面Spring声明式事务的配置含义的说明错误的是  
    ```
    <bean id="txProxyTemplate" abstract="true"
    class=
    "org.springframework.transaction.interceptor.TransactionProxyFactoryBean">
        <property name="transactionManager" ref="myTransactionManager" />
    <property name="transactionAttributes">      
     <props>
            <prop key="get*">PROPAGATION_REQUIRED,readOnly</prop>
             <prop key="*">PROPAGATION_REQUIRED</prop>
         </props>
    </property> 
    </bean>
    ```
    A、定义了声明式事务的配置模板  
    B、对get方法采用只读事务  
    C、缺少sessionFactory属性的注入  
    D、配置需要事务管理的bean的代理时，通过parent引用这个配置模板，代码如下  
    ```
    <bean id="petBiz" parent="txProxyTemplate">
             <property name="target" ref="petTarget"/>
    </bean>
    ```
    答案选C  
    解析： 
    https://www.nowcoder.com/questionTerminal/0ae7fe7ffb2345fba9c967eb18af0d5c