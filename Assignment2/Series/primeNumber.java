package Series;

public class primeNumber {
    public int primeN(int n) {
		
			
			for(int i = 2; i*i<=n;i++)
			{
				if(n%i == 0)
				{
					return 0;
				}
			}
			
		
		return 1;
	}  
}  
    

    


