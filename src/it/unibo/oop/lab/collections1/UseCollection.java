package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {

    private static final int READ_TIME = 1000;
	private static final int ELEM = 100000;
	private static final int ARRAY_STOP = 2000;
	private static final int ARRAY_START = 1000;

	private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
    	ArrayList<Integer> arrList = new ArrayList<Integer>();
    	for(int i=ARRAY_START; i<=ARRAY_STOP; i++) {
    		arrList.add(i);
    	}    	
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
    	LinkedList<Integer> linkList = new LinkedList<Integer>(arrList);   	
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
    	int first = arrList.get(ARRAY_START);
    	int last = arrList.get(ARRAY_STOP);
    	arrList.set(ARRAY_STOP, first);
    	arrList.set(ARRAY_START, last);
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
    	for(var i : arrList) {
    		System.out.println(i);
    	}
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
    	long timeArr = System.nanoTime();
    	long timeLin = System.nanoTime();
    	
    	for (int i=1; i<=ELEM; i++) {
    		arrList.add(i);
    	}
    	timeArr = System.nanoTime() - timeArr;
    	System.out.println("Inserting " + ELEM + " in ArrayList needed " + timeArr);
    	
    	for (int i=1; i<=ELEM; i++) {
    		linkList.add(i);
    	}
    	timeLin = System.nanoTime() - timeLin;
    	System.out.println("Inserting " + ELEM + " in LinkedList needed " + timeLin);
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
    	timeArr = System.nanoTime();
    	for (int i = 1; i<=READ_TIME; i++) {
    		arrList.get(arrList.size()/2);
    	}
    	timeArr = System.nanoTime() - timeArr;
    	System.out.println("Reading " + READ_TIME + " times ArrayList's middle element needed " + timeArr);
    	
    	timeLin = System.nanoTime();
    	for(int i = 1; i<=READ_TIME; i++) {
    		linkList.get(linkList.size()/2);
    	}
    	timeLin = System.nanoTime() - timeLin;
    	System.out.println("Reading " + READ_TIME + " times LinkedList's middle element needed " + timeLin);
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
    	Map<String, Long> continent = new HashMap<>();
    	
    	continent.put("Africa", 1_110_635_000L);	//not going to make constants. I'm sorry
    	continent.put("Americas", 972_005_000L);
    	continent.put("Antartica", 0L);
    	continent.put("Asia", 4_298_723_000L);
    	continent.put("Europe", 742_452_000L);
    	continent.put("Oceania", 38_304_000L);    	
        /*
         * 8) Compute the population of the world
         */
    	long totPopulation = 0;
    	for(long population : continent.values()) {
    		totPopulation += population;
    	}
    	System.out.println("The total population of the world is " + totPopulation);
    }
}
