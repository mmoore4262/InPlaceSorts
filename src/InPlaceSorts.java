public abstract class InPlaceSorts {
    private int[] list1;

    public static void insertionSort(int[] list1)
    {

    }
    public static void bubbleSort(int[] list1)
    {
        int swaps=1;
        int stor=0;
        System.out.println("Unsorted: ");

        for (int i=0; i<list1.length; i++)
        {
            System.out.print(list1[i]+" ");
        }

        while (swaps!=0)
        {
            swaps=0;
            for (int i=0; i<list1.length; i++)
            {
                if (i==list1.length-1)
                {
                    try
                    {
                        list1[i+1]=0;
                    }
                    catch(ArrayIndexOutOfBoundsException e)
                    {
                       break;
                    }
                }
                if (list1[i]>list1[i+1])
                {
                    stor=list1[i];
                    list1[i]=list1[i+1];
                    list1[i+1]=stor;
                    swaps++;
                }
            }
        }
        System.out.println("");
        System.out.println("Sorted: ");
        for (int i=0; i<list1.length; i++)
        {
            System.out.print(list1[i]+ " ");
        }
    }
    public static void selectionSort(int[] list1)
    {
        int store=0;
        int swaps=1;
        int previousLowestIndex=list1[0];
        int currentLowestIdx=list1[0];
        int currentLowestVal=list1[0];
        while (swaps!=0)
        {
            for (int i=0; i<list1.length; i++)
            {
                if (currentLowestIdx>list1[i])
                {
                    currentLowestVal=list1[i];
                    currentLowestIdx=i;
                }
            }
            list1[0 ]=currentLowestIdx;


        }
    }
}
