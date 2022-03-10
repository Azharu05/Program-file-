class WildcraftBag extends Bag{
  
int warrentyPeriod;
Colour colour;

WildCraftBag(int warrentyPeriod,Colour colour)

{
	super(true,Type.LAPTOPBAG,Gender.MALE,2500.0d);
	this.warrentyPeriod=warrentyPeriod;
	this.colour=colour;
	System.out.println("The warrentyPeriod of bag is " + warrentyPeriod);
	
} 


     
}