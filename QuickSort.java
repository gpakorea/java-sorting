// QuickSort.java

public class QuickSort extends Sorts {
  
  // instance variables
  private int[] quick = new int[12];
  private String name;
  private int left;
  private int right;
  private int count;
  
  // constructor
  public QuickSort() {
    quick = super.array;
    name = "Quick";
    left = 0; // Beginning of the array
    right = quick.length-1; // End of the array
    count = 1;
  }
  
  // methods
  // { 76, 71, 63, 65, 66, 64, 70, 69, 68, 67, 72, 73 }  
  public void sort() {
    System.out.println( "Doing " + name + " Sort: " );
    
    sort( left, right );
  }
  
  public void sort( int left, int right ) {
    
    if( left >= right ) return;
    
    int k = left;
    int j = right;
    int pivot = quick[ (left + right) / 2 ];
    
    while ( k < j ) {
      while ( quick[k] < pivot ) {
        k++;
      }
      while ( pivot < quick[j] ) { 
        j--;
      }
      if ( k <= j ) {
        System.out.print( "Step #" + count + " " );
        printArray();
        
        swap( k, j );
        k++;
        j--;
        
        count++;
      }
    }
    
    // Recursive call to itself
    sort( left, j ); // sort the whole left side
    sort( k, right ); // sort the whole right side
    
  } // END sort()
  
} // END QuickSort