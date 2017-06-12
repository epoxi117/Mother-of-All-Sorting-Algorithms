
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class getFiles {

	ArrayList<Long> ListOf10 = new ArrayList<>();
	ArrayList<Long> ListOf100 = new ArrayList<>();
	ArrayList<Long> ListOf1k = new ArrayList<>();
	ArrayList<Long> ListOf10k = new ArrayList<>();
	ArrayList<Long> ListOf100k = new ArrayList<>();
	
	File[] files = new File[5]; //select multiple files at once.
	
	public getFiles(){
		setFiles();
	}
	
	public void setFiles(){
		
		ListOf10 = ListOfNumbers();
		ListOf100 = ListOfNumbers();
		ListOf1k = ListOfNumbers();
		ListOf10k = ListOfNumbers();
		ListOf100k = ListOfNumbers();
	}
	
	public static ArrayList<Long> ListOfNumbers(){
		
		JButton open = new JButton();
		JFileChooser fc = new JFileChooser();
		BufferedReader reader;

		ArrayList<Long> numberList = new ArrayList<>();
		
		fc.setDialogTitle("File Chooser");
		
		FileNameExtensionFilter textFilter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
		fc.setFileFilter(textFilter);
//		fc.setMultiSelectionEnabled(true);
		
		if(fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION)
		{
			try{
				reader = new BufferedReader(new InputStreamReader(new FileInputStream(fc.getSelectedFile())));
				
				
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
		
	}
		
		return numberList;
	
	}
	
	public ArrayList<Long> copyList(ArrayList<Long> oldList){
		
		ArrayList<Long> newList = new ArrayList<>();
		
		for(int i=0; i< oldList.size(); i++){
			
			newList.add(oldList.get(i));
			
		}
		
		return newList;
	}
	
	public boolean checkTwoLists(ArrayList<Long> list1, ArrayList<Long> list2){
		
		for(int i=0; i< list1.size(); i++){
			
			if(list1.get(i) != list2.get(i)){
				System.out.println("Lists are not equal");
				return false;
			}
			
		}
		System.out.println("Success! Lists are equal");
		return true;
		
	}
	

}
