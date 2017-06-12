import java.util.ArrayList;

public class MergeSort extends Sort{

	long swapCount =0;
	long comparisonCount =0;
	
	public MergeSort(ArrayList<Long> list){ 
		
		sortName.set("Merge Sort");
		
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
	
	public MergeSort(){
		
	}
	
	public ArrayList<Long> sort(ArrayList<Long> list){
		
		if(list.size() > 1){
			int mid = (list.size() -1) /2;
			
			ArrayList<Long> left = new ArrayList<Long>();
			
			for(int i=0; i<= mid; i++){
				left.add(list.get(i));
			}
			
			sort(left);
			
			ArrayList<Long> right = new ArrayList<Long>();
			
			for(int x = mid+1; x<= list.size() -1; x++){
				right.add(list.get(x));
			}
			
			right = sort(right);
			
			Merge_Sort(left, right, list);
		}
		
		comparisons.set(Long.toString(comparisonCount));
		swaps.set("NULL");
		setStringList(list);
		
		return list;
		
	}
	
	public void Merge_Sort(ArrayList<Long> list1, ArrayList<Long> list2, ArrayList<Long> result){
		
		int i =0, j =0, k =0;
		
		while(i < list1.size() && j < list2.size()){
			
			this.comparisonCount++;
			
			if(list1.get(i) < list2.get(j)){
				result.set(k, list1.get(i));
				i++;
			}
			else{
				result.set(k, list2.get(j));
				j++;
			}
			k++;
		}
		
		while(i < list1.size()){
			result.set(k, list1.get(i));
			i++;
			k++;
		}
		
		while(j < list2.size()){
			result.set(k, list2.get(j));
			j++;
			k++;
		}
		
	}
	
	
//	public int partition(ArrayList<Long> list, int low, int high ){
//		
//		long pivot = list.get(high);
//
//		
//		int leftwall = low -1;
//		
//		for(int i= low; i<= high -1; i++){
//			
//			comparisonCount++;
//			if(list.get(i).compareTo(pivot) <= 0 ){
//				
//				leftwall = leftwall + 1;
//			swap(list, i, leftwall);
//			this.swapCount++;
//
//			}
//		}
//		
//		swap(list, leftwall + 1, high);
//		this.swapCount++;
//
//		
//		return leftwall + 1;
//	}
	
	public void swap(ArrayList<Long> list, int currentIndex, int otherIndex){
		long temp = list.get(otherIndex);
		list.set(otherIndex, list.get(currentIndex));
		list.set(currentIndex, temp);
	}
}
