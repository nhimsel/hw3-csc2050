public class Main
{
	public static void main(String[] args) 
	{
	    Sorter s = new Sorter(10);
	    s.displayCurrentStateOfArray();
	    s.mergeSort();
	    s.displayCurrentStateOfArray(); //should be sorted once you implement mergesort
	}
}
