
public class NextHundred01 {

	public static void main(String[] args) {
		int a;
		int number=1506;
		
		

	}
    
	public static int nextmulltiple100(int a,int num) {
		if (num % 10 != 0) {
			a = ((num + 99) / 100) * 100;
			System.out.println(a);
		}
		else{
			
			System.out.println(num+100);
		}
		
		return a;
	}
}
