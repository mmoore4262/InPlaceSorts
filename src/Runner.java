public class Runner {
    public static void main(String[] args)
    {
        int inSize=30;
        int [] list1= new int[inSize];
        for(int i=0; i<inSize; i++)
        {
            list1[i]=(int)(Math.random()*10000);
        }
        //InPlaceSorts.insertionSort(list1);
        for(int i=0; i<inSize; i++)
        {
            list1[i]=(int)(Math.random()*10000);
        }
        InPlaceSorts.bubbleSort(list1);
        for(int i=0; i<inSize; i++)
        {
            list1[i]=(int)(Math.random()*10000);
        }
        InPlaceSorts.selectionSort(list1);
    }

}
