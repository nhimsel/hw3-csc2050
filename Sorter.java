import java.util.Random;

public class Sorter
{
    private int[] theArray;
    
    public Sorter(int numberOfElements)
    {
        Random r = new Random();
        this.theArray = new int[numberOfElements];
        
        for(int i = 0; i < theArray.length; i++)
        {
            this.theArray[i] = Math.abs(r.nextInt() % 100);
        }
    }
    
    public void displayCurrentStateOfArray()
    {
        for(int i = 0; i < theArray.length; i++)
        {
            System.out.print(theArray[i] + " ");
        }
        System.out.println("");
    }
    
    public void mergeSort()
    {
        this.mergeSort(0, this.theArray.length-1);
    }
    
    private void mergeSort(int begin, int end)
    {
        //HINT: there will be two separate calls to mergeSort below
        //one for the left half, one for the right half
        //onces BOTH finish, you can do the merge step.
    }
    
    private void merge(int being, int end)
    {
        
    }
}