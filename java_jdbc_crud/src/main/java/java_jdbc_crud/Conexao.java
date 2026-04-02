package java_jdbc_crud;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static String url = "jdbc:postgresql://127.0.0.1:5432/java_db";
	private static String user;
	private static String passWord;
	
	public static Connection conectar() throws SQLException{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter user: ");
		user = sc.nextLine();
		
		System.out.print("Enter passWord: ");
		passWord = sc.nextLine();
		
		return DriverManager.getConnection(url, user, passWord);
	}
}
