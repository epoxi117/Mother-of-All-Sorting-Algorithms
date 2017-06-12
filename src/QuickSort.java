import java.util.ArrayList;

public class QuickSort extends Sort{

	long swapCount =0;
	long comparisonCount =0;
	
	public QuickSort(ArrayList<Long> list){ 
		
		sortName.set("QuickSort");
		
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
	
	public QuickSort(){
		
	}
	
	public ArrayList<Long> sort(ArrayList<Long> list){ //QuickSort Algorithm
		
		list = sort(list, 0, list.size() -1 );
		
		setStringList(list);
		
		comparisons.set(Long.toString(comparisonCount));
		swaps.set(Long.toString(swapCount));
		
		return list;
	}
	
	public  ArrayList<Long> sort(ArrayList<Long> list, int low, int high){
		
		if(low < high){
		int	pivotLocation = partition(list, low, high);
		
		
		
			sort(list, low, pivotLocation -1);
			sort(list, pivotLocation + 1, high);
			
		}
		
		
		return list;
	}
	
	public int partition(ArrayList<Long> list, int low, int high ){
		
		long pivot = list.get(high);

		
		int leftwall = low -1;
		
		for(int i= low; i<= high -1; i++){
			
			comparisonCount++;
			if(list.get(i).compareTo(pivot) <= 0 ){
				
				leftwall = leftwall + 1;
			swap(list, i, leftwall);
			this.swapCount++;

			}
		}
		
		swap(list, leftwall + 1, high);
		this.swapCount++;

		
		return leftwall + 1;
	}
	
	public void swap(ArrayList<Long> list, int currentIndex, int otherIndex){
		long temp = list.get(otherIndex);
		list.set(otherIndex, list.get(currentIndex));
		list.set(currentIndex, temp);
	}
}
