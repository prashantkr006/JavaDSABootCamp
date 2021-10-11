static void selectionSort (int[] arr){
        
        for(int inl = 0; inl < arr.length - 1; inl++){
            int temp;
            int min = arr[inl];
            int count = 0;
                for(int i = inl+1; i < arr.length; i++){
                    if(arr[i] < min){
                        min = arr[i];
                        count = i;
                    }
                    
                }
               temp = arr[inl];
                arr[inl] = min;
                arr[count] = temp;
        }
    }
