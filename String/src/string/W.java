package string;

public class W {
	
	public void arr(String a) {
		int x=0;
		int y=7;
		int w=14;
		int m;
	String s[]=new String[36];
	
	for(int i=0;i<s.length;i++) {
		s[i]=a.substring(x,y);
		m=i+1;
		s[m]=a.substring(y,w);
		System.out.println(s[i]+"£¬"+s[m]+"¡£"+"\n");
		x=x+14;
		y=y+14;
		w=w+14;
		try
		{
			//System.out.println(str);
			s[m]=a.substring(y,w);
		}
		catch(Exception e)
		{
			System.out.println("³¬¹ýÈÝÁ¿£¡");
		}
	}
	}

	
}
