// SelectionArray.java

public class SelectionArray extends SortArray {
  
  // instance variables
  private int[] selection = new int[12];
  private String name;
  
  public SelectionArray() {
    selection = super.array;
    name = "selection";
  } // END constructor
  
  // methods
  public void selectionSort() {
    // Timing: ALL = O(n^2)
    // On every pass, put the next smallest value at the front of the array
    // Does not allow an early exit if the list becomes sorted on early pass
    
    int min, minIndex;
    
    for( int i = 0; i < selection.length; ++i ) {
      min = selection[i];
      minIndex = i;
      for ( int j = i+1; j < selection.length; ++j ) { // Find minimum
        if ( selection[j] < min ) {
          min = selection[j];
          minIndex = j;
        }
      }
      selection[minIndex] = selection[i];
      selection[i] = min;
    }
    
  } // END selectionSort()
  
} // END SelectionArray