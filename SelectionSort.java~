// SelectionSort.java

public class SelectionSort extends Sorts {
  
  // instance variables
  private int[] selection = new int[12];
  private String name;
  
  // constructor
  public SelectionSort() {
    selection = super.array;
    name = "Selection";
  }
  
  // methods
  public void sort() {
    
    System.out.println( "Doing " + name + " Sort:" );
    int count=1;
    
    int minValue, minIndex;
    for( int i = 0; i < selection.length; ++i ) {
      
      System.out.print( "Step #" + count + " " );
      printArray();
      
      // Temp values to remember the lowest # and its index
      minValue = selection[i];
      minIndex = i;
      
      for( int j = i+1; j < selection.length; ++j ) { 
        
        System.out.print( "Step #" + count ); // Step #1-1
        printArray();
        
        // Resets the lowest # and index in the TEMP values
        // if necessary
        if( selection[j] < minValue ) {
          minValue = selection[j];
          minIndex = j;
        }
        
        ++count;
        
      }
      
      // Reset the ACTUAL array values in the sorted order (swap)
      // if necessary
      selection[minIndex] = selection[i];
      selection[i] = minValue;
      
      count++;
      
    }
    
  } // END sort()
  
} // END SelectionSort