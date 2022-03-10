class BagOperator{

void display(Bag bag)
{
	if (bag instanceof Bag)
	{
		System.out.println(bag.price);
	}else{
		System.out.println("bag is not instance of bag");
	}
}
void display(Bag bag1,String name)
{
	if(bag1 instanceof WildcraftBag)
	{
		WildcraftBag casted1=(WildcraftBag)bag1;
		System.out.println(casted1.warrentyPeriod);
		System.out.println(name);
		
	}
}
void display(Bag bag2,int num)
{
	if(bag2 instanceof AmericanTorister)
	{
		AmericanTorister casted2n=(AmericanTorister)bag2;
		System.out.println(casted2.noOfCompartments);
		System.out.println(casted2.wallet);
		System.out.println(bag.price);
		
	}else{
		System.out.println("bag is not instance of bag");
	}
	
}

void display(Bag bag1,String name)
{
	if(bag1 instanceof WildcraftBag)
	{
		WildCraftBag casted1=(WildCraftBag)bag1;
		System.out.println(casted1.warrentyPeriod);
		System.out.println(name);
	}
	
}

void display(Bag bag2,int num)
{
	if(bag2 instanceof AmericanTorister)
	{
		AmericanTorister casted2=(AmericanTorister)bag2;
		System.out.println(casted2.noOfCompartments);
		System.out.println(casted2.wallet);
		System.out.println(num);
	}
}

}