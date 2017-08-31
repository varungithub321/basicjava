
public class Application {

	public static void main(String[] args) {
		System.out.println("Learning Data Types");
		Movie m1 =  new Movie();
		m1.name = "Inception";
		m1.DirectorName = "Christopher Nolan";
		m1.Lead = "Leonardo DiCaprio";
		m1.ProductionCompany = "Syncopy Inc.";
		m1.Runtime = 148;
		m1.IMDB = 8.8;
		m1.RottToma = 86;
		
		Movie m2 = new Movie();
		m2.name  = "The Godfather II";
		m2.DirectorName = "Francis Ford Coppola";
		m2.Lead = "Al Pacino";
		m2.ProductionCompany = "Paramount Pictures";
		m2.Runtime = 200;
		m2.IMDB = 9;
		m2.RottToma = 97;
		
		System.out.println("The film " + m1.name + " is directed by " + m1.DirectorName + " and starring " + m1.Lead + " . It has a runtime of " + m1.Runtime + " and was distributed by " + m1.ProductionCompany + " . It has a rating of " + m1.IMDB + " on IMDB, and a rating of " + m1.RottToma + " on Rotten Tomatoes.");
		System.out.println("The film " + m2.name + " is directed by " + m2.DirectorName + " and starring " + m2.Lead + " . It has a runtime of " + m2.Runtime + " and was distributed by " + m2.ProductionCompany + " . It has a rating of " + m2.IMDB + " on IMDB, and a rating of " + m2.RottToma + " on Rotten Tomatoes.");
		
		
	}

}
