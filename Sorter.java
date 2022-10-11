public class Sorter{
    void sort(int arr[]){
        insertionSort(arr);
    }

    void insertionSort(int arr[]){
            int i, j, temp;
                for (i = 1; i < arr.length; i++)
                {
                    j = i - 1;
                    while (j >= 0 && arr[j] < arr[i] )
                    {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        i=j;
                        j--;
            
                    }
                }
            for(int x=0; x<arr.length;x++){
                System.out.println(arr[x]);   
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