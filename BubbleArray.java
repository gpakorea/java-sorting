// BubbleArray.java

public class BubbleArray extends SortArray {
  
  // instance variables
  private int[] bubble = new int[12];
  private String name;
  
  // constructor
  public BubbleArray() {
    // super();
    bubble = super.array;
    name = "Bubble";
  } 
  
  public void bubbleSort() {
    // Timing: BEST = O(n)  AVE = O(n^2)  WORST = O(n^2)
    // The largest value "bubbles" its way to the correct position on each pass
    System.out.println( "\nDoing " + name + " Sort: " );
    boolean continueLoop;
    
    do {
      continueLoop = false;
      for( int i = 0; i < array.length-1; i++ ) {
        if( array[i] > array[i+1] ) {
          // swap these values
          //swap( i, i+1 );
          int temp = array[i];
          array[i] = array[i+1];
          array[i+1] = temp;
          
          continueLoop = true;
        }
      }
    } while( continueLoop );
    
  } // END bubbleSort( int[] a )
  
} // END class BubbleArray