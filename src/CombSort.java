/*Gilberto Placidon
 * CS 2013
 */

import java.util.ArrayList;


public class CombSort extends Sort{ 
	
//	BigInteger comparisonCount = new BigInteger("0"); //Initialize integer to 0.
//	BigInteger swapCount = new BigInteger("0");
//	BigInteger addOne = new BigInteger("1"); //counter
	
	long swapCount =0;
	long comparisonCount =0;
	
	public CombSort(ArrayList<Long> list){ 
		
		sortName.set("Comb Sort");
		
		listSize.set(Integer.toString(list.size())); //Assign the list size to listSize string.
		
		switch(list.size()){
		
		case 10:

			ListOf10 = list;
			
			startTime = System.currentTimeMillis();
			sort(ListOf10);
			endTime = System.currentTimeMillis();
			
			finalTime = (endTime - startTime);
			
			break;
		
		case 100:

			ListOf100 = list;
			
			startTime = System.currentTimeMillis();
			sort(ListOf100);
			endTime = System.currentTimeMillis();
			
			finalTime = (endTime - startTime);
			
			break;
			
		case 1000:

			ListOf1k = list;
			
			startTime = System.currentTimeMillis();
			sort(ListOf1k);
			endTime = System.currentTimeMillis();
			
			finalTime = (endTime - startTime);
			
			break;
			
		case 10000:

			ListOf10k = list;
			
			startTime = System.currentTimeMillis();
			sort(ListOf10k);
			endTime = System.currentTimeMillis();
			
			finalTime = (endTime - startTime);
			
			break;
			
		case 100000:

			ListOf100k = list;
			
			startTime = System.currentTimeMillis();
			sort(ListOf100k);
			endTime = System.currentTimeMillis();
			
			finalTime = (endTime - startTime);
			
			break;
			
		default:
			System.out.println("Incorrect size input");
		}
	
		
		this.runTime.set(Long.toString(finalTime) + " millisecond(s)");

	}
	
	public CombSort(){
		
	}
	
	
	/*Comb Sort specializes in sorting the elements at the end of the list
	  by changing the gap of the elements being swapped. Bubble sort is applied
	  with each new calculation of the gap.*/
	
	public ArrayList<Long> sort(ArrayList<Long> list) {//Comb Sort Algorithm
		
		int size = list.size();
		
		// initialize gap
		int gap = size;
		
		//Set swap to true to make it run.
		boolean isSwapped = true;
		
		//If gap is not 1, sorting is not yet complete.
		//Or iteration caused a swap
		while(gap != 1 || isSwapped == true){
			
			// Find next gap
			gap = getNextGap(gap);
			
			//change swap to false to determine if swap occurred.
			isSwapped = false;
			
			//Compare elements with current gap.
			for(int i=0; i< size - gap; i++){
				
				comparisonCount++;
				if(list.get(i) > list.get(i + gap)){
					
					long temp = list.get(i);
					
					//swap 
					swap(list, i , i + gap);
					
					swapCount++;
					
					//swap occurred
					isSwapped = true;
				}
			}
			
		}
		
		comparisons.set(Long.toString(comparisonCount));
		swaps.set(Long.toString(swapCount));
		
		setStringList(list);
		
		return list;
		
	}
	
	/*Gap is needed in order to perform more than one inversion count
	  with a single swap. The gap starts off with the size of the array 
	  and shrinks by a factor of 1.3.*/
	
	public  int getNextGap(int gap){
      gap = (gap * 10) /13; 
      if (gap < 1){
          return 1;
      }
      return gap;
	}
	
	public void swap(ArrayList<Long> list, int sourceIndex, int destIndex){
		Long temp = list.get(destIndex);
		list.set(destIndex, list.get(sourceIndex));
		list.set(sourceIndex, temp);
	}
	
	
}
