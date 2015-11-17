// SelectionSort.java

public class SelectionSort {
  
  public static void printArray( int[] a ) {
    
    for( int i=0; i<a.length; i++ ) {
      System.out.print( a[i] + ", " );
    }
    
  } // END printArray
  
  public static void selectionSort( int[] a, int[] b ) {
    
    // printArray( a );
    for( int i=0; i<a.length; i++ ) {
      for( int j=0; j<a.length; j++ ) {
        if( a[i] < a[j] ) {
          System.out.println( a[i] + " is smaller than " + a[j] );
          b.push(a[i]);
        }
      }
    }
    
    printArray( b );
    
  } // END selectionSort
  
  public static void main( String[] args ) {
  
    int[] ips = { 76, 71, 63, 65, 66, 64, 70, 69, 68, 67, 72, 73 };
    int[] ipsorted = new int[12];
    
    printArray( ips ); // toString(); 
    
    selectionSort( ips, ipsorted ); 
    // 1. Print the array EVERY step through the sort
    // 2. Declare which STEP you're on
    // 3. Tell me the FINAL sorted array 
    
  } // END main method
} // END SelectionSort