abstract class Shirt {
 int size;
 float price;
 protected String color;
 Shirt(int s, float p,String co)
 {
	 size = s;
	 price = p;
	 color =co;
 }
 abstract String getColor();
 abstract void putColor(String st);
 	
}

final class PullOver extends Shirt
{
	boolean has_hood;
	boolean has_stripes;
	PullOver(int s, float p,String co,boolean b1, boolean b2)
	{
		super(s,p,co);
	    has_hood = b1;
	    has_stripes = b2;
	}
	String getColor()
	{
	return color;	
	}
	
	void putColor(String s1)
	{
	color = s1;	
	}
}
class FormalShirt extends Shirt
{
	boolean has_fullsleeves;
	boolean has_stripes;
	FormalShirt(int s, float p,String co,boolean b1, boolean b2)
	{
		super(s,p,co);
	    has_fullsleeves = b1;
	    has_stripes = b2;
	}
	String getColor()
	{
	return color;	
	}
	
	void putColor(String s1)
	{
	color = s1;	
	}
	
}

class PartyWear extends FormalShirt
{
	boolean needs_coat;
	boolean needs_tie;
	String trouser_color;
	PartyWear(int s, float p,String co,boolean b1, boolean b2,boolean nc,boolean nt,String tc)
	{
		super(s,p,co,b1,b2);
		needs_coat = nc;
		needs_tie = nt;
		trouser_color =tc;
	}
}
public class MainClass
{
	public static void main(String args[])
	{
		
		
	}
}
