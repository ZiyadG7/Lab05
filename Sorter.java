public class Sorter{
    void insertionSort(int arr[]){
        int[] a = {100,12,31, 5, 4, 3, 2, 1 };
            int i, j, temp;
                for (i = 1; i < a.length; i++)
                {
                    j = i - 1;
                    while (j >= 0 && a[j] < a[i] )
                    {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        i=j;
                        j--;
            
                    }
                }
            for(int x=0; x<a.length;x++){
                System.out.println(a[x]);   
              }
            }
    }
    public static void main(String[] args) {
        
    }
    void SelectionSort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
}
}