package questions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {

		List<Integer[]> list = new ArrayList<>();
		
		int sonuc =0;
		 Scanner in = new Scanner(System.in);
		
	        int t=in.nextInt();
	       
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            Integer[] dizi = new Integer[n];
	            for(int k=0; k<n; k++){
	            	 int deger = 0; 
	    			for(int j=0; j<=k ; j++){
	    				
	    				deger += (int) (b*(Math.pow(2, j)));
	    				
	    			}   		
	    			
	    			sonuc = a + deger;
	    			dizi[k] = sonuc;
	    			
	    		}
	            list.add(dizi);
	        }
	            
	            
	            for(Integer[] aaaa: list){
	            	for(Integer iii: aaaa)
	            		System.out.print(iii +" ");
	            	System.out.println();
	            }
	          
	            
	       
	        
	        in.close();
		
		
	}
	
}
