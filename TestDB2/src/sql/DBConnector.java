/**
 *
 */
package sql;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
/**
 *<p>MySQL に接続する為のユーティリティクラスです。<br>
 *ルートアカウントにて DB に接続されます。</p>
 *
 */
public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url ="jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";
	private static String user ="root";
	private static String password = "mysql";

	public Connection getConnection(){
		Connection con = null;
		try{
			Class.forName(driverName);
			con = (Connection) DriverManager.getConnection(url,user,password);
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}
