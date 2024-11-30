class MergeSortDemo {
    public static void printArray(int[] list){
        for(int i =0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
    public static void mergeSort(int[] list){
        if(list.length <= 1){
            return;
        }
        int[] a1 = new int[list.length/2];
        int[] a2 = new int[list.length - list.length/2];
        for(int i = 0; i < list.length/2; i++){
            a1[i] = list[i];
        }
        for(int i = 0; i < list.length-list.length/2; i++){
            a2[i] = list[list.length/2 + i];
        }
        mergeSort(a1);
        mergeSort(a2);
        int a1Index = 0, a2Index = 0;
        for(int i = 0; i < list.length; i++){
            if(a1Index < a1.length && a2Index < a2.length){
                if(a1[a1Index] < a2[a2Index]){
                    list[i] = a1[a1Index];
                    a1Index++;
                }
                else{
                    list[i] = a2[a2Index];
                    a2Index++;
                }
            }
            else if(a1Index < a1.length){
                list[i] = a1[a1Index];
                a1Index++;
            }
            else if(a2Index < a2.length){
                list[i]  = a2[a2Index];
                a2Index++;
            }
        }
    }
    public static void main(String[] args){
        int[] a = new int[]{9,8,5,2,3,4,1,7,10,6}; 
        int[] b = new int[]{7,3,4,1,2,8,9,6,5};
        mergeSort(a);
        printArray(a);
        System.out.println();
        mergeSort(b);
        printArray(b);
    }
    
}
