public class ArrayGenric{
     static <T> void ArrayGenric(T array[]){
        
        for(T var:array){
            System.out.print(" "+var);
         }
    }
            public static void main(String args[]){

        Character array1[]={'A','D','I','T','Y','A'};
        Integer array2[]={1,2,3,4,5,6,7,8,9,20};
        printArray(array1);
         System.out.println();
       printArray(array2);
        
    }

    private static void printArray(Character[] array1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void printArray(Integer[] array2) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}