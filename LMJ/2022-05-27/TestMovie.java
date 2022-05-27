public class TestMovie{
	public static void main(String args[]){
		Movie movie = new Movie();
		
		movie.title = "범죄도시2";
		movie.score = 9.04;
		movie.director = "이상용";
		movie.year = 2022;
		
		movie.moviePrint();
	}
}