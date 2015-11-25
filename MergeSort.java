// MergeSort.java

public class MergeSort extends Sorts {
  
  // instance variables
  private int[] merge = new int[12];
  private String name;
  private int left;  // left index
  private int right; // right index
  private int count; // number of steps
  
  // constructor
  public MergeSort() {
    merge = super.array;
    name = "Merge";
    left = 0;               // Beginning of the array
    right = merge.length-1; // End of the array
    count = 1;
  }
  
  // methods
  // 1. empty sort() method
  // 2. recursive sort( left, right ) method
  // 3. merge( left, middle, right ) method
  
  public void sort() { // calls the recursive sort method
    System.out.println( "Doing " + name + " Sort: " );
    
    sort( left, right );
  }
  
  public void sort( int left, int right ) {
    if( right == left ) return; // Base case (terminal) 
    
    int middle = ( left + right ) / 2;
    
    sort( left, middle );    // Sort left side
    sort( middle+1, right ); // Sort right side
    
    merge( left, middle, right ); // Merge together
  }
  
  public void merge( int left, int middle, int right ) {
    
    // This temporary array will be used to build the merged list
    int temp[] = new int[right-left+1];
    // This creation of a temp array is a BIG feature of the merge sort
    
    int index1 = left;
    int index2 = middle + 1;
    int index = 0;
    
    // Loop until one sublist is finished, ADD the SMALLEST
    while ( index1 <= middle && index2 <= right ) {
      if( merge[index1] < merge[index2] ) {
        
        temp[index] = merge[index1]; // First num is smaller
        index1++; // Progressing through left side
        
      } else {
        
        temp[index] = merge[index2]; // Second num is smaller
        index2++; // Progressing through right side
        
      }
      index++; // Progressing through temp Array
    }
    
    // Add to the merged list, ADDS EVERYTHING ELSE
    while( index1 <= middle ) { // left side
      
      temp[index] = merge[index1];
      index1++;
      index++; 
      
    }
    while( index2 <= right ) { // right side
     
      temp[index] = merge[index2];
      index2++;
      index++;
      
    }
    
    // Everything above is now sorted
    // Copy the temp Array in the Merge array
    for( index = 0; index < temp.length; index++ ) {
      
      System.out.print( "Step #" + count + " " );
      printArray();
      merge[left + index] = temp[index];
      count++; 
      
    }
    
  }
  
  public int linearSearch( int key ) {
    
    // 1. Search the array one-by-one
    // 2. If the key exists, return index
    // 3. If no key, return -1
    
    for( int i=0; i<merge.length; i++ ) {
      if( key == merge[i] ) {
        return i;
      }
    }
    return -1;
    
  } // END linearSearch()
  
  public int binarySearch( int key ) {
    
    int start = 0;
    int end = merge.length-1;
    
    while( start <= end ) {
      
      int mid = (start + end) / 2; 
      if( key == merge[mid] ) { // key = mid, return the index
        return mid;
      } else if( key > merge[mid] ) { // key > mid, search right side
        start = mid + 1; 
      } else { // key < mid, search left side
        end = mid - 1; 
      }
    }
    return -1;
    
  } // END binarySearch() 
  
} // END MergeSort