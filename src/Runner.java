public class Runner {
    public static void main(String[] args)
    {
        int inSize=30;
        int [] list1= new int[inSize];
        String[] list2= new String [inSize];
        double[] list3= new double[inSize];
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0; i<inSize; i++)
        {
            list1[i]=(int)(Math.random()*10000);
        }
        InPlaceSorts.insertionSort(list1);
        for(int i=0; i<inSize; i++)
        {
            String stringStor=alphabet.substring((int)(Math.random()*25), alphabet.length()-1);
            list2[i]=stringStor;
        }
        InPlaceSorts.bubbleSort(list2);
        for(int i=0; i<inSize; i++)
        {
            list3[i]=(Math.random()*10000);
        }
        InPlaceSorts.selectionSort(list3);
    }

}
