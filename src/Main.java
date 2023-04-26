
public class Main {

   static int x = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println("You are in the main class");
		vibhuti();

	    

	       

	}
	
	
	public static void vibhuti() {
		System.out.println("Vibhuti");
		Main m = new Main();
		
		m.vivek();
	}
	
	public  void vivek() {
		System.out.println("Vivek");
		 System.out.println("Hello, World!");
	        for(int i=0; i<5; i++){
	             x++;
	            System.out.println(x);
	        }
	}
	

}
