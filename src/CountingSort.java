/*Gilberto Placidon
 * CS 2013
 */

import java.util.ArrayList;


public class CountingSort extends Sort{ 
	
	
	
	long swapCount =0;
	long comparisonCount =0;
	
	public CountingSort(ArrayList<Long> list){ 

		sortName.set("Counting Sort");
		
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
	
	public CountingSort(){
		
	}
	
	
	
	public ArrayList<Long> sort(ArrayList<Long> list){ //Counting Sort
		
		list = sort(list, 10001);
		
		comparisons.set("NULL");
		swaps.set("NULL");
		setStringList(list);
		
		return list;
	}
	
	public ArrayList<Long> sort(ArrayList<Long> list, int kNumber){ //Counting Sort
		
		Long[] result = new Long[list.size()];
		
		Long[] counts = new Long[kNumber + 1];
		
		
		for(int i=0; i< kNumber; i++){
			counts[i] = (long) 0;
		}
		
		
		for(int x=0; x<= list.size() -1; x++){
			counts[list.get(x).intValue()]++;
		}
		
		for(int j=1; j < kNumber; j++){
			counts[j] += counts[j-1];
		}
		
		for(int v= list.size()-1; v >= 0; v--){
			result[ (int) (counts[(list.get(v).intValue())] -1)] = list.get(v);
			counts[list.get(v).intValue()]--;
		}
		
		ArrayList<Long> finalResult = new ArrayList<>();
		
		for(int g =0; g < result.length; g++){
			finalResult.add(result[g]);
		}
		
		
		return finalResult;
		
	}	
	
	//Attempt at using ArrayList instead of Array
	
	/*
	public static ArrayList<Long> CountingSort(ArrayList<Long> list, long k) {//Counting Sort Algorithm
		
		ArrayList<Long> result = new ArrayList<Long>();
		ArrayList<Long> counts = new ArrayList<Long>();
		
		for(int i=0; i< k ; i++){
			counts.add((long) 0);
		}
		
		for(int y=0; y<= list.size() -1; y++){
			
			counts.set(list.get(y).intValue(), list.get(y) + (long) 1);
			
			System.out.println(counts.get(y));
		}
		
		for(int x=1; x< k ; x++){
			
			counts.set(x, counts.get(x) + counts.get(x - 1));
			System.out.println(counts.get(x));
		}
		
		for(int z= list.size()-1; z>= 0; z--){

			int temp = list.get(z).intValue();
			
			int temp2 = counts.get(temp).intValue() - 1;
			
			System.out.println("z: " + z);
			System.out.println("list.get(z): " + list.get(z));
			System.out.println("counts: " + temp2);
			System.out.println(temp2);
			
			result.set(temp2, list.get(z));
			
			counts.set(list.get(z).intValue(), list.get(z) - (long) 1);
		}
		
		return result;
		
	}
	
*/
	
	
}
