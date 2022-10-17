package TY;
public class TYMarks{
private int theory;
private int practical;
private int TotalTy;
public void getMarks(int theory,int practical)
{
	this.theory = theory;
	this.practical = practical;
	this.TotalTy = theory + practical;
}
public void displayTyMarks(){
	System.out.println("Theory  : "+this.theory);
	System.out.println("Practical: "+this.practical);
}
public int getTyComputerTotalMarks()
{
	return this.TotalTy;
}
}