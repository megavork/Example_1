package proj_1;


public class Data_c {
	
	private String name = "";
	private int countData = 0;
	private double costData = 0;
	private double our_cost = 0;

	public Data_c(String name,int count ,double cost) {
		this.name = name;
		this.countData = count;
		this.costData = cost;
		this.our_cost = countData * costData;
	}
	
	public String get_name() {
		return this.name;
	}
	
	public int get_count() {
		return this.countData;
	}
	
	public double get_cost() {
		return this.costData;
	}
	
	public double get_all_cost() {
		return our_cost;
	}
	
//***********************************************************
//				edit all fields
//**********************************************************
	public void edit_name(String new_name) {
		this.name = new_name;
	}
	
	public void edit_count(int new_count) {
		this.countData = new_count;
		this.our_cost = this.costData * this.countData;
	}
	
	public void edit_cost(double new_cost) {
		this.costData = new_cost;
		this.our_cost = this.costData * this.countData;
	}
	
	
}
