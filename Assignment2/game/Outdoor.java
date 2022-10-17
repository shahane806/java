package game;
public class Outdoor{
	
	private String name;
	 String type;
	 public Outdoor(){}
	public Outdoor(String n,String type){
		this.name = n;
		this.type = type;
	}
	public void display()
	{
		System.out.println("Name :\t"+this.name+"\tGame_Name : \t"+type+"\tType : Outdoor Game. ");
	}
}