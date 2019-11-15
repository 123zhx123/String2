# String2
计181 张红霞 2018310394
实验四 字符串实验
实验目的
掌握字符串String及其方法的使用
掌握异常处理结构
业务要求
内容：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：

1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.	允许提供输入参数，统计古诗中某个字或词出现的次数
3.	考虑操作中可能出现的异常，在程序中设计异常处理程序
输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行
<未完，待续>
输出：
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
…………

注意： 输入的内容，利用main方法中的args数组传递
1.	写清实验题目
(1)	撰写自己的解题思路
1 用创建main方法
public static void main(String[] args) {}
2 把String类型诗句用数组表示
3 分别创建四个变量，奇数加“，”偶数加“。”
4 利用public int indexof（String str)查找字符并计算出现次数
5 分别对可能出现异常的地方进行异常处理
try{}
catch(Exception e){}
(2)	根据思路上机编程并调试代码（记录调试过程，总结出现的问题与解决的办法）
1 出现字符容量溢出状况
利用try处理
(3)	给出最终正确的程序完整代码，并截图程序输出
汉皇重色思倾国，御宇多年求不得。

杨家有女初长成，养在深闺人未识。

天生丽质难自弃，一朝选在君王侧。

回眸一笑百媚生，六宫粉黛无颜色。

春寒赐浴华清池，温泉水滑洗凝脂。

侍儿扶起娇无力，始是新承恩泽时。

云鬓花颜金步摇，芙蓉帐暖度春宵。

春宵苦短日高起，从此君王不早朝。

承欢侍宴无闲暇，春从春游夜专夜。

后宫佳丽三千人，三千宠爱在一身。

金屋妆成娇侍夜，楼宴罢醉和春姊。

妹弟兄皆列士可，怜光采生门户遂。

令天下父母心不，重生男重生女骊。

宫高处入青云仙，乐风飘处处闻缓。

歌慢舞凝丝竹尽，日君王看不足渔。

阳鼙鼓动地来惊，破霓裳羽衣曲九。

超过容量！
不存在
(2)	小结并分析实验结果
这次实验主要是针对于关于String类的基本操作，可分为以下几类：
　　　　1、基本操作方法 
　　　　2、字符串比较 
　　　　3、字符串与其他数据类型之间的转换 
　　　　4、字符与字符串的查找 
　　　　5、字符串的截取与拆分 
　　　　6、字符串的替换与修改
    异常的处理：
    1 定义一个方法的时候可以使用throws关键字抛出异常，在这里需要注意的是使用throws声明的方法表示此方法不处理异常，而是交给方法的调用处对异常进行处理。
    2 通过try、catch捕获异常
try{
// 程序代码
}catch(ExceptionName e1){
//Catch 块
}
这次试验表面上看起来不难，但实际操作对于我还是不简单的。
    
