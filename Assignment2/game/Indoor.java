package game;
public class Indoor{
	private String name;
	String type;
	public Indoor(){}
	public Indoor(String n,String type){
		this.name = n;
		this.type =type;
	}
	public void display()
	{
		System.out.println("Name :\t"+this.name+"\tGame_Name : \t"+type+"\t Type : Indoor Game. ");
	}

}