# JavaWeb

## 选择题(默认单选，多选会有标记)  
1. 要在session对象中保存属性，可以使用以下哪个语句  
A、session.getAttribute(“key”，”value”)  
B、session.setAttribute(“key”，”value”)  
C、session.setAttribute(“key”)  
D、session.getAttribute(“key”)  
答案选B

2. 在J2EE中，使用Servlet过滤器，需要在web.xml中配置()元素(复选题)  
A、\<filter>  
B、<filter-mapping>  
C、<servlet-filter>  
D、<filter-config>  
答案选AB  

3. Servlet接口的方法有哪些  
A、doGet方法  
B、doPost方法 
C、init方法  
D、forward方法  
答案选C  
解析：doGet和doPost是HttpServlet中的方法；forward是RequestDispatcher的方法 

4. How should servlet developers handle the HttpServlet’s service() methond 
when extending HttpServlet  
A、They should override the service()method in most cases  
B、They should call the service()method from doGet()or doPost()  
C、They should call the service()method from the init()method  
D、They should override at least one doXXX()method(such as doPost())  
答案选D  
解析：
https://www.nowcoder.com/questionTerminal/9ed5f1893de946149da2d0d602d97c70

5. 在Servlet里，能实现重定向的方法有  
A、运用javax.servlet.http.HttpServletRequest接口的sendRedirect方法  
B、运用javax.servlet.http.HttpServletResponse接口的sendRedirect方法  
C、运用javax.servlet.RequestDispatcher接口的forward方法  
D、运用javax.servlet.ResponseDispatcher接口的forward方法  
答案选B  
解析：
https://www.nowcoder.com/questionTerminal/beccf26c0c8f439c97b050945fa6ee6b

6. 在Web应用程序的文件与目录结构中，web.xml是放置在()中  
A、WEB-INF目录  
B、conf目录   
C、lib目录  
D、classes目录  
答案选A  

7. JSP 表达式的写法  
A、<% expression %>　　　B、<=% expression %>   
C、<%= expression %>　　 D、\<expression/>  
答案选C  
解析：
(1)<%...%>：可以插入一些语句。  
(2)<%! ...  %>：只能放置全局变量、全局常量、类、函数。  
(3)<%= ... %>：只能放置一个变量、常量。

8. 在Web应用程序中，(    )负责将HTTP请求转换为HttpServletRequest对象  
A、Servlet对象　　　B、HTTP服务器   
C、Web容器　　　　 D、JSP网页  
答案选C
