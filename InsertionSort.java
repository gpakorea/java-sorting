// InsertionSort.java

public class InsertionSort extends Sorts {
  
  // instance variables
  private int[] insertion = new int[12];
  private String name;
  
  // constructor
  public InsertionSort() {
    insertion = super.array;
    name = "Insertion";
  }
  
  // methods
  public void sort() {
    // Timing: BEST = O(n); AVE/WORST = O(n^2)
    
    int itemToInsert, j;
    boolean keepLooping;
    // On nth pass, insert item n into correct position
    
    for( int n = 1; n < insertion.length; n++ ) {
      
      // Go backwards through the list, look for the slot to insert n
      itemToInsert = insertion[n];
      j = k-1;
      keepLooping = true;
      
      while( (j>=0) && keepLooping ) {
        // Write code FRIDAY
      }
    }
    
  } // END sort()
  
} // END InsertionSort