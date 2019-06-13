# 异常

## 选择题(默认单选，多选会有标记)  
1. throws的作用  
A、没有意义　　　　　　　　　B、表示后面的是方法的输出值  
C、表示方法可能会抛出意外　　D、方法的标志，每个方法都必须有  
答案选C

2. 关于异常处理机制的叙述正确的是  
A、catch部分捕捉到异常情况时，才会执行finally部分  
B、当try区段的程序发生异常时，才会执行finally部分  
C、当try区段不论程序是否发生错误及捕捉到异常情况，都会执行finally部分  
D、以上都是  
答案选C
解析：  
    ```
    finally中的代码是无论如何都会执行的。
    另外再说下，如果抛出异常，并且在catch中有return语句，
    这个return语句会先执行，执行之后将结果保存在缓存中。
    再去查看是否有finally，
    如果有finally就先执行finally语句，之后再返回缓存中的return值。
    如果finally中也有return，那么finally中的return会覆盖掉之前缓存的return，
    即最终会返回finally中的值。
    ```
    
3.