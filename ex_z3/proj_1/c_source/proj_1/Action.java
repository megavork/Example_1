package proj_1;

import proj_1.Data_c;
import java.util.ArrayList;
import java.util.Scanner;

public class Action {

	private ArrayList<Data_c> list;
	Scanner text = new Scanner(System.in);
	
	public Action() {
		list = new ArrayList<Data_c>();
	}
	
	//добавить элементы
	public void add_elevents() {
		
		System.out.print("Enter how many elements you want to added: ");
		int count = Integer.parseInt(text.nextLine());
		System.out.println();
		
		for (int i = 0; i < count; i++) {
			System.out.print("Enter Name: ");
			String temp_name = text.nextLine();
			//System.out.println();
			//*
			System.out.print("Enter count: ");
			int temp_count = Integer.parseInt(text.nextLine());
			//System.out.println();
			//*
			System.out.print("Enter cost: ");
			int temp_cost = Integer.parseInt(text.nextLine());
			//System.out.println();
			
			Data_c obj = new Data_c(temp_name, temp_count, temp_cost);
			list.add(obj);
		}
		this.menu();
	}
	
	//показать всё
	public void show_all() {
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + "			" + list.get(i).get_name() + "			" + list.get(i).get_count() +
								"		" + list.get(i).get_cost() + "			" + list.get(i).get_all_cost());
		}
		this.menu();
	}
	
	//удалить
	public void remove_element() {
		System.out.print("Enter number of element which need to remove: ");
		int number = Integer.parseInt(text.nextLine()) - 1;
		System.out.println();
		
		list.remove(list.get(number));
		
		this.show_all();
		
		this.menu();
	}
	
	//редактировать элементы
	public void edit_elements() {
		
		System.out.print("Enter number of element which need to edit: ");
		int number = Integer.parseInt(text.nextLine()) - 1;
		
		System.out.print("Enter Name: ");
		list.get(number).edit_name(text.nextLine());
		//*
		System.out.print("Enter count: ");
		
//check true count	
		int tmp_count = Integer.parseInt(text.nextLine());
		
		while(tmp_count < 0) {
			System.out.print("Error. Rewrite integer value! ");
			tmp_count = Integer.parseInt(text.nextLine());
		}
//end check		
		list.get(number).edit_count(tmp_count);
		//*
		System.out.print("Enter cost: ");
//check true cost		
		int tmp_cost = Integer.parseInt(text.nextLine());
		
		while(tmp_cost < 0) {
			System.out.print("Error. Rewrite integer value! ");
			tmp_cost = Integer.parseInt(text.nextLine());
		}
//end check	
		list.get(number).edit_cost(tmp_cost);
		
		this.menu();
	}
	
	protected void menu() {
		
		for (int i = 0; i != 2 ; i++) {
			System.out.println("Menu");
			System.out.println("1. Enter 1 to Show all table.");
			System.out.println("2. Enter 2 to Added new element.");
			System.out.println("3. Enter 3 to Remove some element.");
			System.out.println("4. Enter 4 to Edit some element.");
			System.out.println("5. Enter 5 to Get random element.");
			
			System.out.print("Enter number: ");

			switch (Integer.parseInt(text.nextLine())) {
			case 1: this.show_all(); i=0;
				break;
			case 2: this.add_elevents(); i=0;
				break;
			case 3: this.remove_element(); i=0;
				break;
			case 4: this.edit_elements(); i=0;
				break;
			case 5: temp_get_all();	i=0;
				break;
			default: i=2;
				break;
			}
		}

		
		
	}
	
	
//only for testing
	protected void temp_get_all() {
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {

			String temp_name = "Name_" + (i+1);
			//System.out.println();
			//*
			int temp_count = i * 100 * i *3 + i/2;
			//System.out.println();
			//*
			double temp_cost = (i * 100 * i *3 + i/2) * 1.1;
			//System.out.println();
			
			Data_c obj = new Data_c(temp_name, temp_count, temp_cost);
			list.add(obj);
			
		}
		
		this.show_all();
		this.menu();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
