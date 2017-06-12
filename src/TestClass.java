import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TestClass {

	static int comparisonCount =0;
	static int swapCount =0;
	
	public static void main(String args[])
	{
		ArrayList<Long> test = new ArrayList<>();

		
		test.add((long) 1245);
		test.add((long) 12);
		test.add((long) 223);
		test.add((long) 234);
		test.add((long) 456);
		test.add((long) 9999);
		test.add((long) 8399);
		test.add((long) 56);
		test.add((long) 670);
		test.add((long) 7);

		
		
//		test = ListOfNumbers();
		
		test = RadixSort(test);
		
		printCountingSort(test);
//		printList(test);
		
		
	}
	
	
	public static ArrayList<Long> ListOfNumbers(){
	
		
		JButton open = new JButton();
		JFileChooser fc = new JFileChooser();
		BufferedReader reader;

		ArrayList<Long> numberList = new ArrayList<>();
		
//		fc.setDialogTitle("File Chooser");
//		
//		FileNameExtensionFilter textFilter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
//		fc.setFileFilter(textFilter);
		
//		if(fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION)
//		{
			try{
//				reader = new BufferedReader(new InputStreamReader(new FileInputStream(fc.getSelectedFile())));
				reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\User\\workspace\\Mother of all Sorting\\ListOf10.txt\\")));
				
				
				while(reader.ready())
				{
					
					numberList.add(Long.parseLong(reader.readLine()));

				}
				

				
			}catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}catch (IOException e)
			{
				e.printStackTrace();
			}
		
//	}
		
		return numberList;
	
	}
	
	
	public static void printCountingSort(ArrayList<Long> test){
		
		for(int i=0; i< test.size(); i++){
			if(test.get(i) != null){
				System.out.println(test.get(i));
			}
		}
	}
	
	public static void printList(ArrayList<Integer> list){
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
	public static ArrayList<Long> RadixSort(ArrayList<Long> list) {
		
		
		ArrayList[] buckets = new ArrayList[list.size()];
		Long highestNumber = (long) 0;


		for (int j = 0; j < buckets.length; j++) {
			ArrayList<Long> tempArrayList = new ArrayList<>();
			buckets[j] = tempArrayList;
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (highestNumber < (list.get(i))) {
				highestNumber = list.get(i);
			}
		}
		
		
		int digitCount = Long.toString(highestNumber).length();
		
		for (int i = 1; i <= digitCount; i++) {

			for (int j = 0; j <= list.size() - 1; j++) {
				
				int finalKey = significant_Digit(list.get(j), i);
				buckets[finalKey].add(list.get(j));
			}
			
			
			int k = 0;
			// This for loop goes through the buckets and gets every single
			// ArrayList value and starts sorting
			for (int j = 0; j <= buckets.length - 1; j++) {
				
				for (int h = 0; h < buckets[j].size(); h++) {
					
					long x = (long) buckets[j].get(h);
					list.set(k++, (long) x);
					
				}
				
				buckets[j].clear();
			}
		}
		return list;
	}

	public static int significant_Digit(Long long1, int sigDigit){
		
		int result = (int) (long1/Math.pow(10, sigDigit - 1) % 10);
		
		return result;
		
	}

/*
	@SuppressWarnings("unchecked")
	public static ArrayList<Integer> RadixSort(ArrayList<Integer> list){
		
		ArrayList[] buckets = new ArrayList[list.size()];
		
		long highestNumber =0;
		
		//initialize buckets
		for(int z=0; z < buckets.length; z++){
			buckets[z] = new ArrayList<Integer>();
		}
		
		
		for(int x=0; x< list.size(); x++){ 
			
			if(highestNumber < list.get(x)){
				highestNumber = list.get(x);
			}
			
		}
		
		int digitCount = Long.toString(highestNumber).length();
		
		for(int y=1; y <= digitCount; y++){
			
			for(int i=0; i<= list.size() -1; i++){
				
				long finalKey = significant_Digit(list.get(i), y);
				
				buckets[(int) finalKey].add(list.get(i));
				
			}
			
			int k=0;
			
			for(int v=0; v<= buckets.length -1; v++){
				
				for(int e =0; e < buckets[v].size() ; v++){
					
					Integer temp = (Integer) buckets[v].get(e);
					
					System.out.println(temp);
					
					list.set(k, temp);
					k++;
				}
				
				buckets[v].clear();
			}
		}
		
		return list;
		
	}

	
	public static int significant_Digit(int number, int sigDigit){
		
		//10 being the base being used.
		int result = (int) (number/Math.pow(10, sigDigit - 1) % 10);
		
		return result;
		
	}
*/
	
	
/*	
	public static ArrayList<Long> RadixSort(ArrayList<Long> list){
		
		list = RadixSort(list, 4);
		
		return list;
		
	}
	

	public static ArrayList<Long> RadixSort(ArrayList<Long> list, int highestNumberOfDigits) {//Radix Sort Algorithm
		
		//ArrayList buckets hold separate ArrayLists to hold each respective matching digit.
		ArrayList<ArrayList<Long>> buckets = new ArrayList<>();
		
		buckets.add(new ArrayList<Long>());
		buckets.add(new ArrayList<Long>());
		buckets.add(new ArrayList<Long>());
		buckets.add(new ArrayList<Long>());
		buckets.add(new ArrayList<Long>());
		buckets.add(new ArrayList<Long>());
		buckets.add(new ArrayList<Long>());
		buckets.add(new ArrayList<Long>());
		buckets.add(new ArrayList<Long>());
		buckets.add(new ArrayList<Long>());
		
		
		for(int x=1; x< highestNumberOfDigits; x++){
			
			for(int z=0; z<= list.size()-1; z++){

				String tempKey = list.get(z).toString();
				
				if(tempKey.length() <  highestNumberOfDigits){ //Number needs to be padded with zeros
																
					
					String temp = "";						  
					
					for(int i=tempKey.length(); i< highestNumberOfDigits ; i++){
						temp += "0";
					}
					tempKey = temp + tempKey;
					

					
				}
				
				System.out.println(tempKey);
				
				String[] digits = tempKey.split("");
				
				long finalKey = Long.parseLong(digits[digits.length - x]);
				
				System.out.println(finalKey);
				
				buckets.get((int)finalKey).add(list.get(z));
				
			}
			
			int k =0;
			
			for(int j=0; j<= buckets.size() -1; j++){
				for(long traverse: buckets.get(j)){
						
					list.set(k++, traverse);

				}
				buckets.get(j).clear();
			}
		}
		
		
		return list;
		
		
	}
	
	
	public static ArrayList<Long> swap(ArrayList<Long> list, int currentIndex, int otherIndex){
		Long temp = list.get(otherIndex);
		list.set(otherIndex, list.get(currentIndex));
		list.set(currentIndex, temp);
		
		return list;
	}
	
*/

}
