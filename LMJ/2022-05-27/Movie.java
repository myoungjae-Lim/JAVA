public class Movie{
	String title;
	double score;
	String director;
	int year;
	
	public void moviePrint(){
		System.out.printf("제목:%s\n평점:%.1f\n감독:%s\n발표된 연도:%d\n", title, score, director, year);
		
	}
}