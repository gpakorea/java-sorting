/*
 * Project: Sorter.java
 * Description: Main class that implements many different sorting methods from Sort classes
 * Name: Aaron Snowberger
 * Date: Nov 17, 2015
 */

public class Sorter {
  
  public static void main( String[] args ) {
    
    // Bubble Sort
    BubbleArray newone = new BubbleArray();
    System.out.println( "Bubble unsorted: " + newone );
    newone.bubbleSort();
    System.out.println( "Bubble sorted: " + newone );
    
    // Selection Sort
    SelectionArray s = new SelectionArray();
    System.out.println( "Selection unsorted: " + s );
    s.selectionSort();
    System.out.println( "Selection sorted: " + s );
    
    // Insertion Sort
    
    // Quick Sort
    
    // Merge Sort
    
    // Radix Sort
    
  } // END main method
  
} // END class Sorter