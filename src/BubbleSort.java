/*Gilberto Placidon
 * CS 2013
 */

import java.util.ArrayList;


public class BubbleSort  extends Sort{ 
	
	
	long swapCount =0;
	long comparisonCount =0;
	
	public BubbleSort(ArrayList<Long> list){ 
		
		sortName.set("Bubble Sort");
		
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
	
	
	public BubbleSort(){};
	
	public ArrayList<Long> sort(ArrayList<Long> list){ //Bubble Sort Algorithm 
		
		for(int i=1; i <= list.size() -1; i++){
			
			for(int j=0; j <= list.size() -2; j++){
				comparisonCount++;
				if(list.get(j).compareTo(list.get(j+1)) > 0){					

					swap(list, j, j+1);
					
					swapCount++;

				}
			}
		}
		
		comparisons.set(Long.toString(comparisonCount));
		swaps.set(Long.toString(swapCount));

		
		setStringList(list);
		
		return list;
	}
	
	public void swap(ArrayList<Long> list, int sourceIndex, int destIndex){
		Long temp = list.get(destIndex);
		list.set(destIndex, list.get(sourceIndex));
		list.set(sourceIndex, temp);
	}
	
	
}
