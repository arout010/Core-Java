class Box
{
	int length,height,width;
	void getdata(int l,int h,int w)
	{
		length=l;height=h;width=w;
	}
	void show()
	{
		System.out.println("length: "+length);
		System.out.println("height: "+height);
		System.out.println("width: "+width);
	}
}
public class demo
{
	public static void main(String args[])
	{
		Box b=new Box();
		b.getdata(10,15,20);
		b.show();
		b=new Box();
		b.show();
	}
}