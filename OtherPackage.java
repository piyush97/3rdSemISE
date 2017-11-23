package p2;
//Example of different package 
class OtherPackage
{
	OtherPackage()
	{
		p1.Protection p=new p1.Protection();
		System.out.println("Other Package constructor");
		System.out.println("n="+p.n);//should not work as default doesn't work in different class different package
		//class only
		System.out.println("n_pri="+n_pri);//error as it is private and can't be used in the derived class
		System.out.println("n_pro="+n_pro);//error as it is protected and protected also doesn't work when using different package and unrelated class
		System.out.prinln("n_pub"+n_pub);
	}
}