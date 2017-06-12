import java.util.ArrayList;

public class SelectionSort  extends Sort{

	static long swapCount =0;
	long comparisonCount =0;
//	static int dude =0;
	
	public SelectionSort(ArrayList<Long> list){ 

		
		sortName.set("Selection Sort"); //Column Title 
		
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
	
	public SelectionSort(){
		
	}
	
	public  ArrayList<Long> sort(ArrayList<Long> list){
		
	    long min = 0;
        int j=0;
        int minIndex = 0;      
         
        for(int i=0;i< list.size() -1; i++){
             
            min = list.get(i); //Store current first element as minimum.
            minIndex = i;      //keep track of the index for minimum value.
             
            for(j= i+1;j< list.size(); j++){
                if(list.get(j)< min){ //j will check the array to check if there are other elements smaller than the current minimum
                    min = list.get(j); //if there is such an element, reassign minimum index and value.
                    minIndex = j;
                  
                }
                comparisonCount++;
            }
         
            //Swap minimum element with the first element of unsorted right section of array
            swap(list,i, minIndex);   
            
        }
        
		comparisons.set(Long.toString(comparisonCount));
		swaps.set(Long.toString(swapCount));
		swapCount =0 ;

		
		setStringList(list);
        
        return list;
	}
	
	public static void swap(ArrayList<Long> list, int currentIndex, int otherIndex){
		long temp = list.get(otherIndex);
		list.set(otherIndex, list.get(currentIndex));
		list.set(currentIndex, temp);
		swapCount++;
	}
}
