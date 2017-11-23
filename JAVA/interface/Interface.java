//an interface is declared as PUBLIC only
interface Callback
{
	void Callback();
}
class Client implements Callback
//implements callback interface
{
public void Callback()
{
	System.out.println("Callback called with "+p);
}
 public static void main(String[] args)
  	{
		Client c=new Client();
		c.Callback();
	}
}