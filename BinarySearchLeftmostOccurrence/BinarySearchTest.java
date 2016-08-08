package BinarySearchLeftmostOccurrence;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void binarySearchTest(){
		int array[] = new int[]{1,1,2,2,2,3,3,3,7,17};
		BinarySearch obj = new BinarySearch();
		int actual = obj.binarySearchMethod(array, 0, array.length-1, 2);
		int expected = 2;
		
		assertEquals(expected, actual);
		}
	}
