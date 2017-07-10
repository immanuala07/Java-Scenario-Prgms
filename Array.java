import java.io.*;

class Myarray
{
	public int a;
	 public int[] arr=new int[30];

	public Myarray(int a)
	{
	this.a=a;
	}

	public void readArray()throws IOException
	{
		//int i;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Array elements : ");
		for(int i=0;i<a;i++)
		{
		arr[i]=Integer.parseInt(br.readLine());
		}
	}

	public void displayArray()
	{
		System.out.println("The array elements are :\n");
		int i;
		for(i=0;i<a;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public int highestnumber()
	{
		int b,i;
		b=arr[0];
		for(i=0;i<a;i++)
		{
			if(b<arr[i])
			{
				b=arr[i];
			}
		}
		return b;
	}
// set PATH = "C:\Java\jdk1.7.0_67\bin;C:\Java\jdk1.7.0_67\lib";
	public int sum()
	{
		int b,nb,i,j,s;
		int t;
		////b=highestnumber();

		for(i=0;i<a-1;i++)
		{
			for(j=i+1;j<a;j++)
			{
				if(arr[i]<arr[j])
				{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}

			}
		}
		b=arr[1];

		for(i=1;i<a;i++)
		if(b!=arr[i])
		{
			b=arr[i];
			break;
		}


		s=arr[0]+b;
		return s;
	}


}


class Array
{
	public static void main(String arg[]) throws IOException
	{
		try
		{
			int b,s;
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the Size of the Array : ");
			int a=Byte.parseByte(br.readLine());

			Myarray m=new Myarray(a);

			m.readArray();
			m.displayArray();
			b=m.highestnumber();
			System.out.println("The highest No : "+b);
			s=m.sum();
			System.out.println("The Sum 1 & 2 highest No : "+s);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}
}
