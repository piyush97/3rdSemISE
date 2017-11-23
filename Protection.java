package p1;
public class Protection{
	int n=1;//default access modifier

	private int n_pri=2;//private access modifier
	protected int n_pro=3;//protected access modifier
	public int n_pub=4;//public
public Protection()
{
	System.out.println("Base Constructor");
	System.out.println("n="+n);
	System.out.println("n_pri="+n_pri);
	System.out.println("n_pro="+n_pro);
	System.out.println("n_pub="+n_pub);
}
}