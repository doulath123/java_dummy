package practice;

class calc
{
	int n1;
	int n2;
	int result;
	
	public void perform()
	{
		result=n1+n2;
	}
	
}

public class prc {
	public static void main(String[] a)
	{
		calc obj=new calc();
		obj.n1=5;
		obj.n2=6;
		obj.perform();
				
		System.out.print(obj.result);
	}

}
