package SY;
public class SYMarks{
	private int ComputerTotal;
	private int MathsTotal;
	private int ElectronicsTotal;

	public void getMarks(int CmpTot,int MthTot, int EleTot)
	{
		this.ComputerTotal = CmpTot;
		this.MathsTotal = MthTot;
		this.ElectronicsTotal = EleTot;
		}
	public void displaySyMarks()
	{
		System.out.println("Computer : "+this.ComputerTotal);
		System.out.println("Maths    : "+this.MathsTotal);
		System.out.println("Electronics :"+this.ElectronicsTotal);
	}
	public int getSyComputerTotalMarks()
	{
		return this.ComputerTotal;
	}
}