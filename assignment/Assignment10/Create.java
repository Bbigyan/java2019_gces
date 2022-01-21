import java.sql.SQLException;

public class Create {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PrepareSQL sql = new PrepareSQL();
		sql.prepare();
		String query = "INSERT INTO students (`Roll_No`,`Name`,`Address`,`Semester`) VALUES"
				+ "('9','bigyan ','bagar','3'),('6','John Eoe','ABC','7')";
		int change = sql.statement.executeUpdate(query);
		System.out.println("Inserted "+change+" rows of data.");
	}
}
