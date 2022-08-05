package assignment_string;

public class remove_first 
{
	public void input(String str)
	{
		str=str.substring(1);
		System.out.println("remove first occureance");
		System.out.println(str);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		remove_first ob= new remove_first();
		ob.input("anjali");
	}

}