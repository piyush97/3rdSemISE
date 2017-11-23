package p1;
//Same package but NOT A DERIVED/RELATED Class Example
class SamePackage{
	SamePackage()
	{	
		Protection p=new Protection();
		System.out.println("Same package constructor");
		System.out.println("n="+p.n);
		//class only
		System.out.println("n_pri="+p.n_pri);//error as it is private and can't be used in the derived class
		System.out.println("n_pro="+p.n_pro);
		System.out.prinln("n_pub"+p.n_pub);
	}
}