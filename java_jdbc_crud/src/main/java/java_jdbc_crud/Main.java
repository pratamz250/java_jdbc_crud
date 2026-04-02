package java_jdbc_crud;

import java.sql.Connection;

public class Main {
	public static void main(String args[]) {
		try(Connection conn = Conexao.conectar()){
			System.out.println("Conectado!");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
