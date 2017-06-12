/*Gilberto Placidon
 * CS 2013
 */

import java.util.ArrayList;


public class RadixSort extends Sort{ 
	
	
	
	long swapCount =0;
	long comparisonCount =0;
	
	public RadixSort(ArrayList<Long> list){ 

		sortName.set("Radix Sort");
		
		listSize.set(Integer.toString(list.size())); //Assign the list size to listSize string.
		
		switch(list.size()){
		
		case 10:

			ListOf10 = list;
			
			swapCount = 10;
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
	
	public RadixSort(){
		
	}
	
	
	public ArrayList<Long> sort(ArrayList<Long> list) {
		
		
		ArrayList[] buckets = new ArrayList[list.size()];
		Long highestNumber = (long) 0;


		for (int bucket_pos = 0; bucket_pos < buckets.length; bucket_pos++) {
			ArrayList<Long> tempArrayList = new ArrayList<>();
			buckets[bucket_pos] = tempArrayList;
		}
		
		for (int initializer = 0; initializer < list.size(); initializer++) {
			if (highestNumber < (list.get(initializer))) {
				highestNumber = list.get(initializer);
			}
		}
		
		
		int digitCount = Long.toString(highestNumber).length();
		
		for (int current_digit = 1; current_digit <= digitCount; current_digit++) {

			for (int j = 0; j <= list.size() - 1; j++) {
				
				long finalKey = significant_Digit(list.get(j), current_digit);
				buckets[(int) finalKey].add(list.get(j));
			}
			
			
			int k = 0;

			
			for (int current_bucket = 0; current_bucket <= buckets.length - 1; current_bucket++) {
				
				for (int h = 0; h < buckets[current_bucket].size(); h++) {
					
					long x = (long) buckets[current_bucket].get(h);
					list.set(k++, (long) x);
					
				}
				
				buckets[current_bucket].clear();
			}
		}
		
		comparisons.set("NULL");
		swaps.set("NULL");
		
		setStringList(list);
		
		return list;
	}

	public long significant_Digit(Long long1, int sigDigit){
		
		long result = (long) (long1/Math.pow(10, sigDigit - 1) % 10);
		
		return result;
		
	}
	
	
}
