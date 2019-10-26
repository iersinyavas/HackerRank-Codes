//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String, String> directory = new HashMap<String, String>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			String phone= in.nextLine();
            if(phone.length()!=8 || phone.charAt(0)=='0'){
                //if(i==0){}
                //else{i--;}
            }else{
                directory.put(name, phone);
            }
		}
        
        ArrayList<String> names = new ArrayList<String>();
        while(in.hasNext()){
            names.add(in.nextLine());
        }

		for(String name : names) 
		{
            if(directory.containsKey(name))
			    System.out.println(name+"="+directory.get(name));
            else{
                System.out.println("Not found");
            }
		}
	}
}



