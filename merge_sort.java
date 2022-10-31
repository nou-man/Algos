    package merge;



import java.util.Scanner; import java.util.Random;
public class Merge {
private int[] numbers; private int[] c;
private int number;

public void sort(int[] values) {	// check for empty or null array if (values ==null || values.length==0){
return;

}

this.numbers = values; number = values.length; this.c = new int[number]; mergesort(0, number - 1);
}

private void mergesort(int low, int high) {

// int i = low, j = high;

// Get the pivot element from the middle of the list if (low<high)
{

int mid = (low + (high))/2;

// Recursion
 
mergesort(low, mid); mergesort(mid+1, high); mergearray( low, mid, high);
}

}

private void mergearray(int low,int mid,int high)	{ int i=low; int j=mid+1; int k =low;
while(i<=mid && j<=high)

{

if( numbers[i] < numbers[j]) c[k++]= numbers[i++];
else

c[k++]=numbers[j++];

}

while(i<=mid) c[k++]=numbers[i++];
while (j<=high) c[k++]=numbers[j++];
for(i=low;i<=high;i++) numbers[i]= c[i];


}

public static void main(String[] args) { Merge sorter = new Merge();
int[] numbers; int number;	int[] c; Scanner scan =new Scanner(System.in); System.out.println("enter size of the array"); number =scan.nextInt();
 
numbers=new int[number]; System.out.println("The elements of the array"); Random random = new Random();
for(int i=0;i<number;i++)

numbers[i]=Math.abs(random.nextInt(5000)); for(int i=0;i<number;i++)
System.out.print( "\t" + numbers[i]);	System.out.println(); long startTime =System.currentTimeMillis();
sorter.sort(numbers);

long stopTime =System.currentTimeMillis(); long elapsedTime= stopTime-startTime;
for(int i:numbers){

System.out.print(i);	System.out.print(" ");

}

System.out.println(); System.out.println("Time taken"); System.out.println(elapsedTime);
}

}

  
