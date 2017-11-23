package p2;
//example of different package related class
class Protection2 extends p1.Protection
{
	Protection2()
	{
		System.out.println("Derived other package constructor");
		System.out.println("n="+n);//default will not work as it is in different package but related class
		//class only
		System.out.println("n_pri="+n_pri);//error as it is private and can't be used in the derived class
		System.out.println("n_pro="+n_pro);
		System.out.prinln("n_pub"+n_pub);
	}
}
