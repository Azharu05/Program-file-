class Movies{

String story;
String director;
String releaseDate;
int numberOfArtists;

void display()
{
	
	System.out.println("Displaying movie");
	System.out.println("story name" + story);
	System.out.println("director" + director);
	System.out.println("releaseDate" + releaseDate);
	System.out.println("numberOfArtists" + numberOfArtists);
	
}

void collection(int collection)
{
	if (collection>=150)
	{

	System.out.println("Name of the movie is KGF");
	}
	if (collection<=90)
	{
		System.out.println("Average movie");
	}

	
}

}


