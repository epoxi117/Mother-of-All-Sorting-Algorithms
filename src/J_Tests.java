import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;


public class J_Tests {
	
	@SuppressWarnings("deprecation")
	@Test
	public void BubbleSort(){
		
		ArrayList<Long> ArrayToSort1 = new ArrayList<>(Arrays.asList((long)12, (long)772, (long)8892, (long)1, (long)78, (long)117));
		
		ArrayList<Long> sortedList = new ArrayList<>(Arrays.asList((long)1, (long)12, (long)78, (long)117, (long)772, (long)8892));
		
		String[] sortedArray = {"1", "12", "78", "117", "772", "8892"};
		
		BubbleSort Bubble = new BubbleSort();
		
		ArrayList<Long> test = Bubble.sort(ArrayToSort1);	
		
		String[] compare = new String[test.size()];
		
		for(int x=0; x < test.size(); x++){
			compare[x] = Long.toString(test.get(x));
		}
		
		assertEquals(sortedArray, compare);
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void CockTailSort(){
		
		ArrayList<Long> ArrayToSort1 = new ArrayList<>(Arrays.asList((long)12, (long)772, (long)8892, (long)1, (long)78, (long)117));
		
		ArrayList<Long> sortedList = new ArrayList<>(Arrays.asList((long)1, (long)12, (long)78, (long)117, (long)772, (long)8892));
		
		String[] sortedArray = {"1", "12", "78", "117", "772", "8892"};
		
		CocktailSort Cocktail = new CocktailSort();
		
		ArrayList<Long> test = Cocktail.sort(ArrayToSort1);	
		
		String[] compare = new String[test.size()];
		
		for(int x=0; x < test.size(); x++){
			compare[x] = Long.toString(test.get(x));
		}
		
		assertEquals(sortedArray, compare);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void CombSort(){
		
		ArrayList<Long> ArrayToSort1 = new ArrayList<>(Arrays.asList((long)12, (long)772, (long)8892, (long)1, (long)78, (long)117));
		
		ArrayList<Long> sortedList = new ArrayList<>(Arrays.asList((long)1, (long)12, (long)78, (long)117, (long)772, (long)8892));
		
		String[] sortedArray = {"1", "12", "78", "117", "772", "8892"};
		
		
		CombSort CombSort = new CombSort();
		
		ArrayList<Long> test = CombSort.sort(ArrayToSort1);	
		
		String[] compare = new String[test.size()];
		
		for(int x=0; x < test.size(); x++){
			compare[x] = Long.toString(test.get(x));
		}
		
		assertEquals(sortedArray, compare);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void CountingSort(){
		
		ArrayList<Long> ArrayToSort1 = new ArrayList<>(Arrays.asList((long)12, (long)772, (long)8892, (long)1, (long)78, (long)117));
		
		ArrayList<Long> sortedList = new ArrayList<>(Arrays.asList((long)1, (long)12, (long)78, (long)117, (long)772, (long)8892));
		
		String[] sortedArray = {"1", "12", "78", "117", "772", "8892"};
		
		
		CountingSort CountingSort = new CountingSort();
		
		ArrayList<Long> test = CountingSort.sort(ArrayToSort1);	
		
		String[] compare = new String[test.size()];
		
		for(int x=0; x < test.size(); x++){
			compare[x] = Long.toString(test.get(x));
		}
		
		assertEquals(sortedArray, compare);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void InsertionSort(){
		
		ArrayList<Long> ArrayToSort1 = new ArrayList<>(Arrays.asList((long)12, (long)772, (long)8892, (long)1, (long)78, (long)117));
		
		ArrayList<Long> sortedList = new ArrayList<>(Arrays.asList((long)1, (long)12, (long)78, (long)117, (long)772, (long)8892));
		
		String[] sortedArray = {"1", "12", "78", "117", "772", "8892"};
		
		InsertionSort InsertionSort = new InsertionSort();
		
		ArrayList<Long> test = InsertionSort.sort(ArrayToSort1);	
		
		String[] compare = new String[test.size()];
		
		for(int x=0; x < test.size(); x++){
			compare[x] = Long.toString(test.get(x));
		}
		
		assertEquals(sortedArray, compare);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void MergeSort(){
		
		ArrayList<Long> ArrayToSort1 = new ArrayList<>(Arrays.asList((long)12, (long)772, (long)8892, (long)1, (long)78, (long)117));
		
		ArrayList<Long> sortedList = new ArrayList<>(Arrays.asList((long)1, (long)12, (long)78, (long)117, (long)772, (long)8892));
		
		String[] sortedArray = {"1", "12", "78", "117", "772", "8892"};
		
		MergeSort MergeSort = new MergeSort();
		
		ArrayList<Long> test = MergeSort.sort(ArrayToSort1);	
		
		String[] compare = new String[test.size()];
		
		for(int x=0; x < test.size(); x++){
			compare[x] = Long.toString(test.get(x));
		}
		
		assertEquals(sortedArray, compare);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void QuickSort(){
		
		ArrayList<Long> ArrayToSort1 = new ArrayList<>(Arrays.asList((long)12, (long)772, (long)8892, (long)1, (long)78, (long)117));
		
		ArrayList<Long> sortedList = new ArrayList<>(Arrays.asList((long)1, (long)12, (long)78, (long)117, (long)772, (long)8892));
		
		String[] sortedArray = {"1", "12", "78", "117", "772", "8892"};
		
		QuickSort QuickSort = new QuickSort();
		
		ArrayList<Long> test = QuickSort.sort(ArrayToSort1);	
		
		String[] compare = new String[test.size()];
		
		for(int x=0; x < test.size(); x++){
			compare[x] = Long.toString(test.get(x));
		}
		
		assertEquals(sortedArray, compare);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void RadixSort(){
		
		ArrayList<Long> ArrayToSort1 = new ArrayList<>(Arrays.asList((long)12, (long)772, (long)8892, (long)1, (long)78, (long)117));
		
		ArrayList<Long> sortedList = new ArrayList<>(Arrays.asList((long)1, (long)12, (long)78, (long)117, (long)772, (long)8892));
		
		String[] sortedArray = {"1", "12", "78", "117", "772", "8892"};	
		
		MergeSort RadixSort = new MergeSort();
		
		ArrayList<Long> test = RadixSort.sort(ArrayToSort1);	
		
		String[] compare = new String[test.size()];
		
		for(int x=0; x < test.size(); x++){
			compare[x] = Long.toString(test.get(x));
		}
		
		assertEquals(sortedArray, compare);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void SelectionSort(){
		
		ArrayList<Long> ArrayToSort1 = new ArrayList<>(Arrays.asList((long)12, (long)772, (long)8892, (long)1, (long)78, (long)117));
		
		ArrayList<Long> sortedList = new ArrayList<>(Arrays.asList((long)1, (long)12, (long)78, (long)117, (long)772, (long)8892));
		
		String[] sortedArray = {"1", "12", "78", "117", "772", "8892"};
		
		SelectionSort SelectionSort = new SelectionSort();
		
		ArrayList<Long> test = SelectionSort.sort(ArrayToSort1);	
		
		String[] compare = new String[test.size()];
		
		for(int x=0; x < test.size(); x++){
			compare[x] = Long.toString(test.get(x));
		}
		
		assertEquals(sortedArray, compare);
		
	}
	
	
	
	
	
}
