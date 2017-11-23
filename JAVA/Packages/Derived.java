package p1;
//Same Package but derived or Related class example
class Derived extends Protection
{
	Derived()
	{
		System.out.println("Derived constructor");
		System.out.println("n="+n);
		//class only
		System.out.println("n_pri="+n_pri);//error as it is private and can't be used in the derived class
		System.out.println("n_pro="+n_pro);
		System.out.prinln("n_pub"+n_pub);
	}

}