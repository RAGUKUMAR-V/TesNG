package Testng;

public class newone extends old{
	
	
	String parent;
	String name="Ragu";
	
	 int id;
	newone(){
		this.name=super.name;
	
	}
	public  void method() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int number=123;
	       String newnumber= String.valueOf(number);
	       String reverse="";
	       for(int i=newnumber.length()-1;i>=0;i--){
	           reverse=reverse+newnumber.charAt(i);
	       }
	       System.out.println(reverse);
	       
	       newone one=new newone();
	       one.method();
		
	}

}
