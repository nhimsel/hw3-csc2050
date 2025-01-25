import java.util.Random;

public class Sorter
{
    private int[] array;
    
    public Sorter(int numberOfElements)
    {
        Random r = new Random();
        this.array = new int[numberOfElements];
        
        for(int i = 0; i < array.length; i++)
        {
            this.array[i] = Math.abs(r.nextInt() % 100);
        }
    }
    
    public void displayCurrentStateOfArray()
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    public void mergeSort()
    {
        this.mergeSort(0, this.array.length-1);
    }
    
    private void mergeSort(int begin, int end)
    {
        if (begin<end) //only mergeSort if begin is less than end (also makes sure that begin and and are different)
        {
            //find the center of the array
            int mid=begin+(end-begin)/2;

            //mergeSort
            mergeSort(begin,mid); //left half
            mergeSort(mid+1,end); //right half
        }

        //merge the two halves
        mergeStep(begin,end);
    }
    
    private void mergeStep(int begin, int end)
    {
        //make a temp array for storing sorted values
        int[] temp = new int[end-begin+1];
        
        //sort through values, add smallest to temp array
        for(int i=begin; i<=end; i++)
        {
            int lowest=array[i];
            int lowestPlacement=i;

            //compare every value to the currently known smallest
            for(int j=begin; j<=end; j++)
            {
                if (array[j]<lowest)
                {
                    lowest=array[j];
                    lowestPlacement=j;
                }
            }

            //add smallest value to temp
            temp[i-begin]=lowest;

            //set current smallest value to max to prevent it being used again
            array[lowestPlacement]=Integer.MAX_VALUE;
        }

        //push temp into the main array
        for(int i=begin; i<=end; i++)
        {
            array[i]=temp[i-begin];
        }
    }
}