package string;
 
public class ArrayTest1 {
	public static void main(String[] args) {
		W b=new W();
		String str = new String("������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ������������");
		try {
			b.arr(str);
			int index=0;
			int count=0;
			String findStr="��";
			while((index=str.indexOf(findStr,index))!=-1) {
				System.out.println(str.charAt(index)+" ");
				index+=findStr.length();
				count++;
			}
			
		}
			
			
		catch(Exception e) {
			System.out.println("������");
			
		}
		
	}
	
}
