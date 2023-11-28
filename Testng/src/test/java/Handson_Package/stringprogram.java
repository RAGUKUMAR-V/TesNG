package Handson_Package;

import java.util.Scanner;

public class stringprogram {
	
	public void usergiven() {
		
	}
	public static void main(String[] args) {
		
		String [] happyIndex= {"cool", "perfect", "awesome", "fantastic"};
		String [] sadIndex= {"okay","sorry","repeat","again"};
		
		String scan="sorry perfect perfect sorry sorry perfect perfect";
		String[] given=scan.split(" ");;
		
		int hi=0;
		for(int i=0;i<happyIndex.length;i++) {
			
			for(int j=0;j<given.length;j++) {
				if(happyIndex[i].equals(given[j])) {	
					hi++;
					
				}}}
	int si=0;	 
for(int k=0;k<sadIndex.length;k++) {
			
			for(int j=0;j<given.length;j++) {
				if(sadIndex[k].equals(given[j])) {
					si++;
				}}}
		if(hi>si) {
			System.out.println("Happy Index");
		}else if(hi<si){
			System.out.println("Negative Index");
		}else {
			System.out.println("Nutral");
		}
		
	}

}
