
		import java.util.HashMap;
		import java.util.TreeMap;
public class HashMapDemo {

	public static void main(String[] args) {
		

		
		    HashMap<String,String> hm=new HashMap<String,String>();
		    hm.put("R103","Shivangi");
		    hm.put("R101","Prashant");
		    hm.put("R104","Shivangi");
		    hm.put("R102","Shubham");
		    System.out.println(hm);
		    System.out.println(hm.get("R101"));
		  
		  
		    TreeMap<String,String> hm1=new TreeMap<String,String>();
		  
		    hm1.put("R103","Shivangi");
		    hm1.put("R101","Prashant");
		    hm1.put("R104","Shivangi");
		    hm1.put("R102","Shubham");
		System.out.println(hm1);
		System.out.println(hm.equals(hm1));

		}

	}


