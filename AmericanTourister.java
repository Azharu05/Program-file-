class AmericanTourister extends Bag{

boolean wallet;
int noOfCompartments;


AmericanTourister(boolean wallet,int noOfCompartments)
{
	super(false,Type.HANDBAG,Gender.FEMALE,3000);
	this.wallet=wallet;
	this.noOfCompartments=noOfCompartments;
	System.out.println("The AmericanTourister bag par are we have ");
	
	
}


}