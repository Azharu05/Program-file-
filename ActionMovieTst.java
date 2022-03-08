class ActionMovieTst{

public static void main(String[] ags){
	
	Movies movies=new Movies();
	movies.story="KGF -ch01";
	movies.director="Prashanth ";
	movies.releaseDate="21 may 2018";
	movies.numberOfArtists=10000;
	
	movies.display();
	movies.collection(50000000);
	
	
	ActionMovie actionmovie=new ActionMovie();
	actionmovie.collectionsFirstWeek=500000000;
	actionmovie.collectionsRestOftheDays=10000000;
	actionmovie.status();
	
	
	HorrorMovie horrormovie=new HorrorMovie();
	horrormovie.movieName="NUN";
	System.out.println(horrormovie.movieName);
	System.out.println(horrormovie.released);
	
    	
}



}