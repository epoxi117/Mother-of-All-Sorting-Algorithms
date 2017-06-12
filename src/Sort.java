/*Gilberto Placidon
 * CS 2013
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import javafx.beans.property.SimpleStringProperty;

public abstract class Sort { 

	protected SimpleStringProperty sortName = new SimpleStringProperty(); 
	protected SimpleStringProperty list = new SimpleStringProperty();
	protected SimpleStringProperty runTime = new SimpleStringProperty();	
	protected SimpleStringProperty listSize = new SimpleStringProperty();
	protected SimpleStringProperty comparisons = new SimpleStringProperty();
	protected SimpleStringProperty swaps = new SimpleStringProperty();
	
	protected ArrayList<Long> ListOf10 = new ArrayList<>();
	protected ArrayList<Long> ListOf100 = new ArrayList<>();
	protected ArrayList<Long> ListOf1k = new ArrayList<>();
	protected ArrayList<Long> ListOf10k = new ArrayList<>();
	protected ArrayList<Long> ListOf100k = new ArrayList<>();
	
	protected long finalTime = 0;
	protected long startTime = 0;
	protected long endTime = 0;
	
	
	public void setNumberLists(){
		getFiles a = new getFiles();
		
		ListOf10 = a.ListOf10;
		ListOf100 = a.ListOf100;
		ListOf1k = a.ListOf1k;
		ListOf10k = a.ListOf10k;
		ListOf100k = a.ListOf100k;
	}
	

	
	public static ArrayList<Long> ListOfNumbers(){
		
		JButton open = new JButton();
		JFileChooser fc = new JFileChooser();
		BufferedReader reader;

		ArrayList<Long> numberList = new ArrayList<>();
		
		fc.setDialogTitle("File Chooser");
		
		FileNameExtensionFilter textFilter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
		fc.setFileFilter(textFilter);
		
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
	
	
	
	
	public void printList(ArrayList<Long> list){
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
	public String getSortName(){
		
		return sortName.get();
	}
	
	public void setStringList(ArrayList<Long> list){
		String temp = "";
		
		for(int i=0; i< list.size(); i++){
			temp += Long.toString(list.get(i));
			temp += ", "; 
		}
		this.list.set(temp);
	}
	
	/*	The SimpleStringProperty getter method needs to match that of what you initialize
	 in the PropertyValueFactory for CellValueFactory in TableView.	*/ 
	
	public String getRunTime(){
		return runTime.get();
	}
	
	public String getList(){
											
		return list.get();
	}
	
	public String getListSize(){
		return listSize.get();
	}
	
	public String getComparisons(){
		return comparisons.get();
	}
	
	public String getSwaps(){
		return swaps.get();
	}
	
	public ArrayList<Long> sort(ArrayList<Long> list){ //Bubble Sort Algorithm 
		
		return list;
		}
	
	
	
}
