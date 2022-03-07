class Chocolate{
	
	double money =100.0;
	double chocolatePrice=10.0;
	double fixMoney=money;
	
	void buy(int noofChocolates)
	{
		
		double tempMoney=noofChocolates * chocolatePrice;
		double amount =this.money-tempMoney;
		
		System.out.println("Getting chocolate "+noofChocolates);
		if(fixMoney>tempMoney){
			System.out.println("We can buy no of chocolates");
			double m=this.money/chocolatePrice;
			System.out.println("Still we can buy no of"+m+"chocolates");
		
		}
		else{
			
			double n=fixMoney/chocolatePrice;
			System.out.println("We canot buy extra chocolate "+n);
		}
		
		
	}
	
	
}