package Handson_Package;

import java.util.Scanner;

public class stringprogram {
	
	public void usergiven() {
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] happyIndex= {"cool", "perfect", "awesome", "fantastic"};
		String [] sadIndex= {"okay","sorry","repeat","again"};
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your string:");
		String[] given=scan.next().split(" ");;
		
		int hi=0;
		for(int i=0;i<happyIndex.length;i++) {
			
			for(int j=0;j>=0;j++) {
				if(happyIndex[i]==given[j]) {	
					hi++;
					
				}
				
			}
			
		}
	int si=0;	 
for(int k=0;k<sadIndex.length;k++) {
			
			for(int j=0;j>=0;si++) {
				if(happyIndex[k]==given[j]) {
					si++;
				}
				
			}
			
		}
		
		
		if(hi>si) {
			System.out.println("Happy Index");
		}else if(hi<si){
			System.out.println("Negative Index");
		}else {
			System.out.println("Nutral");
		}
		
		
		
		
		
	}

}
