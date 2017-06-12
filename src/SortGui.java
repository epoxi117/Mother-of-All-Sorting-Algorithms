import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SortGui extends Application{

	private TableView table = new TableView();
	private int WIDTH = 1200;
	private int HEIGHT = 900;
	

	
	
	
	final HBox hBox = new HBox();
	
	public static void main(String args[]){
		
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		Scene scene = new Scene(new Group());
		
		stage.setTitle("Sorting Simulator");
		stage.setWidth(WIDTH);
		stage.setHeight(HEIGHT);
		
		final Label label = new Label("Sorting Simulator");
		
		label.setFont(new Font("Arial", 20));
		
		table.setEditable(true);
		
		TableColumn<Sort,String> firstCol = new TableColumn<>("Sort Name");
		firstCol.setMinWidth(150);
		firstCol.setCellValueFactory(new PropertyValueFactory<>("sortName"));
		
		TableColumn<Sort,String> listSizeCol = new TableColumn<>("n");
		listSizeCol.setMinWidth(40);
		listSizeCol.setCellValueFactory(new PropertyValueFactory<>("listSize"));
		
		TableColumn<Sort,String> comparisonCol = new TableColumn<>("Comparisons");
		comparisonCol.setMinWidth(40);
		comparisonCol.setCellValueFactory(new PropertyValueFactory<>("comparisons"));
		
		TableColumn<Sort,String> swapsCol = new TableColumn<>("Swaps");
		swapsCol.setMinWidth(40);
		swapsCol.setCellValueFactory(new PropertyValueFactory<>("swaps"));
		
		TableColumn<Sort,String> runTimeCol = new TableColumn<>("Run Time");
		runTimeCol.setMinWidth(150);
		runTimeCol.setCellValueFactory(new PropertyValueFactory<>("RunTime"));
		
		TableColumn<Sort,String> listCol = new TableColumn<>("Sorted List");
		listCol.setMinWidth(1520);
		listCol.setCellValueFactory(new PropertyValueFactory<>("list"));
		

		
		
		
		table.setItems(data);
		
		table.getColumns().addAll(firstCol, listSizeCol, comparisonCol, swapsCol, runTimeCol, listCol); 
		
		final VBox vBox  = new VBox();
		vBox.setSpacing(5);
		vBox.setPadding(new Insets(10,0,0,10));
		vBox.getChildren().addAll(label,table);
		
		((Group) scene.getRoot()).getChildren().addAll(vBox);
		
		stage.setScene(scene);;
//		stage.setMaximized(true);
//		stage.setFullScreen(true);
		stage.show();
		
	}
	
	getFiles f = new getFiles();
	
	
	ArrayList<Long> Bubble10 = f.copyList(f.ListOf10);
	ArrayList<Long> Bubble100 = f.copyList(f.ListOf100);
	ArrayList<Long> Bubble1k = f.copyList(f.ListOf1k);
	ArrayList<Long> Bubble10k = f.copyList(f.ListOf10k);
	ArrayList<Long> Bubble100k = f.copyList(f.ListOf100k);
	
	ArrayList<Long> Selection10 = f.copyList(f.ListOf10);
	ArrayList<Long> Selection100 = f.copyList(f.ListOf100);
	ArrayList<Long> Selection1k = f.copyList(f.ListOf1k);
	ArrayList<Long> Selection10k = f.copyList(f.ListOf10k);
	ArrayList<Long> Selection100k = f.copyList(f.ListOf100k);
	
	ArrayList<Long> Quick10 = f.copyList(f.ListOf10);
	ArrayList<Long> Quick100 = f.copyList(f.ListOf100);
	ArrayList<Long> Quick1k = f.copyList(f.ListOf1k);
	ArrayList<Long> Quick10k = f.copyList(f.ListOf10k);
	ArrayList<Long> Quick100k = f.copyList(f.ListOf100k);
	
	ArrayList<Long> Merge10 = f.copyList(f.ListOf10);
	ArrayList<Long> Merge100 = f.copyList(f.ListOf100);
	ArrayList<Long> Merge1k = f.copyList(f.ListOf1k);
	ArrayList<Long> Merge10k = f.copyList(f.ListOf10k);
	ArrayList<Long> Merge100k = f.copyList(f.ListOf100k);
	
	ArrayList<Long> Insertion10 = f.copyList(f.ListOf10);
	ArrayList<Long> Insertion100 = f.copyList(f.ListOf100);
	ArrayList<Long> Insertion1k = f.copyList(f.ListOf1k);
	ArrayList<Long> Insertion10k = f.copyList(f.ListOf10k);
	ArrayList<Long> Insertion100k = f.copyList(f.ListOf100k);
	
	ArrayList<Long> Comb10 = f.copyList(f.ListOf10);
	ArrayList<Long> Comb100 = f.copyList(f.ListOf100);
	ArrayList<Long> Comb1k = f.copyList(f.ListOf1k);
	ArrayList<Long> Comb10k = f.copyList(f.ListOf10k);
	ArrayList<Long> Comb100k = f.copyList(f.ListOf100k);
	
	ArrayList<Long> Cocktail10 = f.copyList(f.ListOf10);
	ArrayList<Long> Cocktail100 = f.copyList(f.ListOf100);
	ArrayList<Long> Cocktail1k = f.copyList(f.ListOf1k);
	ArrayList<Long> Cocktail10k = f.copyList(f.ListOf10k);
	ArrayList<Long> Cocktail100k = f.copyList(f.ListOf100k);
	
	ArrayList<Long> Radix10 = f.copyList(f.ListOf10);
	ArrayList<Long> Radix100 = f.copyList(f.ListOf100);
	ArrayList<Long> Radix1k = f.copyList(f.ListOf1k);
	ArrayList<Long> Radix10k = f.copyList(f.ListOf10k);
	ArrayList<Long> Radix100k = f.copyList(f.ListOf100k);
	
	ArrayList<Long> Counting10 = f.copyList(f.ListOf10);
	ArrayList<Long> Counting100 = f.copyList(f.ListOf100);
	ArrayList<Long> Counting1k= f.copyList(f.ListOf1k);
	ArrayList<Long> Counting10k = f.copyList(f.ListOf10k);
	ArrayList<Long> Counting100k = f.copyList(f.ListOf100k);
	
	
	private ObservableList<Sort> data = 
	   FXCollections.observableArrayList(
			   							 new BubbleSort(Bubble10), new BubbleSort(Bubble100), new BubbleSort(Bubble1k), new BubbleSort(Bubble10k), new BubbleSort(Bubble100k),
			   							 new SelectionSort(Selection10), new SelectionSort(Selection100), new SelectionSort(Selection1k), new SelectionSort(Selection10k), new SelectionSort(Selection100k),
			   							 new QuickSort(Quick10), new QuickSort(Quick100), new QuickSort(Quick1k), new QuickSort(Quick10k), new QuickSort(Quick100k),
			   							 new MergeSort(Merge10), new MergeSort(Merge100), new MergeSort(Merge1k), new MergeSort(Merge10k), new MergeSort(Merge100k),
			   							 new InsertionSort(Insertion10), new InsertionSort(Insertion100), new InsertionSort(Insertion1k), new InsertionSort(Insertion10k), new InsertionSort(Insertion100k),
			   							 new CombSort(Comb10), new CombSort(Comb100), new CombSort(Comb1k), new CombSort(Comb10k), new CombSort(Comb100k),
			   							 new CocktailSort(Cocktail10), new CocktailSort(Cocktail100), new CocktailSort(Cocktail1k), new CocktailSort(Cocktail10k), new CocktailSort(Cocktail100k),
			   							 new RadixSort(Radix10), new RadixSort(Radix100), new RadixSort(Radix1k), new RadixSort(Radix10k), new RadixSort(Radix100k),
			   							 new CountingSort(Counting10), new CountingSort(Counting100), new CountingSort(Counting1k), new CountingSort(Counting10k), new CountingSort(Counting100k)
			   							 );
	
}
