class CastRunner{

public static void main(String [] arg){

Bag bag=newBag(true,Type.LAPTOPBAG,Gender.MALE,2500.0d);

Bag bag1=new WilCraftBag(3,color,BLUE);

Bag bag2=new AmericanTorister(true,5);

System.out.println(bag.type);
System.out.println(bag2.gender);
System.out.println(bag2.price);


BagOperator operator=new BagOperator();
operator.display(bag);
operator.display(bag1,"rainbow");
operator.display(bag2,7425);


}



}