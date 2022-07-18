import java.sql.SQLException;

public class TestRepo {
	public static void main(String[] args) {
		
		RestaurantsRepository repo = new RestaurantsRepository();
		try {
			System.out.println(repo.adds());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
