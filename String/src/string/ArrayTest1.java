package string;
 
public class ArrayTest1 {
	public static void main(String[] args) {
		W b=new W();
		String str = new String("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行");
		try {
			b.arr(str);
			int index=0;
			int count=0;
			String findStr="姐";
			while((index=str.indexOf(findStr,index))!=-1) {
				System.out.println(str.charAt(index)+" ");
				index+=findStr.length();
				count++;
			}
			
		}
			
			
		catch(Exception e) {
			System.out.println("不存在");
			
		}
		
	}
	
}
