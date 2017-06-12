/*Gilberto Placidon
 * CS 2013
 */

import java.util.ArrayList;


public class CocktailSort extends Sort{ 
	
	
	
	long swapCount =0;
	long comparisonCount =0;
	
	public CocktailSort(ArrayList<Long> list){ 

		sortName.set("Cocktail Sort");
		
		listSize.set(Integer.toString(list.size())); //Assign the list size to listSize string.
		
		switch(list.size()){
		
		case 10:

			ListOf10 = list;
			
			swapCount = 10;
			startTime = System.currentTimeMillis();
			sort(ListOf10);
			endTime = System.currentTimeMillis();
			swapCount++;
			swaps.set(Long.toString(swapCount));
			
			
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
	
	public CocktailSort(){
		
	}
	
	
	/*Cocktail Sort has two main stages. First being the first loop that acts
	  as Bubble Sort. The first loop will traverse through the array, swapping elements
	  in between while keeping track of the largest element to place at the end. The second loop will
	  traverse the opposite way keeping track of the next smallest element while swapping
	  elements in between.*/
	
	public ArrayList<Long> sort(ArrayList<Long> list) {//CocktailSort Sort Algorithm
		
		boolean isSwapped = true;
		int start =0;
		int end = list.size();
		
		while(isSwapped == true){
			
			//initialize boolean to false to commence the loop
			// in case the previous iteration changed it to true.
			isSwapped = false;
			
			//BubbleSort part
			for(int i= start; i< end -1; i++){
				comparisonCount++;
				if(list.get(i) > list.get(i + 1)){
					
					swapCount++;
					swap(list, i , i+1);
					
					isSwapped = true;
				}
			}
			
			//If no swap occurred, list is sorted
			if(isSwapped == false){
				break;
			}
			
			//else set flag to false for next iteration
			else{
				isSwapped = false;
			}

			//shift endpoint back one since element is sorted.
			end -=1;
			
			//loop that sorts from top to bottom (opposite direction)
			for(int x= end -1; x>= start; x--){
				comparisonCount++;
				if(list.get(x) > list.get(x + 1)){
					
					swapCount++;
					swap(list, x , x+1);
					
					
					isSwapped = true;
				}
			}

			
			//shift startpoint back one since element is sorted.
			start +=1;
		}
		System.out.println(swapCount);
		
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
