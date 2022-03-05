package customer;
import java.util.*;
class Customer{
	private String name,address,type;
	private int  number_of_ampere_hour_metter;
	public Customer(){
		this.name = name;
		this.address = address;
		this.number_of_ampere_hour_metter = number_of_ampere_hour_metter;	
	}
	

	public Customer(String name,String address, int number_of_ampere_hour_metter) {

	}


	public void setter(String name ,String address , int number_of_ampere_hour_metter) {
		this.name = name;
		this.address = address;
		this.number_of_ampere_hour_metter = number_of_ampere_hour_metter;	
	}
	
	public String getname(String name ) {
		return name;
	}
	
	public String getaddress(String address) {
		return address;
	}
	
	public int getnumber(int number_of_ampere_hour_metter) {
		return number_of_ampere_hour_metter * 1234;
	}
	
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("name :");  name = sc.nextLine();
	    System.out.print("address :"); address = sc.nextLine();
	    System.out.print("number of ampere hour metter :"); number_of_ampere_hour_metter = sc.nextInt();
	}
	
	
	
	public void show() { 
	    System.out.print("\n name :" +  name );
	    System.out.print("\n address :" + address ); 
	    System.out.print("\n price:" + getnumber(number_of_ampere_hour_metter)); 
	}
	
	
	
}

class NewCustomer extends Customer{

	 
	 public NewCustomer(String name,String address, int number_of_ampere_hour_metter){
		 super(name,address, number_of_ampere_hour_metter);
	 }
	 
	 public NewCustomer(){
		 
	 }
	 
	 
	 public int getnumber(int number_of_ampere_hour_metter) {
		 if (number_of_ampere_hour_metter < 100) {
			 return number_of_ampere_hour_metter * 1234;
		 }
		 else {
			 return number_of_ampere_hour_metter * 1650;
		 }
	 }
	 
	 public void insert() {
		 Scanner sc = new Scanner(System.in);
		 super.insert();
	 }
	 
	 public void show() {
		 super.show();
	 }
	 
}

public class customers {
    public static void main(String[] args) {
	     Customer cs = new Customer();
	     NewCustomer nc = new NewCustomer();
	     ArrayList<Customer> Customer_list = new ArrayList<>();
	     ArrayList<NewCustomer> NewCustomer_list = new ArrayList<>();
	     Scanner sc = new Scanner(System.in);
	     int num,n;
	     num = sc.nextInt();
	     do {
	         System.out.print("\n -------------------------- ");
	         System.out.print("\n 1. insert old customer ");
	         System.out.print("\n 2. insert new customer  ");
	         System.out.print("\n 3. view old customer ");
	         System.out.print("\n 4. view new customer ");
	         System.out.print("\n 5. view all");
	         System.out.print("\n type :"); 
	         n = sc.nextInt();
	     switch(n) {
	        case 1:
	        	 for (int i = 0;i < num ;i++ ){ 
	   	            cs.insert();
	   	            Customer_list.add(cs);
	   	         System.out.print("\n -------------------------- ");
	   	            n = 0;
	   	       }
	        	 break;
	        case 2:
	        	 for (int i = 0;i < num ;i++ ){ 
	   	             nc.insert();
	   	             NewCustomer_list.add(nc);
	   	          System.out.print("\n --------------------------\n ");
	   	          n = 0;
	   	     }
	        	 break;
	        case 3:
	        	System.out.print("\n ------------Customer--------------\n ");
	        	 if (Customer_list.size() == 0) {
	        		 System.out.print("\n array not set please return ");
	        	 } else {
	        	      for (int i = 0;i < Customer_list.size() ;++i ){ 
	     	             cs.show();
	     	            System.out.print("\n -------------------------- \n");
	     	          }
	        	 }
	        	 System.out.print("\n type 0 to return \n "); ; n = sc.nextInt();
	        	 break;
	        case 4:
	        	System.out.print("\n ------------New Customer-------------- \n");
	        	if (NewCustomer_list.size() == 0) {
	        		 System.out.print("\n array not set please return ");
	        		 
	        	 }else {
	        	 for (int i = 0;i < NewCustomer_list.size() ;++i ){ 
	     	        nc.show();
	     	       System.out.print("\n --------------------------\n ");
	     	     }
	        	 }
	        	 System.out.print("\n type 0 to return \n "); ; n = sc.nextInt();
	        	 break;
	        case 5:
	        	if (NewCustomer_list.size() == 0 || Customer_list.size() == 0) {
	        		 System.out.print("\n NewCustomer or Customer not set please return ");
	        		 System.out.print("\n type 0 to return \n "); ; n = sc.nextInt();
	        		 
	        	 }else {
	        	System.out.print("\n ---------- Customer----------------\n ");
	        	for (int i = 0;i < Customer_list.size() ;++i ){ 
	     	        cs.show();
	     	       System.out.print("\n -------------------------- \n");
	     	     }
	        	System.out.print("\n ------------New Customer-------------- \n ");
	        	 for (int i = 0;i < Customer_list.size() ;++i ){ 
		     	        nc.show();
		     	       System.out.print("\n -------------------------- \n ");
		     	     }
	        	 }
	        	 System.out.print("\n -------------------------- \n ");
	        	 System.out.print("\n type 0 to return \n "); ; n = sc.nextInt();
	        	 break;
	        default:
	        	System.out.print("\n please choice another choice ");
	        	n = 0;
	        	break;
	     }
	     }while (n == 0);
	    
	}
}
