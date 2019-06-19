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