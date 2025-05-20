package gitmay25;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		int a[] = {2,2,4,5,4,7};
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
				
			}a[j]=a[a.length-1];
		}
		for(int k=0;k<j;k++)
		{
			System.out.print(a[k]+ " ");
		}

	}

}
