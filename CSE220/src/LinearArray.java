public class LinearArray {
    public static void main(String [] args){
        int [] a = {10, 20, 30, 40, 50, 60};

        System.out.println("\n///// TEST 01: Copy Array example /////");
        int [] b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }

        System.out.println("\n///// TEST 02: Print Reverse example /////");
        printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 }
        printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 }


        System.out.println("\n///// TEST 03: Reverse Array example /////");
        reverseArray(b);
        printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 }


        System.out.println("\n///// TEST 04: Shift Left k cell example /////");
        b = copyArray(a, a.length);
       shiftLeft(b,3);
        printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 }

        System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }
        rotateLeft(b,3);
        printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 }

        System.out.println("\n///// TEST 06: Shift Right k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }
        shiftRight(b,3);
        printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 }

        System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }
        rotateRight(b,3);
        printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 }


        System.out.println("\n///// TEST 08: Insert example 1 /////");

        b = copyArray(a, a.length);
        printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 }
         insert(b,6, 70, 2); // This Should Print: No space Left
        //System.out.println(bol); // This Should Print: false
        printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 }

        System.out.println("\n///// TEST 09: Insert example 2 /////");
        int [] c = {10, 20, 30, 40, 50, 0, 0};
        printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
        insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6
        //System.out.println(bol); // This Should Print: true
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 }

        System.out.println("\n///// TEST 10: Insert example 3 /////");
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 }
        insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7
        //System.out.println(bol); // This Should Print: true
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 }

        System.out.println("\n///// TEST 11: Remove example 1 /////");

        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 }
        removeAll(c,7,90);
        //System.out.println(bol); // This Should Print: false
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 }

        System.out.println("\n///// TEST 12: Remove example 2 /////");
        printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 }
        removeAll(c,7,70);
        //System.out.println(bol); // This Should Print: true
        printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }



    }

    // Prints the contents of the source array
    public static void printArray(int [] source){
        for(int i=0;i<source.length;i++){
            System.out.print(source[i]+" ");
        }
        System.out.println();

    }

    // Prints the contents of the source array in reverse order
    public static void printReverse(int [] source){
        for(int i=source.length-1;i>=0;i--){
            System.out.print(source[i]+" ");
        }
        System.out.println();
    }

    // creates a copy of the source array and returns the reference of the newly created copy array
    public static int [] copyArray(int [] source, int len){
        int[]c=new int[len];
        for(int i=0;i<source.length;i++){
            c[i]=source[i];
        }
     return c;
    }

    // creates a reversed copy of the source array and returns the reference of the newly created reversed array
    public static void reverseArray(int [] source){
        int temp;
      for(int i=0,j=source.length-1;i<j;i++,j--){
          temp=source[i];
          source[i]=source[j];
          source[j]=temp;
      }

    }

    // Shifts all the elements of the source array to the left by 'k' positions
    // Returns the updated array
    public static void shiftLeft(int [] source, int k){
        int c=source.length;
        for(int j=0;j<k;j++) {

            for (int i = 0; i < c-1; i++)
                source[i] = source[i + 1];
            source[c-1]=0;
        }

    }

    // Rotates all the elements of the source array to the left by 'k' positions
    // Returns the updated array
    public static void  rotateLeft(int [] source, int k){
        int c=source.length;

        for(int i=0;i<k;i++){
            int temp= source[0];
            for(int j=1;j<c;j++) {
                source[j-1] = source[j];
            }
            source[c-1]=temp;

        }

    }

    // Shifts all the elements of the source array to the right by 'k' positions
    // Returns the updated array
    public static void shiftRight(int [] source, int k){
        int c=source.length;
        for(int i=0;i<k;i++){

            for(int j=1;j<c;j++) {
                source[c-j] = source[c-j-1];
            }
            source[0]=0;

        }

    }

    // Rotates all the elements of the source array to the right by 'k' positions
    // Returns the updated array
    public static void rotateRight(int [] source, int k){
        int c=source.length;

        for(int i=0;i<k;i++){
            int temp= source[c-1];
            for(int j=1;j<c;j++) {
                source[c-j] = source[c-j-1];
            }
            source[0]=temp;

        }
        //return null; // remove this line
    }

    /** @return true if insertion is successful; @return false otherwise
     * @param arr the reference to the linear array
     * @param size the number of elements that exists in the array. size<=arr.length
     * @param elem the element that is to be inserted
     * @param index the index in which the element is required to be inserted
     * if insertion is not successful due to lack space, print "No space Left"
     * if given index is invalid, print "Invalid Index"
     * if insertion is successful, print the 'Number of elements after insertion' is completed
     */
    public static void insert(int [] arr, int size, int elem, int index){
        if(size==arr.length){

            System.out.println("No space left");
            System.out.println("False");

        }
        else if(index<0||index>size){
            System.out.println("Invalid Index");
            System.out.println("False");

        }
        else{
            int temp=elem;
            for(int i=index;i<arr.length;i++){
                int temp2=arr[i];
                arr[i]=temp;
                temp=temp2;
            }
            System.out.println("Number of elements after insertion: "+(size+1));
            System.out.println("True");
        }



    }

    /**
     * removes all the occurences of the given element
     * @param arr the reference to the linear array
     * @param size the number of elements that exists in the array. size<=arr.length
     * @param elem the element to be removed
     * @return true if removal is successful; return false otherwise
     * if removal is successful, print the 'Number of elements after removal' is completed
     */
    public static void removeAll(int [] arr, int size, int elem) {
        int count=0;
        boolean b1=true;
        boolean b2=false;
       for(int i=0;i<size;i++) {
           if (arr[i] == elem) {
               count++;

           }
       }
        if(count==0)
            System.out.println(b2);

       if(count>0) {

           for (int incr = 1; incr <= count; incr++) {
               for (int i = 0; i < size; i++)
                   if (arr[i] == elem) {
                       for (int j = i; j < size - 1; j++)
                           arr[j] = arr[j + 1];
                       arr[size - 1] = 0;
                   }
           }
           System.out.println(b1);
           System.out.println("Number of elements "+(size-count));
       }

    }

}
