static void binarySearch (int[] arr, int element){
        int start = 0;
        int end = arr.length - 1;
        
        while(end >= start) {
            int mid = (start + end)/2;
            
            if(arr[mid] == element)
            {
                System.out.println("element is at index " + mid);
                return;
            }
            
            else if (element > arr[mid]) {
                start = mid + 1;
            }
            else if(element < arr[mid]) {
                end = mid - 1;
            }
        }
        System.out.println("element not found");
    }
