public abstract class InPlaceSorts {
    private int[] list1;

    public static void insertionSort(int[] list1)
    {
        int n = list1.length;
        System.out.println("");
        System.out.println("");
        System.out.println("Unsorted: ");

        for (int i=0; i<list1.length; i++)
        {
            System.out.print(list1[i]+" ");
        }

        for (int i=1; i<n; ++i)
        {
            int key = list1[i];
            int j = i-1;

            while (j>=0 && list1[j] > key)
            {
                list1[j+1] = list1[j];
                j = j-1;
            }
            list1[j+1] = key;
        }

        System.out.println("");
        System.out.println("Sorted: ");
        for (int i=0; i<list1.length; i++)
        {
            System.out.print(list1[i]+ " ");
        }
        System.out.println("");

    }
    public static void bubbleSort(String[] list2)
    {
        int swaps=1;
        String stor="";
        System.out.println("");
        System.out.println("");
        System.out.println("Unsorted: ");

        for (int i=0; i<list2.length; i++)
        {
            System.out.print(list2[i]+" ");
        }
        while (swaps!=0)
        {
            swaps=0;
            for (int i=0; i<list2.length; i++)
            {
                if (i==list2.length-1)
                {
                    try
                    {
                        list2[i+1]="de";
                    }
                    catch(ArrayIndexOutOfBoundsException e)
                    {
                        break;
                    }
                }
                if (list2[i].compareTo(list2[i+1])>0)
                {
                    stor=list2[i];
                    list2[i]=list2[i+1];
                    list2[i+1]=stor;
                    swaps++;
                }
            }
        }
        System.out.println("");
        System.out.println("Sorted: ");
        for (int i=0; i<list2.length; i++)
        {
            System.out.print(list2[i]+ " ");
        }
        System.out.println("");
    }

    public static void selectionSort(double[] list3)
    {
        System.out.println("");
        System.out.println("");
        System.out.println("Unsorted: ");
        for (int i=0; i<list3.length; i++)
        {
            System.out.print(list3[i]+" ");
        }

        for (int i = 0; i < list3.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < list3.length; j++)
                if (list3[j] < list3[index])
                    index = j;

            double smallerNumber = list3[index];
            list3[index] = list3[i];
            list3[i] = smallerNumber;
        }

        System.out.println("");
        System.out.println("Sorted: ");
        for (int i=0; i<list3.length; i++)
        {
            System.out.print(list3[i]+ " ");
        }
        System.out.println("");

    }
}
