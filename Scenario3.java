import java.io.*;

class Sorter
{
	public int[] num =new int[105];

	public void readlist()throws IOException
	{
		int i;

		 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter the 100 Integers : \n");
		for(i=0;i<10;i++)
		{
			num[i]=Integer.parseInt(br.readLine());
		}
	}

	public void displaylist()
	{
		int i,n=0;
	//	n=indexofmin(0,9);
		
		System.out.println("The list : \n");
		for(i=0;i<10;i++)
		{
			System.out.println(" value ["+i+"] \t"+num[i]);
		}

	} 

	public void sort()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,j,temp,n;
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Enter the lower index:");
		byte l=Byte.parseByte(br.readLine());
		System.out.println("Enter the Higher index:");
		byte h=Byte.parseByte(br.readLine());

		n=indexofmin(l,h);
		System.out.println("Least number index : "+n);
	}

	int indexofmin(int startindex, int endindex)
	{
		int i,small;
		small=num[startindex];
		for(i=startindex;i<=endindex;i++)
		{
		//	System.out.println(startindex);

			if(num[i]>small)
			{
				small=num[i];
				break;
			}
		}
		return startindex;
	}
}

class Scenario3
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Sorter s =new Sorter();
		s.readlist();
		s.sort();
		s.displaylist();
		
	}
}