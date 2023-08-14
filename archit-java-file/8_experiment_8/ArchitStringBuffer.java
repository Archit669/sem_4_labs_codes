public class ArchitStringBuffer{
	public static void main(String[] args) {
		// create a stringbuilder
		StringBuffer sb = new StringBuffer();

		// append method
        sb.append("archit");
        sb.append(" ");
        sb.append("java!");
        System.out.println(sb.toString()); 

		// insert method
        sb.insert(6,  " learning ");
        System.out.println(sb.toString()); 
		
		//reverse method
        sb.reverse();
        System.out.println(sb.toString());
	}
}
