class Movie{
	String title;
	double score;
	String name;
	int year;
	void print(){
		System.out.printf(" 영화제목: %s, 평점: %.2f, 감독: %s, 개봉년도: %d",title,score,name,year);
	}
}


public class MovieTest{
	public static void main(String args[]){
		Movie movie = new Movie();
		movie.title = "기생충";
		movie.score = 9.8;
		movie.name = "봉준호";
		movie.year = 2019;
		
		movie.print();
	}
}