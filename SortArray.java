// SortArray.java

public class SortArray {
  
  // instance variables
  public int[] array = new int[12];
  
  // constructor
  public SortArray() {
    array = new int[]{ 76, 71, 63, 65, 66, 64, 70, 69, 68, 67, 72, 73 };
  }
  
  // methods
  public String toString() {
    
    String result = "";
    
    result += "{ ";
    for( int i = 0; i < array.length-1; i++ ) {
      result = result + array[i] + ", ";
    }
    result = result + array[array.length-1] + " }";
    
    return result;
    
  } // END toString
  
  public void swap( int first, int second ) {
    // System.out.println("swapping");
    int temp = array[first];
    array[first] = array[second];
    array[second] = temp;
  }
  
} // END class