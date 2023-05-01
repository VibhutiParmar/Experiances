
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "lamal";
		String r = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			r = r + s.charAt(i);

			
			
		}
		System.out.println(r);
		if(s.equalsIgnoreCase(r)) {
			System.out.println("String is polindrom");
		}

	}

}
