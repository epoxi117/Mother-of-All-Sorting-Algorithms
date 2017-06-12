import java.util.ArrayList;

public class InsertionSort extends Sort{

	long swapCount =0;
	long comparisonCount =0;
	
	public InsertionSort(ArrayList<Long> list){ 
		
		sortName.set("Insertion Sort");
		
		listSize.set(Long.toString(list.size())); //Assign the list size to listSize string.
		
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
	
	public InsertionSort(){
		
	}
	
	public ArrayList<Long> sort(ArrayList<Long> list){ //Insertion Sort Algorithm
		
		for(int i= 1; i<= list.size() -1; i++){
			long temp = list.get(i);
			
			int j= i;
			
			while(j > 0 && temp < list.get(j - 1)){
				comparisonCount++;

				list.set(j, list.get(j - 1));
				j--;

				
				list.set(j, temp);
			}
			
		}
		
		setStringList(list);
		
		comparisons.set(Long.toString(comparisonCount));
		swaps.set("NULL");
		
		return list;
		
	}
	

	
	public void swap(ArrayList<Long> list, int currentIndex, int otherIndex){
		long temp = list.get(otherIndex);
		list.set(otherIndex, list.get(currentIndex));
		list.set(currentIndex, temp);
	}
}
