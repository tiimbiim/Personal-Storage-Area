public class hw6_3
{

   public void selectionSort (int[] numbers)
   {
      int min, temp;

      for (int i = 0; i < numbers.length-1; i++)
      {
         min = i;
         for (int scan = i+1; scan < numbers.length; scan++)
            if (numbers[scan] > numbers[min])
               min = scan;

 
         temp = numbers[min];
         numbers[min] = numbers[i];
         numbers[i] = temp;
      }
   }

   public void insertionSort (int[] numbers)
   {
      for (int i = 1; i < numbers.length; i++)
      {
         int key = numbers[i];
         int p = i;

         while (p > 0 && numbers[p-1] < key)
         {
            numbers[p] = numbers[p-1];
            p--;
         }
            
         numbers[p] = key;
      }
   }


   public void insertionSort (Comparable[] objects)
   {
      for (int t = 1; t < objects.length; t++)
      {
         Comparable key = objects[t];
         int p = t;

         while (p > 0 && objects[p-1].compareTo(key) < 0)
         {
            objects[p] = objects[p-1];
            p--;
         }
            
         objects[p] = key;
      }
   }
}