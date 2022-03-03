class DisplayMovie{

String [] movieNames=new String[20];
int tempValue=0;

void DisplayMovieNames(String movieName)

{
	System.out.println("MOVIE NAMES ="+movieNames);
	this.movieNames[tempValue]=movieName;
	tempValue=tempValue+1;
	
}

void displayMovieNames()
{
	
	for(int n=0;n<movieNames.length;n++)
	{
		System.out.println("The Movies Name =");
		String movieName=this.movieNames[n];
		System.out.println(movieName);
	}
}



}